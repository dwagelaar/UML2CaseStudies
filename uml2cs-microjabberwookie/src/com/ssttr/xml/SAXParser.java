/*
 * SAXParser.java
 *
 * Created on April 16, 2003, 8:05 PM
 * Copyright (c) 2003, Sean M. Meiners, sean@ssttr.com
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
 *     * Neither the name of SSTTR nor the names of its contributors may be used
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

package com.ssttr.xml;

import java.util.Stack;
import java.util.Hashtable;

import java.io.IOException;
import java.io.DataInputStream;

/**
 * This is a SAX style XML parser that can handle most (good) XML you are
 * likely to pass it.  It has been my experience that XML documents follow
 * the 80/20 rule.  It seems that 80% of the time only 20% of XML's total
 * functionality is used.  This is the pricipal that this parser was written on.
 * Also, I should note that it was written with the assumption that it would
 * only ever have to deal with documents created by (correctly functioning)
 * software or people who have a good handle on the basics of the specification.
 * Thus, it will fail hard if it comes across any bad formating and (usually)
 * give you at least a hint as to why.
 * <p>
 * It is also worth noting that this parser was originally developed with the
 * intent of connecting it to a Jabber server.  Therefore it has some extra
 * SAX calls that would be unecessary in a normal parser.
 * <p>
 * <pre>
 * Currently supported tags:
 *  comments with ANY data in between the &lt;!-- and --&gt;
 *  full character data with ANY data between &lt;![CDATA[ and ]]&gt;
 * Currently UNsupported tags:
 *  DTD elements (ie: !DOCTYPE, !ELEMENT, & !ATTLIST).
 *  These are treated like extended character data (&lt;![CDATA ]]&gt;) tags
 * Currently supported entities:
 *  all standard XML entities ( &amp;lt; &amp;gt; &amp;quot; &amp;apos; and &amp;amp; ).
 *  all other entities are left alone
 * Performs validataion on most elements
 * </pre>
 * @author  smeiners
 */
public class SAXParser
{
    private SAXInterface parser;
    
    /** Creates a new instance of Parser
     * @throws NullPointerException if parser == null
     */
    public SAXParser (SAXInterface parser)
    	throws NullPointerException
    {
    	if( parser == null )
    		throw new NullPointerException("parser == null");
    		
        this.parser = parser;
    }
    
    StringBuffer buf;
    DataInputStream  xml;
    int          r;
    char         c, lastC = 0;
    int          lvl = 0;
    Stack        elementStack = new Stack();
    
    /**
     * Parses the XML stream until the end of the document is reached.
     * This is defined as when a closing tag matching the first opening tag is found.
     * 
     * @throws NullPointerException if xml == null.
     * @throws ParserException when it encounters bad XML.
     * @throws IOException when there is a problem reading from the XML stream.
     */
    public void parse(DataInputStream xml)
    	throws NullPointerException, ParserException, IOException
    {
		if( xml == null )
			throw new NullPointerException("xml == null");
			
        this.xml = xml;
        _parse();
    }
    
    private void _parse()
    throws ParserException, IOException
    {
//System.err.println("_parse()");
        
        for( ; ; )
        {
//System.err.println("lvl="+lvl);
            if( lastC != 0 )
            { c = lastC; lastC = 0; }
            else
                c = read ();
        
            if ( isWhiteSpace(c) )
                continue;
            
            if( c == '<' )
            {
                switch( readTag (c) )
                {
                    case -1:
                        return;
                    case  0:
                        break;
                    case  1: 
                        lvl ++;
                        _parse ();
                        lvl --;
                        if( lvl == 0 )
                            return;
                        break;
                }
            }
            else
                readCData(c);            
        }
    }
    
    char qChar = 0;
    int len;
    Hashtable attrs;
    String tag, name, value;
    boolean closing = false;
    
    private int readTag(char c)
    throws ParserException, IOException
    {
//System.err.println("readTag("+c+")");
        buf = new StringBuffer();
        buf.append(c);
        len = 1;
        tag = null;
        
        c = read();
        buf.append(c);
        len ++;
            
        if( c == '/' )
        {
            if( lvl == 1 )
                parser.docStop( readClosingTag () );
            else if( lvl == 2 )
                parser.chunkStop( readClosingTag () );
            else
                parser.elementStop ( readClosingTag () );
                
            return -1;
        }
        else if( c == '!' )
            readBangTag ();
        else if( c == '?' )
            readProcessTag ();
        else if( c == '<' )
            throw new ParserException
            ("Bad XML: unescaped '<' found inside tag: '"+buf.toString()+"'");
        else
            return readRegularTag ();
        
        return 0;
    }
    
    private String readClosingTag()
    throws ParserException, IOException
    {
//System.err.println("readClosingTag()");
        for( ; ; )
        {
            c = read();
            buf.append(c);
            len ++;
            
            if( tag == null )
            {
                if( c == '>' || isWhiteSpace(c) )
                {
                    tag = buf.toString().substring (2,len-1);
                    name = (String)elementStack.pop();
                    if( name.equals(tag) )
                        return tag;
                    else
                        throw new ParserException
                        ("Bad XML: found closing tag: '"+tag+"', but was expecting: '"+name+"'");
                }
                else if ( c == '<' )
                    throw new ParserException
                    ("Bad XML: '<' found inside tag: '<"+buf.toString()+"'");
            }
            else
                if( ! isWhiteSpace(c) )
                {
                    if( c == '>' )
                    { return tag; }
                    else
                        throw new ParserException
                        ("Bad XML: invalid character detected in closing tag: '<"+buf.toString()+"'");
                }
        }
    }
    
    private int readRegularTag()
    throws ParserException, IOException
    {
//System.err.println("readRegularTag()");
        attrs = new Hashtable(19);
        closing = false;
        
        // read the tag name
        for( ; ; )
        {
            c = read();
            buf.append(c);
            len ++;
            
            if( c == '/' || c == '>' || isWhiteSpace(c) )
            {
                if( c == '/' )
                {
                    c = read();
                    closing = true;
                    if( c != '>' )
                        throw new ParserException
                        ("Bad XML: found '/' not followed by '>'");
                }
                tag = buf.toString().substring (1,len-1);
                buf = new StringBuffer();
                len = 0;
                break;
            }
            else if( c == '<' )
                throw new ParserException
                ("Bad XML: '<' found inside tag: '"+buf.toString()+"'");
        }
        
        // read the attribute/value pairs
        if( ! closing )
        {
            for( ; ; )
            {
                // first the attrib
                while( isWhiteSpace(c) )
                { c = read(); }

                if( c == '/' )
                {
                    c = read();
                    closing = true;
                    if( c == '>' )
                        break;
                    throw new ParserException
                    ("Bad XML: found '/' not followed by '>'");
                }
                else if ( c == '>' )
                    break;
                else if( c == '<' )
                    throw new ParserException
                    ("Bad XML: '<' found inside tag: '"+buf.toString()+"'");

                do
                {
                    buf.append(c);
                    len ++;
                    c = read();
                    if( c == '<' )
                        throw new ParserException
                        ("Bad XML: '<' found inside tag: '"+buf.toString()+"'");
                }
                while( c != '=' && ! isWhiteSpace(c) );

                name = buf.toString();
                if( attrs.containsKey(name) )
                    throw new ParserException
                    ("Bad XML: Duplicate attribute: '"+name+"'");
                buf = new StringBuffer();
                len = 0;

                // now the value

                if( c != '=' )
                {
                    while( isWhiteSpace(c) )
                        c = read();
                    if( c != '=' )
                        throw new ParserException
                        ("Bad XML: no '=' found after attribute name '"+name+"'");
                    c = read();
                    if( c == '<' )
                        throw new ParserException
                        ("Bad XML: '<' found inside tag: '"+buf.toString()+"'");
                }
                else
                    c = read();

                while( isWhiteSpace(c) )
                    c = read();

                if( c != '\'' && c != '"' )
                    throw new ParserException
                    ("Bad XML: attribute '"+name+"' value not quoted.");
                else if( c == '<' )
                    throw new ParserException
                    ("Bad XML: '<' found inside tag: '"+buf.toString()+"'");

                qChar = c;

                c = read();

                while( c != qChar )
                {
                    if( c == '<' )
                    {
                        buf.append(c);
                        throw new ParserException
                        ("Bad XML: unescaped '<' found in attribute '"+name+"' data: '"+buf.toString()+"'");
                    }
                    buf.append(c);
                    c = read();
                    len ++;
                }

                attrs.put(name,XMLUtils.unEscape(buf.toString()));
                buf = new StringBuffer();
                len = 0;

                c = read();
            }
        }
        
        if( lvl == 0 )
            parser.docStart(tag,attrs);
        else if( lvl == 1 )
            parser.chunkStart(tag,attrs);
        else
            parser.elementStart(tag,attrs);
        
        if ( closing )
        {
            if( lvl == 0 )
            {
                parser.docStop(tag);
                return -1;
            }
            else if( lvl == 1 )
                parser.chunkStop(tag);
            else
                parser.elementStop(tag);
        }
        else
            elementStack.push(tag);
        
        return ( closing ? 0 : 1 );
    }
    
    private void readProcessTag()
    throws ParserException, IOException
    {
//System.err.println("readProcessTag()");
        for( ; ; )
        {
            c = read();
            buf.append(c);
            len ++;
            
            if( qChar == 0 )
            {
                if( c == '\'' || c == '"' )
                    qChar = c;
                else if( c == '>' )
                {
                    if( buf.charAt(len-2) == '?' )
                    {
                        parser.processingInstruction(buf.toString().substring(2,len-2));
                        return;
                    }
                    else
                        throw new ParserException
                        ("Bad XML: '<?' not closed with '?>': '"+buf.toString()+"'");
                }
            }
            else
                if( c == qChar )
                    qChar = 0;
            
        }
    }
    
    private void readBangTag()
    throws ParserException, IOException
    {
//System.err.println("readBangTag()");
        for( ; ; )
        {
            c = read();
            buf.append(c);
            len ++;
            
            if( len == 3 )
            {
                if( c == '[' )
                { readBrakTag(); return; }
            }
            else if( len == 4 )
            {
                if( c == '-' && buf.charAt(2) == '-' )
                { readComment(); return; }
            }
            else if( len > 4 )
            { readDTDTag(); return; }
        }
    }
    
    private void readComment()
    throws ParserException, IOException
    {
//System.err.println("readComment()");
        for( ; ; )
        {
            c = read();
            
            if( c == '>' && buf.toString().substring (len-2,len).equals ("--") )
                return;
            
            buf.append(c);
            len ++;
        }
    }
    
    private void readCData(char c)
    throws ParserException, IOException
    {
//System.err.println("readCData("+c+")");
        buf = new StringBuffer();
        buf.append(c);
        
        for ( ; ; )
        {
            r = xml.read();
            if( r == -1 )
            { pause(); continue; }
            
            c = (char) r;
            
	    if( c == '<' )
	    {
	        lastC = c;
		parser.cData(XMLUtils.unEscape(buf.toString()));
		break;
	    }
                
            buf.append(c);
            len ++;
        }
    }
    
    private void readBrakTag()
    throws ParserException, IOException
    {
//System.err.println("readBrakTag()");
        // for now we treat all <![ as if they were <![CDATA[
        readExtendedCData();
    }
    
    private void readExtendedCData()
    throws ParserException, IOException
    {
//System.err.println("readExtendedCData()");
        
        for ( ; ; )
        {
            r = xml.read();
            if( r == -1 )
            { pause(); continue; }
            
            c = (char) r;
            
	    if( c == '>' )
	    {
	        if( buf.toString().substring(len - 2, len).equals("]]") )
		{
		    parser.cData( buf.toString().substring(9,len - 2) );
		    return;
		}
            }
                
            buf.append(c);
            len ++;
        }
    }
    
    private void readDTDTag()
    throws ParserException, IOException
    {
//System.err.println("readDTDTag()");
        boolean inBrak = false;
        qChar = 0;
        
        for ( ; ; )
        {
            c = read();
            
            buf.append(c);
            len ++;
            
            if( qChar == 0 )
            {
                if( inBrak )
                {
                    if( c == ']' )
                    inBrak = false;
                }
                else
                {
                    if ( c == '\'' || c == '"' )
                        qChar = c;
                    else if ( c == '[' )
                        inBrak = true;
                    else if ( c == '>' )
                    {
                        parser.dtdData( buf.toString() );
                        return;
                    }
                }
            }
            else
                if( c == qChar )
                    qChar = 0;
        }
    }
    
    private char read()
    throws IOException
    {
        return (char)xml.readByte();
    }
    
    private static void pause()
    {
        try
        { Thread.sleep(10); }
        catch( InterruptedException x )
        { }
    }

	/**
	 * Just checks to see if the given character is a space, tab, new-line, or return.
	 */    
    public static final boolean isWhiteSpace (char c)
    { return ( c == ' '  || c == '\t' || c == '\r' || c == '\n' ); }
    
}
