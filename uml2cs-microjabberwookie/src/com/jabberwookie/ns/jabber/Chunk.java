/*
 * Chunk.java
 *
 * Created on April 21, 2003, 6:20 PM
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

package com.jabberwookie.ns.jabber;

import com.jabberwookie.ns.jabber.Const;

import com.ssttr.xml.XMLElement;

/**
 * This is the most basic element of a Jabber stream.  It represents
 * the elements that are common to IQ, Presence, and Message blocks.
 * @author  smeiners
 */
public class Chunk
extends XMLElement
implements Const
{
    private static       int    id          = 0;
    
    private int typeInt = -1;
    
    public static class Type
    {
        public static final int MESSAGE     = 1;
        public static final int PRESENCE    = 2;
        public static final int IQ          = 3;
    }
    
    public static final String typeIntToString(int type)
    {
        switch (type)
        {
            case 1: return Const.MESSAGE;
            case 2: return Const.PRESENCE;
            case 3: return Const.IQ;
            default: return "invalid";
        }
    }
    
    /** Creates a new instance of Chunk */
    public Chunk(String tag)
    {
        super(tag);
        setId(++id);
    }
    
    public Chunk(int chunkType)
    {
        super( typeIntToString(chunkType) );
        typeInt = chunkType;
        setId(++id);
    }
    
    public Chunk (int chunkType, String to)
    {
        this(chunkType);
        setTo(to);
        setId(++id);
    }
    
    public Chunk (int chunkType, String to, String type)
    {
        this(chunkType,to);
        setType(type);
        setId(++id);
    }
    
    public int getTypeInt()
    { return typeInt; }
    
    public void setType(String type)
    {
        setAttribute(TYPE,type);
    }
    
    public String getType()
    {
        return getAttribute(TYPE);
    }
    
    public void setId(String id)
    {
        if( id != null )
            setAttribute(ID,id);
    }
    
    public void setId(int id)
    {
        setAttribute(ID,Integer.toHexString(id));
    }
    
    public String getId()
    {
        return getAttribute(ID);
    }
    
    public void setTo(String jid)
    {
        setAttribute(TO, jid);
    }
    
    public String getTo()
    {
        return getAttribute(TO);
    }
    
    public void setFrom(String jid)
    {
        setAttribute(FROM, jid);
    }
    
    public String getFrom()
    {
        return getAttribute(FROM);
    }
    
    public Error getError()
    {
        XMLElement error = getChild(Const.ERROR);
        if( error != null )
            return new Error(error);
        
        return null;
    }
}
