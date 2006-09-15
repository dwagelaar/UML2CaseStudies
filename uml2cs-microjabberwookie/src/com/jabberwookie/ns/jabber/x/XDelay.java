/*
 * XDelay.java
 *
 * Created on July 8, 2003, 11:22 PM
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

package com.jabberwookie.ns.jabber.x;

/**
 * Implements the jabber:x:delay namespace.  Usually stuck inside
 * &lt;message&gt; tags that have been stored on the server while
 * you were offline.
 * @author  smeiners
 */
public class XDelay
extends X
{
    public  static final String     NAMESPACE = "jabber:x:delay";
    
    /** Creates a new instance of XDelay */
    public XDelay ()
    {
        setNameSpace(NAMESPACE);
    }
    
    public String getFrom()
    { return getAttribute(FROM); }
    
    public void setFrom(String from)
    { setAttribute(FROM, from); }
    
    public String getStamp()
    { return getAttribute(STAMP); }
    
    public void setStamp(String stamp)
    { setAttribute(STAMP, stamp); }
    
}
