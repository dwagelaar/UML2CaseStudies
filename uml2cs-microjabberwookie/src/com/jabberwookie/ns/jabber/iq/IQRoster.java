/*
 * Roster.java
 *
 * Created on April 24, 2003, 8:34 PM
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
import java.util.Enumeration;

import com.jabberwookie.ns.jabber.IQ;
import com.ssttr.xml.XMLElement;

/**
 * Implements the jabber:iq:roster namespace.  Good for getting
 * and setting your roster.
 * @author  smeiners
 * @author  dwagelaar
 */
public class IQRoster
extends Query
{
    public  static final String     NAMESPACE = "jabber:iq:roster";
    
    public IQRoster ()
    {
        setNameSpace(NAMESPACE);
    }
    
    public static IQ createGetRequest()
    {
        IQRoster reg = new IQRoster();
        return new IQ(GET,reg);
    }
    
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
        if( child instanceof IQRoster.Item )
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
    
    public Item addItem(String jid, String name)
    {
        Item i = new Item(jid,name);
        addChild(i);
        return i;
    }
    
    public class Item
    extends XMLElement
    {

        private Item()
        { super("item"); }

        public Item(Hashtable attrs)
        { super("item",attrs); }

        public Item(String jid)
        { this(); setJID(jid); }

        public Item(String jid, String name)
        { this(); setJID(jid); setItemName(name); }

        public String getJID()
        { return this.getAttribute(JID); }

        public void setJID(String jid)
        { this.setAttribute(JID, jid); }

        public String getItemName()
        { return this.getAttribute(NAME); }

        public void setItemName(String name)
        { this.setAttribute(NAME, name); }
        
        public String getSubscription()
        { return this.getAttribute(SUBSCRIPTION); }
        
        public void setSubscription(String subscription)
        { this.setAttribute(SUBSCRIPTION, subscription); }

        public String getAsk()
        { return this.getAttribute(ASK); }

        public void setAsk(String ask)
        { this.setAttribute(ASK, ask); }

        public Vector getGroups()
        {
            Vector groups = new Vector(this.getChildCount());
            XMLElement group;
            for( Enumeration e = this.enumerateChildren(); e.hasMoreElements(); )
            {
                group = (XMLElement)e.nextElement();
                if( ! group.getName().equals(GROUP) )
                    continue;
                
                groups.addElement(group.getValue());
            }
            
            return groups;
        }

        public void addGroup(String group)
        { this.addChild(new XMLElement(GROUP, group)); }
        
        public int getGroupCount()
        { return this.getChildCount(); }
        
        public String getGroup(int i)
        { return this.getChildValue(i); }
        
        public void removeGroup(int i)
        { this.removeChild(i); }
        
        public boolean containsGroup(String group)
        {
            XMLElement g;
            for( Enumeration e = this.enumerateChildren(); e.hasMoreElements(); )
            {
                g = (XMLElement)e.nextElement();
                if( ! g.getName().equals(GROUP) )
                    continue;
                
                if( g.getValue().equals(group) )
                    return true;
            }
            
            return false;
        }
        
        public void removeGroup(String group)
        {
            XMLElement g;
            for( Enumeration e = this.enumerateChildren(); e.hasMoreElements(); )
            {
                g = (XMLElement)e.nextElement();
                if( ! g.getName().equals(GROUP) )
                    continue;
                
                if( g.getValue().equals(group) )
                {
                    this.removeChild(g);
                    return;
                }
            }
        }
        
        public XMLElement addChild(String tag)
        { // Groups are added through this method - may not return null!!!
            if( tag.equals(GROUP) )
                return super.addChild(tag);
            else
                return null;
          }

        public XMLElement addChild(String tag, Hashtable attrs)
        { // Groups are added through this method - may not return null!!!
          if( tag.equals(GROUP) )
              return super.addChild(tag, attrs);
          else
              return null;
        }

        public void addChild(XMLElement child)
        {
            if( child.getName().equals(GROUP) )
                super.addChild(child);
        }

        public boolean equals(Object o)
        {
            if( o == null || ! ( o instanceof Item ) )
                return false;
                
            return getItemName().equals( ((Item)o).getItemName() );
        }
    }
}
