/*
 * Agent.java
 *
 * Created on July 8, 2003, 10:53 PM
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

import com.ssttr.xml.XMLElement;

import com.jabberwookie.ns.jabber.Const;

/**
 * This is a helper class for the {@link IQAgent}.
 * @author  smeiners
 */
public class Agent
extends XMLElement
implements Const
{

    /** Creates a new instance of Agent */
    public Agent ()
    {
        super("agent");
    }

    public Agent (Hashtable attrs)
    {
        this();
        setAttributes(attrs);
    }

    public String getJID()
    { return getAttribute(JID); }

    public void setJID(String jid)
    { setAttribute(JID, jid); }

    public String getAgentName()
    { return getChildValue(NAME); }

    public void setAgentName(String name)
    { setChildValue(NAME, name); }

    public String getDescription()
    { return getChildValue(DESCRIPTION); }

    public void setDescription(String description)
    { setChildValue(DESCRIPTION, description); }

    public String getService()
    { return getChildValue(SERVICE); }

    public void setService(String service)
    { setChildValue(SERVICE, service); }

    public String getTransport()
    { return getChildValue(TRANSPORT); }

    public void setTransport(String transport)
    { setChildValue(TRANSPORT, transport); }

    public boolean getGroupChat()
    { return getChildValueBool(GROUPCHAT); }

    public void setGroupChat(boolean available)
    { setChildValue(GROUPCHAT, available); }

    public boolean getRegister()
    { return getChildValueBool(REGISTER); }

    public void setRegister(boolean available)
    { setChildValue(REGISTER, available); }

    public boolean getSearch()
    { return getChildValueBool(SEARCH); }

    public void setService(boolean available)
    { setChildValue(SEARCH, available); }
}
