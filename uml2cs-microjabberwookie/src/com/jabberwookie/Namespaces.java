/*
 * Namespaces.java
 *
 * Created on April 24, 2003, 10:15 PM
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

package com.jabberwookie;

import java.util.Hashtable;
import java.util.Enumeration;

import com.ssttr.xml.XMLElement;

/**
 * This class handles the maping of Jabber namespaces to Java classes.
 * By default it will load a maping that understands all the classes
 * implemented in the com.jabberwookie.ns.jabber.* heirarchy.
 * @author  smeiners
 * @author  dwagelaar
 */
public class Namespaces
{
    
    //protected static final String DEFAULT_NAMESPACES =
    //"/com/jabberwookie/ns/Namespace.properties";
    
    protected final Hashtable nsTable = new Hashtable(51);
    
    /** Creates a new instance of Namespaces with just the default
     * mapings. */
    public Namespaces()
    {
        this(null);
    }
    
    /**
     * Creates a new instance of Namespaces with the default
     * mapings as well as any custom namespace mapings you pass.
     * Note: your mapings will override the defaults if the names
     * match.
     * @param customNamespaces The namespace mapings in the form
     * of key = &lt;namespace&gt;, value = &lt;class name&gt;.
     * Please note that all namespace classes must inherit from
     * the com.ssttr.xml.XMLElement class.
     */
    public Namespaces(Hashtable customNamespaces)
    {
        Hashtable props = loadDefaultNamespaces();

        if( props == null )
            throw new NullPointerException("DEFAULT_NAMESPACES");

        if( customNamespaces != null ) // Use internal putAll()        
            putAll(props, customNamespaces);

        String key;
        Class c;

        for( Enumeration keys = props.keys(); keys.hasMoreElements(); )
        {
            key = (String)keys.nextElement();
            c = loadClass( (String)props.get(key) );
            if( c != null )
                nsTable.put(key,c);
        }
    }
    
    private Hashtable loadDefaultNamespaces()
    {
        //not supported in MIDP//Properties defaults = null;
        Hashtable defaults = new Hashtable();
        
        defaults.put("jabber:iq:auth",     "com.jabberwookie.ns.jabber.iq.IQAuth");
        defaults.put("jabber:iq:register", "com.jabberwookie.ns.jabber.iq.IQRegister");
        defaults.put("jabber:iq:roster",   "com.jabberwookie.ns.jabber.iq.IQRoster");
        defaults.put("jabber:iq:agent",    "com.jabberwookie.ns.jabber.iq.IQAgent");
        defaults.put("jabber:iq:agents",   "com.jabberwookie.ns.jabber.iq.IQAgents");
        defaults.put("jabber:iq:oob",      "com.jabberwookie.ns.jabber.iq.IQOOB");
        defaults.put("jabber:iq:time",     "com.jabberwookie.ns.jabber.iq.IQTime");
        defaults.put("jabber:iq:version",  "com.jabberwookie.ns.jabber.iq.IQVersion");
        defaults.put("jabber:x:delay",     "com.jabberwookie.ns.jabber.x.XDelay");
        defaults.put("jabber:x:oob",       "com.jabberwookie.ns.jabber.x.XOOB");
        defaults.put("jabber:x:roster",    "com.jabberwookie.ns.jabber.x.XRoster");
        defaults.put("jabber:iq:private",  "com.jabberwookie.ns.jabber.iq.IQPrivate");

        defaults.put("http://jabber.org/protocol/disco#items", "com.jabberwookie.ns.jabber.iq.DiscoItems");
        defaults.put("http://jabber.org/protocol/disco#info",  "com.jabberwookie.ns.jabber.iq.DiscoInfo");
        
//        try
//        {
//            defaults = new Properties();
//            defaults.load( Namespaces.class.getResourceAsStream(DEFAULT_NAMESPACES) );
//        }
//        catch( IOException x )
//        {
//            System.err.println(this.getClass().getName()+" could not load default namespaces: "+x.getMessage());
//        }
        
        return defaults;
    }
    
    /**
     * Returns a class that knows how to interpret the given
     * namespace.
     * @param namespace
     * @param tag
     * @return
     */
    public XMLElement getElement(String namespace, String tag)
    {
        if( namespace == null || ! nsTable.containsKey(namespace) )
            return null;
        
        Class c = null;
        try
        {
            c = (Class)nsTable.get(namespace);
            XMLElement be = (XMLElement)c.newInstance();
            be.setName(tag);
            return be;
        }
        catch( Exception x )
        { x.printStackTrace(); }
        
        return null;
    }

    /** Loads the given class by name. */ 
    protected static Class loadClass(String className)
    {
        try
        {
            return Class.forName(className);
        }
        catch( Exception x )
        { x.printStackTrace(); }
        
        return null;
    }
    
    /** Compensates for missing Hashtable.putAll */
    private void putAll(Hashtable into, Hashtable elements) {
        for (Enumeration e = elements.keys(); e.hasMoreElements();) {
            Object key = e.nextElement();
            into.put(key, elements.get(key));   
        }
    }
}
