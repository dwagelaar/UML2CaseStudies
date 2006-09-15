/*
 * DiscoInfo.java
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
 * This class and its sister-class DiscoItems implement the namspaces described in JEP-0030
 * which can currently be found at <a href="http://www.jabber.org/jeps/jep-0030.html">http://www.jabber.org/jeps/jep-0030.html</a>.
 * @author  smeiners
 */
public class DiscoInfo
extends Query
{
    public  static final String     NAMESPACE = "http://jabber.org/protocol/disco#info";
    
    /** Creates a new instance of DiscoInfo */
    public DiscoInfo ()
    {
        setNameSpace(NAMESPACE);
    }
    
    public String getNode()
    { return getAttribute("node"); }
    
    public void setNode(String node)
    { setAttribute("node",node); }
    
    public Vector getIdentities()
    { return getChildren("identity"); }
    
    public Vector getFeatures()
    { return getChildren("feature"); }
    
    public Vector getAll()
    { return getChildren(); }
    
    public XMLElement addChild(String tag)
    {
        return null;
    }
    
    public XMLElement addChild(String tag, Hashtable attrs)
    {
        if( tag.equals("identity") )
        {
            final Identity i = new Identity(attrs);
            addChild(i);
            return i;
        }
        
        if( tag.equals("feature") )
        {
            final Feature i = new Feature(attrs);
            addChild(i);
            return i;
        }
        
        return null;
    }
    
    public void addChild(XMLElement child)
    {
        if( child instanceof DiscoInfo.Identity || child instanceof DiscoInfo.Feature )
            super.addChild(child);
    }
    
    public Identity addIdentity()
    {
        Identity i = new Identity();
        addChild(i);
        return i;
    }
    
    public Identity addIdentity(String category)
    {
        Identity i = new Identity(category);
        addChild(i);
        return i;
    }
    
    public Identity addIdentity(String category, String type)
    {
        Identity i = new Identity(category,type);
        addChild(i);
        return i;
    }
    
    public Identity addIdentity(String category, String type, String name)
    {
        Identity i = new Identity(category,type,name);
        addChild(i);
        return i;
    }
    
    public Feature addFeature(String var)
    {
        Feature f = new Feature(var);
        addChild(f);
        return f;
    }

    public class Identity
    extends XMLElement
    {
        Identity()
        { super("identity"); }
        
        public Identity(Hashtable attrs)
        { super("identity",attrs); }
        
        public Identity(String category)
        { this(); setCategory(category); }
     
        public Identity(String category, String type)
        { this(); setCategory(category); setType(type); }
     
        public Identity(String category, String type, String name)
        { this(); setCategory(category); setType(type); setIdentityName(name); }
     
        public String getCategory()
        { return getAttribute("category"); }
        
        public void setCategory(String category)
        { setAttribute("category",category); }
        
        public String getIdentityName()
        { return getAttribute("name"); }
        
        public void setIdentityName(String name)
        { setAttribute("name",name); }
        
        public String getType()
        { return getAttribute("type"); }
        
        public void setType(String type)
        { setAttribute("type",type); }
        
        public XMLElement addChild(String tag)
        { return null; }

        public XMLElement addChild(String tag, Hashtable attrs)
        { return null; }

        public void addChild(XMLElement child)
        { }

    }
    
    public class Feature
    extends XMLElement
    {
        private Feature()
        { super("feature"); }
        
        public Feature(Hashtable attrs)
        { super("feature",attrs); }
        
        public Feature(String var)
        { this(); setVar(var); }
        
        public String getVar()
        { return getAttribute("var"); }
        
        public void setVar(String var)
        { setAttribute("var",var); }

        public XMLElement addChild(String tag)
        { return null; }

        public XMLElement addChild(String tag, Hashtable attrs)
        { return null; }

        public void addChild(XMLElement child)
        { }

    }
    
}
