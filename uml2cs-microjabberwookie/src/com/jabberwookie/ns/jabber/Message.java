/*
 * Message.java
 *
 * Created on April 21, 2003, 4:50 PM
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
 * This is the super-class of all packets of type &lt;message&gt;.
 * The only time you're likely to interface directly with it
 * is when extending it.
 * @author  smeiners
 */
public class Message
extends Chunk
{
    
    /** Creates a new instance of Message */
    public Message ()
    { super(Chunk.Type.MESSAGE); }
    
    public Message (String to, String message)
    {
        super(Chunk.Type.MESSAGE,NORMAL);
        setBody(message);
        setTo(to);
    }
    
    public Message(String type, String to, String message)
    {
        super(Chunk.Type.MESSAGE,to,type);
        setBody(message);
    }
    
    public Message(String type, String to, String thread, String subject, String message)
    {
        this(type, to, message);
        
        setThread(thread);
        setSubject(subject);
    }
    
    public void setBody(String message)
    {
        getChild(BODY, true).setValue(message);
    }
    
    public void setSubject(String subject)
    {
        getChild(SUBJECT, true).setValue(subject);
    }
    
    public void setThread(String thread)
    {
        getChild(THREAD, true).setValue(thread);
    }
    
    public String getBody()
    {
        return getChildValue(BODY);
    }
    
    public String getThread()
    {
        return getChildValue(THREAD);
    }
    
    public String getSubject()
    {
        return getChildValue(SUBJECT);
    }
    
}
