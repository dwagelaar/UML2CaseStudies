/*
 * DiscoItems.java
 *
 * Created on June 24, 2003, 6:19 PM
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

import java.util.Vector;
import java.util.Hashtable;

import com.ssttr.xml.XMLElement;

/**
 * This class and its sister-class DiscoInfo implement the namspaces described in JEP-0030
 * which can currently be found at <a href="http://www.jabber.org/jeps/jep-0030.html">http://www.jabber.org/jeps/jep-0030.html</a>.
 * @author  smeiners
 */
public class DiscoItems
extends Query
{
    public  static final String     NAMESPACE = "http://jabber.org/protocol/disco#items";
    
    /** Creates a new instance of DiscoItems */
    public DiscoItems ()
    {
        setNameSpace(NAMESPACE);
    }
    
    public String getNode()
    { return getAttribute("node"); }
    
    public void setNode(String node)
    { setAttribute("node",node); }
    
    public XMLElement addChild(String tag)
    {
        return null;
    }
    
    public XMLElement addChild(String tag, Hashtable attrs)
    {
        if( tag.equals("item") )
        {
            final Item i = new Item(attrs);
            addChild(i);
            return i;
        }
        
        return null;
    }
    
    public void addChild(XMLElement child)
    {
        if( child instanceof DiscoItems.Item )
            super.addChild(child);
    }

    public Vector getItems()
    { return getChildren(); }
    
    public Item addItem(String jid)
    {
        Item i = new Item(jid);
        addChild(i);
        return i;
    }
    
    public Item addItem(String jid, String node)
    {
        Item i = new Item(jid,node);
        addChild(i);
        return i;
    }
    
    public Item addItem(String jid, String node, String name)
    {
        Item i = new Item(jid,node,name);
        addChild(i);
        return i;
    }
    
    public class Item
    extends XMLElement
    {
        public Item()
        { super("item"); }

        public Item(Hashtable attrs)
        { super("item",attrs); }
        
        public Item(String jid)
        { this(); setJID(jid); }

        public Item(String jid, String node)
        { this(); setJID(jid); setNode(node); }

        public Item(String jid, String node, String name)
        { this(); setJID(jid); setNode(node); setItemName(name); }

        public String getJID()
        { return getAttribute("jid"); }
        
        public void setJID(String jid)
        { setAttribute("jid",jid); }
        
        public String getItemName()
        { return getAttribute("name"); }
        
        public void setItemName(String name)
        { setAttribute("name",name); }
        
        public String getNode()
        { return getAttribute("node"); }
        
        public void setNode(String node)
        { setAttribute("node",node); }
        
        public XMLElement addChild(String tag)
        { return null; }

        public XMLElement addChild(String tag, Hashtable attrs)
        { return null; }

        public void addChild(XMLElement child)
        { }

    }
    
}
