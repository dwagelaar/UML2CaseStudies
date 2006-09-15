/*
 * Stream.java
 *
 * Created on April 21, 2003, 11:00 PM
 * Copyright (c) 2003, Sean M. Meiners, sean@jabberwookie.com
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright notice,
 *       this list of conditions and the following disclaimer in the documentation
 *       and/or other materials provided with the distribution.
 *     * Neither the name of JabberWookie nor the names of its contributors may be used
 *       to endorse or promote products derived from this software without specific
 *       prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.jabberwookie;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import java.util.Stack;
import java.util.Vector;
import java.util.Hashtable;

import com.jabberwookie.ns.jabber.Const;
import com.jabberwookie.ns.jabber.Chunk;
import com.jabberwookie.ns.jabber.IQ;
import com.jabberwookie.ns.jabber.Message;
import com.jabberwookie.ns.jabber.Presence;

import com.ssttr.xml.SAXParser;
import com.ssttr.xml.SAXInterface;
import com.ssttr.xml.XMLElement;
import com.ssttr.xml.ParserException;

import com.ssttr.util.processor.Processor;

/**
 * This implements the most basic functions required to establish and
 * maintain a Jabber stream.  It must be extended to be truely useful.
 * Currently this is done by the {@link Client2Server} and 
 * {@link Component2Server} classes.
 * @author  smeiners
 * @author  dwagelaar
 */
public abstract class Stream implements SAXInterface
{
//    protected static final boolean    DEBUG           = true;
    protected static final  boolean     DEBUG           = false;
    
    /** How long to wait before giving up on trying to process
     * a chunk. (but only if you're using a Processor) */
    protected static final  int         PROCESSOR_WAIT_TIME = 10000;
    
    /* these are only used in makeRandomID, which isn't used.
    protected static final  Random      random          = new Random();
    protected static final  byte        _a_             = (byte)'a';
    protected static final  byte        _A_             = (byte)'A';
    protected static final  byte        _0_             = (byte)'0';
    */
    
    protected DataInputStream           in              = null;
    protected OutputStream              out             = null;
    protected Writer                    outWriter       = null;
    
    protected ParserThread              parserT         = null;
    
    protected Processor                 processor       = null;
    protected Vector                    chunkQueue      = null;
    protected ChunkProcessor            chunkProcessor  = null;
    
    protected MessageListener           mListener       = null;
    protected PresenceListener          pListener       = null;
    protected IQListener                iqListener      = null;
    protected UnrecognizedChunkListener unListener      = null;
    
    protected boolean                   connected       = false;
    protected String                    connectionId    = null;
    
    protected Namespaces                ns              = null;
    
    protected Hashtable                 waitingIds      = new Hashtable(11);
    
    private   XMLElement                el              = null;
    private   Chunk                     chunk           = null;
    private   Stack                     elStack         = new Stack();
    
    /** Creates a new instance of Stream.  If you use this constuctor
     * it will block on any calls to your *Listeners. */
    public Stream (InputStream in, OutputStream out)
    {
        this(in,out,null);
    }
    
    /** Creates a new instance of Stream.  If you use this constructor
     * and pass in a valid Processor it will call your *Listeners as
     * fast as the Processor allows (when there is data available, of
     * course). */
    public Stream (InputStream in, OutputStream out, Processor processor)
    {
        if( in instanceof DataInputStream )
            this.in = (DataInputStream)in;
        else
            this.in = new DataInputStream(in);
        
        this.out = out;
        // BufferedWriter is not supported in MIDP
        //outWriter = new BufferedWriter(new OutputStreamWriter(out));
        outWriter = new OutputStreamWriter(out);
        
        parserT = new ParserThread();
        
        setProcessor(processor);
    }
    
    /**
     * Sets the internal Processor used when calling your *Listeners.
     * If you're going to take a while to process chunks it's highly
     * recomended that you not only use a Processor, but that you
     * use one with either a large queue, a lot of threads, or both.
     * This is because if your processor refuses to accept a chunk
     * for more than 10 seconds it will give up and drop it on the
     * floor.  No, this isn't the best behavior, but it is easily
     * avoidable, just be careful.
     * @param processor
     */
    public void setProcessor(Processor processor)
    {
        this.processor = processor;
        
        if( processor == null )
        {
            chunkQueue = null;
            chunkProcessor = null;
        }
        else
        {
            chunkQueue = new Vector(processor.getMaxTasks());
            chunkProcessor = new ChunkProcessor();
        }
    }

    /**
     * Sets the namespaces used when interpreting incoming data.
     * If you don't know what the namespaces are I would suggest
     * reading some of the Jabber protocol documentation.
     * @param namespaces
     */    
    public void setNamespaces(Namespaces namespaces)
    { ns = namespaces; }
    
    /**
     * Opens the stream, needs to be impelmented by the subclass.
     * @param serverName
     * @param timeoutSecs
     * @return
     * @throws IOException
     */
    public abstract boolean open(String serverName, int timeoutSecs)
        throws IOException;
    
    /**
     * Closes the stream, needs to be impelmented by the subclass.
     */
    public abstract void close();
    
    /**
     * Sends the chunk to the other end and returns immediatly.
     * @param chunk
     * @throws IOException
     */
    public void send(Chunk chunk)
    throws IOException
    { send(chunk, -1); }
    
    /**
     * Sends the chunk to the other end and waits for a reply.
     * 
     * @param chunk
     * @param timeoutMillis
     * @return
     * @throws IOException
     */
    public Chunk send(Chunk chunk, int timeoutMillis)
    throws IOException
    {
        if( ! connected )
            throw new IOException("Not connected");
            
        if( chunk == null )
            return null;
        
        if( DEBUG )
            System.out.println("SEND: " + chunk);
        
        String id = null;
        if( timeoutMillis > 0 )
        {
            id = chunk.getId();
/*
            if( id == null )
                id = makeRandomID();
*/
            waitingIds.put( id, "");
        }
        
        chunk.writeTo(outWriter);
        outWriter.flush();
        
        if( timeoutMillis > 0 )
            return waitForId(id, timeoutMillis);
        else
            return null;
    }
    
    /**
     * Blocks until the given message id is received. 
     * @param id
     * @param timeoutMillis
     * @return
     */
    synchronized private Chunk waitForId(String id, int timeoutMillis)
    {
        long stopTime = System.currentTimeMillis() + timeoutMillis;
        Object o;
        
        for( ; ; )
        {
            if( waitingIds.containsKey(id) )
            {
                o = waitingIds.get(id);
                if( o instanceof Chunk )
                {
                    waitingIds.remove(id);
                    return (Chunk)o;
                }
            }
            
            if( System.currentTimeMillis() > stopTime )
                return null;
            
            try
            { wait (50); }
            catch( InterruptedException x )
            { }
        }
    }
    
    public boolean isConnected()
    { return connected; }
    
    public String getConnectionId()
    { return connectionId; }
    
    public void setMessageListener(MessageListener listener)
    { mListener = listener; }
    
    public void setPresenceListener(PresenceListener listener)
    { pListener = listener; }
    
    public void setIQListener(IQListener listener)
    { iqListener = listener; }
    
    public void setUnrecogizedChunkListener(UnrecognizedChunkListener listener)
    { unListener = listener; }
    
    /** Does NOT set the UnrecogizedChunkListener.
     * This will only work it the passed listener implements
     * MessageListener, PresenceListener, and IQListener.  If not
     * it will throw a ClassCastException.
     */
    public void setAllListeners(Object listener)
    {
        mListener = (MessageListener)listener;
        pListener = (PresenceListener)listener;
        iqListener = (IQListener)listener;
    }
    
    /**
     * Signals waitForID that a new message came in and it should
     * check it.
     * @param id
     * @param chunk
     */
    synchronized private void gotId(String id, Chunk chunk)
    {
        waitingIds.put(id,chunk);
        notifyAll();
    }
    
    /**
     * Receives data from the XML parser and maps it to the
     * appropriate namespace when possible.
     * @author smeiners
     */
    private class ParserThread
    extends Thread
    {
        private   SAXParser parser;
            
        ParserThread()
        {
            parser = new SAXParser(Stream.this);
            start();
        }
        
        public void run()
        {
            try
            { parser.parse (in); }
            
            catch( ParserException x )
            { connected = false; x.printStackTrace(); }
            
            catch( EOFException x )
            { connected = false; }
            
            catch( IOException x )
            { connected = false; }
        }
    }
        
    public void cData (String data)
    {
        if( DEBUG )
            System.out.println("cData: '"+data+"'");

        el = (XMLElement)elStack.peek();
    	el.appendValue(data);
    }

    public void chunkStart (String tag, Hashtable attrs)
    {
        if( DEBUG )
            System.out.println("chunkStart "+tag);

        if( tag.equals(Const.MESSAGE) )
        {
            el = new Message();
            el.setAttributes(attrs);
        }
        else if( tag.equals(Const.PRESENCE) )
        {
            el = new Presence();
            el.setAttributes(attrs);
        }
        else if( tag.equals(Const.IQ) )
        {
            el = new IQ();
            el.setAttributes(attrs);
        }
        else
        {
            el = new Chunk(tag);
            el.setAttributes(attrs);
        }

        elStack.push(el);
    }

    public void docStart (String tag, Hashtable attrs)
    {
        if( DEBUG )
            System.out.println("docStart " + tag + " = " + attrs);

        if( tag.equals("stream:stream") )
        {
            connected = true;
            connectionId = (String)attrs.get(Const.ID);
        }
    }

    public void elementStart (String tag, Hashtable attrs)
    {
        if( DEBUG )
            System.out.println("elementStart: '"+tag+"' "+attrs);

        el = ns.getElement( (String)attrs.get("xmlns"), tag );
        if( el == null ) {
            el = ((XMLElement)elStack.peek()).addChild(tag,attrs);
        } else {
            el.setAttributes(attrs);
            ((XMLElement)elStack.peek()).addChild(el);
        }
        elStack.push(el);
    }

    public void elementStop (String tag)
    {
        if( DEBUG )
            System.out.println("elementStop: '"+tag+"'");

        elStack.pop();
    }

    public void chunkStop (String tag)
    {
        chunk = (Chunk)elStack.pop();

        if( DEBUG )
            System.out.println("RECV: "+chunk);

        if( waitingIds.size() > 0 )
        {
            String id = chunk.getId();
            if( id != null && waitingIds.containsKey(id) )
            {
                gotId(id, chunk);
                return;
            }
        }

        if( processor == null )
            processChunk(chunk);
        else
        {
            // keep attempting to process the chunk until it succeeds
            // or we run out of time.
            chunkQueue.addElement(chunk);
            if( ! processor.process(chunkProcessor) )
            {
                long stopTime = System.currentTimeMillis() + PROCESSOR_WAIT_TIME;
                boolean processed = false;
                
                while( ! processed && System.currentTimeMillis() < stopTime )
                {
                    try
                    { Thread.sleep(5); }
                    catch( InterruptedException x )
                    { }
                    processed = processor.process(chunkProcessor);
                }
                
                if( ! processed )
                {
                    System.err.println("!!SEVERE!! "+this.getClass().getName()+" was not able to process a chunk within "+PROCESSOR_WAIT_TIME+" milliseconds, the chunk will be dropped.\n" +
                                       "  Chunk: '"+chunk+"'");
                }
            }
        }
    }
    
    public void processChunk(Chunk chunk)
    {
        switch (chunk.getTypeInt())
        {
            case Chunk.Type.MESSAGE:
                if( mListener != null )
                    mListener.incomingMessage((Message)chunk);
                break;
            case Chunk.Type.PRESENCE:
                if( pListener != null )
                    pListener.incomingPresence((Presence)chunk);
                break;
            case Chunk.Type.IQ:
                if( iqListener != null )
                    iqListener.incomingIQ((IQ)chunk);
                break;
            default:
            {
                if( chunk.getName().equals("stream:error") )
                {
                    close();
                    break;
                }
                if( unListener != null )
                    unListener.incomingChunk(chunk);
                else
                    System.err.println(this.getClass().getName()+": Unrecognized chunk received: '"+chunk+"'");
            }
        }
    }

    public void docStop (String tag)
    {
        if( DEBUG )
            System.out.println("docStop "+tag);

        connected = false;
    }

    public void processingInstruction (String element)
    {
        if( DEBUG )
            System.out.println("pI: '"+element+"'");
    }

    public void dtdData (String dtd)
    {
        if( DEBUG )
            System.out.println("dtdData: '"+dtd+"'");
    }

    private class ChunkProcessor
    implements Runnable
    {
        public synchronized void run()
        {
            Chunk chunk = null;
            
            chunk = (Chunk)chunkQueue.elementAt(0);
            chunkQueue.removeElementAt(0);
            processChunk(chunk);
        }
    }
/*    
    private String makeRandomID()
    {
        StringBuffer id = new StringBuffer();
        int c = 0;
        int r = 0;
        
        for( int i = 20; i > 0; i -- )
        {
            c = random.nextInt();
            c %= 26 * 2 + 10;
            r = c / 26;
            c %= 26;
            
            switch( r )
            {
                case 0:
                    id.append( (byte)(c + _a_) );
                    break;
                case 1:
                    id.append( (byte)(c + _A_) );
                    break;
                default:
                    id.append( (byte)(c + _0_) );
                    break;
            }
        }
        
        return id.toString();
    }
*/
}
