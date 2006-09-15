/*
 * Client2Server.java
 *
 * Created on May 16, 2003, 4:02 PM
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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.util.Hashtable;

import com.jabberwookie.ns.jabber.Const;
import com.jabberwookie.ns.jabber.Chunk;
import com.jabberwookie.ns.jabber.iq.IQAuth;

import com.ssttr.util.processor.Processor;

/**
 * This implements the most common form of Jabber stream.  That of
 * a client (user) connecting to the server (usually for IM).
 * @author  smeiners
 */
public class Client2Server
extends Stream
{
    
    public static final int         LOGIN_BAD_PASS  = -2;
    public static final int         LOGIN_BAD_UID   = -1;
    public static final int         LOGIN_FAILED    = 0;
    public static final int         LOGIN_OK        = 1;
    public static final int         LOGIN_PASS_EXP  = 2;
    
    private String                  serverName      = null;

    private static final String     STREAM_OPENER   =
    "<stream:stream xmlns:stream='http://etherx.jabber.org/streams' " +
    "xmlns='jabber:client' to='";
    
    private static final String     STREAM_CLOSER   =
    "</stream:stream>";
    
    /** Creates a new instance of Client2Server.  Since this class
     * doesn't understand what a Socket is you'll have to open
     * one youself and then pass in the input and output stream. */
    public Client2Server(InputStream in, OutputStream out) {
        super(in,out);
    }
    
    /** Creates a new instance of Client2Server.  Since this class
     * doesn't understand what a Socket is you'll have to open
     * one youself and then pass in the input and output stream.
     * Please see the documentation for
     * {@link Stream#Stream(InputStream,OutputStream,Processor)}
     * and {@link Stream#setProcessor} for more information about
     * the Processor. */
    public Client2Server(InputStream in, OutputStream out, Processor processor) {
        super(in,out,processor);
    }
    
    /** Gets the name of the server as returned by the server. */
    public String getServerName()
    { return serverName; }
    
    /**
     * Opens the stream, but does not login.  Use {@link #login}
     * to do that.
     * @see com.jabberwookie.Stream#open(java.lang.String, int)
     */
    public boolean open(String serverName, int timeoutMillis)
    throws IOException
    {
        if( DEBUG )
            System.out.println("SEND: " + (STREAM_OPENER + serverName + "'>"));

        if( ns == null )
            ns = new Namespaces();
        
        out.write( (STREAM_OPENER + serverName + "'>").getBytes() );
        out.flush();
        
        long stopTime = System.currentTimeMillis() + timeoutMillis;
        while( ! connected && System.currentTimeMillis() < stopTime )
        {
            try
            { Thread.sleep(5); }
            catch( InterruptedException x )
            { }
        }
        
        return connected;
    }
    
    /**
     * Closes down the stream.  And effectivly logs out.
     */
    public synchronized void close()
    {
        try
        {
            if( DEBUG )
                System.out.println("SEND: " + (STREAM_CLOSER));
                
            if( out != null )
            {
                out.write ( STREAM_CLOSER.getBytes () );
                out.flush();
            }
        }
        catch( IOException x )
        { }
        
        if( in != null )
            try
            { in.close(); }
            catch( IOException x )
            { }

        if( out != null )        
            try
            { out.close(); }
            catch( IOException x )
            { }
        
        connected = false;
        in = null;
        out = null;
    }
    
    /** 
     * Overrides the docStart from Stream in order to catch
     * the server name.
     */
    public void docStart (String tag, Hashtable attrs)
    {
        if( tag.equals("stream:stream") )
        {
            serverName = (String)attrs.get("from");
        }

        super.docStart(tag, attrs);
    }
    
    /**
     * Logs in useing any suppored authentication mechanism, in the
     * order of most to least secure.
     * @param userName Full JID (minus the resource)
     * @param resource
     * @param password
     * @param timeOut How long to wait before giving up.
     * @return One of the following: {@link #LOGIN_BAD_PASS},
     * {@link #LOGIN_BAD_UID}, {@link #LOGIN_FAILED},
     * {@link #LOGIN_PASS_EXP}, or {@link LOGIN_OK}.
     */
    public int loginAny
    (String userName, String resource, String password, int timeOut)
    {
        return login(userName, resource, password, IQAuth.LEVEL_PLAINTEXT, IQAuth.LEVEL_ZERO_K, timeOut);
    }

    /**
     * Attempts to login via digest authentication or stronger
     * only. 
     * @param userName Full JID (minus the resource)
     * @param resource
     * @param password
     * @param timeOut How long to wait before giving up.
     * @return One of the following: {@link #LOGIN_BAD_PASS},
     * {@link #LOGIN_BAD_UID}, {@link #LOGIN_FAILED},
     * {@link #LOGIN_PASS_EXP}, or {@link LOGIN_OK}.
     */    
    public int loginDigest
    (String userName, String resource, String password, int timeOut)
    {
        return login(userName, resource, password, IQAuth.LEVEL_DIGEST, IQAuth.LEVEL_ZERO_K, timeOut);
    }
    
    /**
     * Attempts to login with Zero Knowledge authentication only. 
     * @param userName Full JID (minus the resource)
     * @param resource
     * @param password
     * @param timeOut How long to wait before giving up.
     * @return One of the following: {@link #LOGIN_BAD_PASS},
     * {@link #LOGIN_BAD_UID}, {@link #LOGIN_FAILED},
     * {@link #LOGIN_PASS_EXP}, or {@link LOGIN_OK}.
     */
    public int loginZeroK
    (String userName, String resource, String password, int timeOut)
    {
        return login(userName, resource, password, IQAuth.LEVEL_ZERO_K, IQAuth.LEVEL_ZERO_K, timeOut);
    }
    
    /**
     * Will login with the specified authentication mechanisms. 
     * @param userName Full JID (minus the resource)
     * @param resource
     * @param password
     * @param minLevel The minimum requested authentication level.
     * One of {@link IQAuth#LEVEL_PLAINTEXT},
     * {@link IQAuth#LEVEL_DIGEST}, or {@link IQAuth#LEVEL_ZERO_K}.
     * @param maxLevel The maximum requested authentication level.
     * One of {@link IQAuth#LEVEL_PLAINTEXT},
     * {@link IQAuth#LEVEL_DIGEST}, or {@link IQAuth#LEVEL_ZERO_K}.
     * @param timeOut How long to wait before giving up.
     * @return One of the following: {@link #LOGIN_BAD_PASS},
     * {@link #LOGIN_BAD_UID}, {@link #LOGIN_FAILED},
     * {@link #LOGIN_PASS_EXP}, or {@link LOGIN_OK}.
     */
    public int login
    (String userName, String resource, String password, int minLevel, int maxLevel, int timeOut)
    {
        try
        {
            Chunk chunk = send(
                IQAuth.createGetRequest(getServerName(),userName),
                timeOut
            );

            if( chunk == null || ! chunk.getType().equals("result") )
                return LOGIN_BAD_UID;

            chunk = send(
                IQAuth.createSetRequest(this, chunk, resource, password, minLevel, maxLevel),
                timeOut
            );

            if( chunk == null || ! chunk.getType().equals("result") )
                return LOGIN_BAD_PASS;
            
            if( chunk.getChildValueLong(Const.SEQUENCE, -1) == 1 )
                return LOGIN_PASS_EXP;

            return LOGIN_OK;
        }
        catch( IOException x )
        {
            x.printStackTrace();
            return LOGIN_FAILED;
        }
    }
    
}
