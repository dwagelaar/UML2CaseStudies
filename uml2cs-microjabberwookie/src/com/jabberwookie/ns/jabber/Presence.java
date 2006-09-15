/*
 * Presence.java
 *
 * Created on April 21, 2003, 6:09 PM
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

/**
 * This is the super-class of all packets of type &lt;presence&gt;.
 * The only time you're likely to interface directly with it
 * is when extending it.
 * @author  smeiners
 */
public class Presence
extends Chunk
{
    
    /** Creates a new instance of Presence */
    public Presence ()
    {
        super(Chunk.Type.PRESENCE);
        removeAttr("id");
    }
    
    public Presence (String to, String type)
    {
        super(Chunk.Type.PRESENCE,to,type);
        removeAttr("id");
    }
    
    public Presence(String show, String status, int priority)
    {
        this();
        setShow(show);
        setStatus(status);
        setPriority(priority);
        removeAttr("id");
    }
    
    public void setShow(String show)
    {
        getChild(SHOW, true).setValue(show);
    }
    
    public String getShow()
    {
        return getChildValue(SHOW);
    }
    
    public void setStatus(String status)
    {
        getChild(STATUS, true).setValue(status);
    }
    
    public String getStatus()
    {
        return getChildValue(STATUS);
    }
    
    public void setPriority(int priority)
    {
        getChild(PRIORITY, true).setValue(priority);
    }
    
    public int getPriority()
    {
        return (int)getChildValueLong(PRIORITY, -1);
    }
    
}
