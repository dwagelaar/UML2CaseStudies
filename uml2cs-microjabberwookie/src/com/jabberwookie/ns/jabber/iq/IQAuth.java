/*
 * Auth.java
 *
 * Created on May 21, 2003, 9:07 PM
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

import java.util.Hashtable;
import java.util.Enumeration;

import com.jabberwookie.Client2Server;
import com.jabberwookie.ns.jabber.Chunk;
import com.jabberwookie.ns.jabber.IQ;
import com.ssttr.xml.XMLElement;
import com.ssttr.crypto.SHA1;

/**
 * This implements the jabber:iq:auth namespace, it is used for
 * authenticating {@link com.jabberwookie.Client2Server} connections.
 * @author  smeiners
 */
public class IQAuth
extends Query
{
    public  static final String     NAMESPACE           = "jabber:iq:auth";

    public static final int         LEVEL_PLAINTEXT     = 0;
    public static final int         LEVEL_DIGEST        = 5;
    public static final int         LEVEL_ZERO_K        = 10;
    
    public IQAuth ()
    {
        setNameSpace(NAMESPACE);
    }
    
    public static IQ createGetRequest(String to, String userName)
    {
        if( to == null || to.length() < 1 )
            throw new NullPointerException("to = null or empty");
        if( userName == null || userName .length() < 1 )
            throw new NullPointerException("userName = null or empty");
        IQAuth auth = new IQAuth();
        auth.setChildValue(USERNAME,userName);
        return new IQ(GET,to,auth);
    }
    
    public static IQ createSetRequest
    (Client2Server c2s, Chunk authGetResp, String resource, String password)
    {
        return createSetRequest(c2s,authGetResp,resource,password,LEVEL_PLAINTEXT,LEVEL_ZERO_K);
    }
    
    public static IQ createSetRequest
    (Client2Server c2s, Chunk authGetResp, String resource, String password
    , int minLevel, int maxLevel)
    {
        XMLElement in = authGetResp.getChild(0);
        
        IQAuth out = new IQAuth();
        out.setChildValue(USERNAME, in.getChildValue(USERNAME) );
        out.setChildValue(RESOURCE, resource);
            
        XMLElement type = in.getChild(TOKEN);
        
        if( type != null && type.getValue() != null && minLevel <= LEVEL_ZERO_K && LEVEL_ZERO_K <= maxLevel )
            out.setZeroK(password, type.getValue(), (int)in.getChildValueLong(SEQUENCE, -1) );
        
        else
        {
            type = in.getChild(DIGEST);
            
            if( type != null && minLevel <= LEVEL_DIGEST && LEVEL_DIGEST <= maxLevel )
                out.setDigest(password, c2s.getConnectionId());
            
            else if( minLevel <= LEVEL_PLAINTEXT && LEVEL_PLAINTEXT <= maxLevel )
            {
                type = in.getChild(PASSWORD);
                if( type == null )
                    return null;
                out.setPassword(password);
            }
            else
                return null;
        }
        
        return new IQ(SET,c2s.getServerName(),out);
    }
    
    public static IQ createSetRequest(String to, Hashtable values)
    {
        IQAuth auth = new IQAuth();
        String key;
        
        for( Enumeration k = values.keys(); k.hasMoreElements(); )
        {
            key = (String)k.nextElement();
            auth.setChildValue(key, (String)values.get(key) );
        }
        
        return new IQ(SET,to,auth);
    }

    public void setUsername(String username)
    {
        setChildValue(USERNAME, username);
    }
    
    public void setResource(String resource)
    {
        setChildValue(RESOURCE, resource);
    }
    
    public void setPassword(String password)
    {
        setChildValue(PASSWORD, password);
    }
    
    public void setDigest(String password, String connectionId)
    {
        SHA1 md = new SHA1();
        md.computeDigest( (connectionId+password).getBytes() );
        setChildValue(DIGEST,md.getDigestHex());
    }
    
    public void setZeroK(String password, String token, int seq)
    {
        SHA1 md = new SHA1();
        
        // Initial hash

        md.computeDigest( password.getBytes() );
        String hash = md.getDigestHex();

        // Sequence 0
        md.computeDigest( (hash+token).getBytes() );
        hash = md.getDigestHex();

        // Repeat N-1 times
        for( int i = seq; i > 0; i -- )
        {
            md.computeDigest(hash.getBytes());
            hash = md.getDigestHex();
        }
        
        setChildValue(HASH,hash);
        setChildValue(SEQUENCE,seq);
        setChildValue(TOKEN,token);
    }

}
