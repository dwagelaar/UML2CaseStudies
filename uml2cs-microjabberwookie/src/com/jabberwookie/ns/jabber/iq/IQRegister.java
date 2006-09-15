/*
 * Register.java
 *
 * Created on April 21, 2003, 8:38 PM
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

package com.jabberwookie.ns.jabber.iq;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Enumeration;

import com.jabberwookie.Client2Server;
import com.jabberwookie.ns.jabber.Chunk;
import com.jabberwookie.ns.jabber.IQ;
import com.ssttr.xml.XMLElement;

/**
 * Implements the jabber:iq:register namespace.  Used for registering
 * a new user on the server.
 * @author  smeiners
 */
public class IQRegister
extends Query
{
    public  static final String     NAMESPACE = "jabber:iq:register";
    
    public IQRegister ()
    {
        setNameSpace(NAMESPACE);
    }
    
    public static IQ createGetRequest(String to)
    {
        IQRegister reg = new IQRegister();
        return new IQ(GET,to,reg);
    }
    
    public static IQ createSetRequest(String to, Hashtable values)
    {
        IQRegister reg = new IQRegister();
        String key;
        
        for( Enumeration k = values.keys(); k.hasMoreElements(); )
        {
            key = (String)k.nextElement();
            reg.setChildValue(key, (String)values.get(key) );
        }
        
        return new IQ(SET,to,reg);
    }
    
    public static IQ createRemoveRequest(String to)
    {
        IQRegister reg = new IQRegister();
        reg.setChildValue(REMOVE,"");
        return new IQ(SET,to,reg);
    }
    
    public static Hashtable getRequiredRegInfo(Client2Server c2s)
    throws IOException
    {
        return getRequiredRegInfo(c2s,c2s.getServerName());
    }
    
    public static Hashtable getRequiredRegInfo(Client2Server c2s, String to)
    throws IOException
    {
        Chunk chunk = c2s.send( IQRegister.createGetRequest(to), 30);
        if( chunk == null || ! chunk.getType().equals("result") )
            throw new IOException( chunk == null ? "Timedout" : chunk.toString() );

        XMLElement el;
        Hashtable vals = new Hashtable(19);
        String name, value;
        for( Enumeration e = chunk.getChild(0).enumerateChildren(); e.hasMoreElements(); )
        {
            el = (XMLElement)e.nextElement();
            name  = el.getName();
            if( name == null )
                continue;
            value = el.getValue();
            if( value == null )
                value = "";
            vals.put( name, value );
        }
        
        return vals;
    }
    
    public void setRegInfo(Hashtable values)
    {
        String key;
        
        for( Enumeration k = values.keys(); k.hasMoreElements(); )
        {
            key = (String)k.nextElement();
            setChildValue(key, (String)values.get(key) );
        }
    }
    
}
