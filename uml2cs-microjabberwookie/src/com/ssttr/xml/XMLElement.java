/*
 * Element.java
 *
 * Created on April 21, 2003, 4:04 PM
 * Copyright (c) 2003, Sean M. Meiners, sean@ssttr.com
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
 *     * Neither the name of SSTTR nor the names of its contributors may be used
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

package com.ssttr.xml;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.Vector;
import java.util.Hashtable;
import java.util.Enumeration;

/**
 * This class represents the major attributes of an XML element needed to build
 * a DOM representation of an XML document.  It is also capable of writing itself
 * (and it's children) out to a given stream in a clean, tabbed format.
 * @author  smeiners
 * @author  dwagelaar
 */
public class XMLElement
{
    private static final String NULL_STRING = "";
    
    private String       name       = null;
    private Hashtable    attributes = new Hashtable(11);
    private String       value      = null;
    private Vector       children   = new Vector(5);
    
    /**
     * Creates an XMLElement with no name.  This is not recomended as it
     * can produce invalid XML.  It is really only usefull for dynamic
     * class instantiation.
     */
    public XMLElement ()
    {
    }

	/**
	 * Creates an XMLElement with the given name.
	 * @param name the name of this element.
	 */
    public XMLElement (String name)
    {
        this();
        setName(name);
    }
    
	/**
	 * Creates an XMLElement with the given name and attributes.
	 * @param name the name of this element.
	 * @param attrs the attributes of this tag as name/value pairs,
	 * these should both be StringS.
	 */
    public XMLElement (String name, Hashtable attrs)
    {
        this(name);
        setAttributes(attrs);
    }
    
	/**
	 * Creates an XMLElement with the given name, attributes, and value.
	 * @param name the name of this element.
	 * @param attrs the attributes of this tag as name/value pairs,
	 * these should both be StringS.
	 * @param value this represents the cData contained in the element.
	 */
    public XMLElement(String name, Hashtable attrs, String value)
    {
        this(name,attrs);
        setValue(value);
    }
    
	/**
	 * Creates an XMLElement with the given name and value.
	 * @param name the name of this element.
	 * @param value this represents the cData contained in the element.
	 */
    public XMLElement(String name, String value)
    {
        this(name);
        setValue(value);
    }
    
	/**
	 * Creates an XMLElement with the given name, attributes, and value.
	 * @param name the name of this element.
	 * @param attrs the attributes of this tag as name/value pairs,
	 * these should both be StringS.
	 * @param value this represents the cData contained in the element.
	 */
    public XMLElement(String name, Hashtable attrs, long value)
    {
        this(name,attrs);
        setValue(value);
    }
    
	/**
	 * Creates an XMLElement with the given name and value.
	 * @param name the name of this element.
	 * @param value this represents the cData contained in the element.
	 */
    public XMLElement(String name, long value)
    {
        this(name);
        setValue(value);
    }
    
	/**
	 * Creates an XMLElement that is a 'shallow' copy of the given XMLElement.
	 */
    public XMLElement(XMLElement element)
    {
        this(element.name, element.attributes, element.value);
        
        for( Enumeration e = element.children.elements(); e.hasMoreElements(); )
            addChild( (XMLElement)e.nextElement() );
    }
    
    /**
     * This has been made final due to the tendency for sub-classes to accidently override it.
     * If you REALLY need to override THIS method you can achieve a similar result by
     * overriding getName() instead.
     */
    public final void setName(String name)
    {
        this.name = name;
    }

	/**
	 * Gets the name of this element.
	 */    
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the declared namespace of this element (not it's parents).
     * It is really just a shortcut to calling getAttribute("xmlns").
     */
    public String getNameSpace()
    {
        return (String)attributes.get("xmlns");
    }
    
	/**
	 * Sets the declared namespace of this element (not it's parents).
	 * It is really just a shortcut to calling setAttribute("xmlns",ns).
	 */
    public void setNameSpace(String ns)
    {
        attributes.put("xmlns",ns);
    }
    
    /**
     * Sets the value of this element, aka the cData.
     */
    public void setValue(String value)
    {
        this.value = value;
    }
    
	/**
	 * Sets the value of this element, aka the cData.
	 */
    public void setValue(long value)
    {
        this.value = Long.toString(value);
    }
    
	/**
	 * Appends to the value of this element, aka the cData.
	 */
    public void appendValue(String value)
    {
        if( this.value == null || this.value.length() < 1 )
            this.value = value;
        else if( value != null && value.length() > 0 )
            this.value += "\n" + value;
    }
    
	/**
	 * Gets the value of this element, aka the cData.
	 */
    public String getValue()
    {
        return value;
    }
    
	/**
	 * Gets the value of this element, aka the cData.
	 * If the value can not be converted to a long then defaultValue
	 * will be returned.
	 */
    public long getValueLong(long defaultValue)
    {
        if( value == null || value.length() < 1 )
            return defaultValue;
        try
        { return Long.parseLong( value.trim() ); }
        catch( NumberFormatException x )
        { return defaultValue; }
    }
    
    /**
     * Sets attribute name to the given value.
     */
    public void setAttribute(String name, String value)
    {
        attributes.put(name,value);
    }
    
	/**
	 * Sets attribute name to the given value.
	 */
    public void setAttribute(String name, long value)
    {
        attributes.put(name,Long.toString(value));
    }
    
    /**
     * Copies the name/value pairs from the given hashtable into this
     * elements attribute map.
     */
    public void setAttributes(Hashtable hash)
    {
        Enumeration e;
        Object o;
        for( e = hash.keys(); e.hasMoreElements(); )
        {
            o = e.nextElement();
            attributes.put(o,hash.get(o));
        }
    }
    
    /**
     * Removes the specifed attribute.
     */
    public void removeAttr(String name)
    {
        attributes.remove(name);
    }
    
    /**
     * Removes all attributes of this element.
     */
    public void removeAttrs()
    {
        attributes = new Hashtable(11);
    }
    
	/**
	 * Gets the value of the specified attribute.
	 */
    public String getAttribute(String name)
    {
        return (String)attributes.get(name);
    }
    
	/**
	 * Gets the value of the specified attribute.
	 * If the value can not be converted to a long then defaultValue
	 * will be returned.
	 */
    public long getAttributeLong(String name, long defaultValue)
    {
        String val = (String)attributes.get(name);
        if( val == null || val.length() < 1 )
            return defaultValue;
        try
        { return Long.parseLong( val.trim() ); }
        catch( NumberFormatException x )
        { return defaultValue; }
    }
    
    /**
     * Gets a Hashtable of all the attributes in this element.
     * It is not recomended to modify the returned Hashtable.
     */
    public Hashtable getAttributes()
    {
        return attributes;
    }
    
    /**
     * Returns an Enumeration of all the attribute names in this element.
     */
    public Enumeration enumerateAttrs()
    {
        return attributes.keys();
    }
    
    /**
     * Adds the given element to the list of children for this element.
     */
    public void addChild(XMLElement element)
    {
        children.addElement(element);
    }
    
	/**
	 * Adds a new element with the given name to the list of children
	 * for this element and returns it.
	 */
    public XMLElement addChild(String tag)
    {
        final XMLElement e = new XMLElement(tag);
        children.addElement(e);
        return e;
    }

	/**
	 * Adds a new element with the given name and attributes to the list
	 * of children for this element and returns it.
	 */
    public XMLElement addChild(String tag, Hashtable attrs)
    {
        final XMLElement e = new XMLElement(tag,attrs);
        children.addElement(e);
        return e;
    }

	/**
	 * Removes the child at position n.
	 */
    public void removeChild(int n)
    {
        children.removeElementAt(n);
    }
    
	/**
	 * Removes the given child from this elements list of children.
	 */
    public void removeChild(XMLElement element)
    {
        children.removeElement(element);
    }
    
	/**
	 * Removes the first child with the given name from
	 * this elements list of children.
	 */
    public void removeChild(String name)
    {
        children.removeElement(getChild(name));
    }
    
	/**
	 * Removes all children of this element.
	 */
    public void removeChildren()
    {
        children = new Vector(5);
    }
    
	/**
	 * Enumerates all the children of this element.
	 */
    public Enumeration enumerateChildren()
    {
        return children.elements();
    }
    
	/**
	 * Gets the list of this element's children.
	 * It is not recomended to directly modify this list.
	 */
    public Vector getChildren()
    {
        return children;
    }
    
    /**
     * Gets all the children of this element that answer to the given name.
     */
    public Vector getChildren(String name)
    {
        XMLElement el = null;
        Vector ch = new Vector();
        
        for( Enumeration e = enumerateChildren(); e.hasMoreElements(); )
        {
            el = (XMLElement)e.nextElement();
            if( el.getName().equals(name) )
                ch.addElement(el);
        }
        
        return ch;
    }
    
    /**
     * Gets the first child of this element that answers to the given name.
     */
    public XMLElement getChild(String name)
    {
        return getChild(name,false);
    }
    
	/**
	 * Gets the first child of this element that answers to the given name.
	 * If such a child does not exist and addIfNotExist == true then it
	 * creates a new element with the given name, adds it to its list of
	 * children and returns it.  Otherwise is returns null.
	 */
    public XMLElement getChild(String name, boolean addIfNotExist)
    {
        XMLElement el = null;
        
        for( Enumeration e = enumerateChildren(); e.hasMoreElements(); )
        {
            el = (XMLElement)e.nextElement();
            if( el.getName().equals(name) )
                return el;
        }
        
        if( addIfNotExist )
        {
            el = new XMLElement(name);
            addChild(el);
            return el;
        }
        
        return null;
    }

	/**
	 * Gets the child at position num.
	 */    
    public XMLElement getChild(int num)
    {
        return (XMLElement)children.elementAt(num);
    }
    
	/**
	 * Sets the child at position num.
	 */    
    public void setChild(int num, XMLElement child)
    {
        children.setElementAt(child,num);
    }
    
    /**
     * Gets the number of children this element contains.
     */
    public int getChildCount()
    {
        return children.size();
    }
    
    /**
     * Gets the value of the first child answering to the given name.
     */
    public String getChildValue(String name)
    {
        XMLElement e = getChild(name);
        if( e == null )
            return null;
        return e.getValue();
    }
    
	/**
	 * Gets the value of the first child answering to the given name.
	 * If there is no such child, or it's value can not be converted
	 * to a long, defaultValue is returned.
	 */
    public long getChildValueLong(String name, long defaultValue)
    {
        XMLElement e = getChild(name);
        if( e == null )
            return defaultValue;
        return e.getValueLong(defaultValue);
    }
    
    /**
     * Returns true if a child by that name exists, false otherwise.
     */
    public boolean getChildValueBool(String name)
    {
        return getChild(name) != null;
    }
    
	/**
	 * Gets the value of the child at the given position.
	 */
    public String getChildValue(int i)
    {
        XMLElement e = getChild(i);
        if( e == null )
            return null;
        return e.getValue();
    }
    
	/**
	 * Gets the value of the child at the given position.
	 * If there is no such child, or it's value can not be converted
	 * to a long, defaultValue is returned.
	 */
    public long getChildValueLong(int i, long defaultValue)
    {
        XMLElement e = getChild(i);
        if( e == null )
            return defaultValue;
        return e.getValueLong(defaultValue);
    }
    
	/**
	 * Returns true if a child exists at that position, false otherwise.
	 */
    public boolean getChildValueBool(int i)
    {
        return getChild(i) != null;
    }
    
    /**
     * Sets the value of the first child by the given name to the given
     * value.  If there is no child by that name one will be created.
     */
    public void setChildValue(String name, String value)
    {
        getChild(name, true).setValue(value);
    }
    
	/**
	 * Sets the value of the first child by the given name to the given
	 * value.  If there is no child by that name one will be created.
	 */
    public void setChildValue(String name, long value)
    {
        getChild(name, true).setValue(value);
    }
    
	/**
	 * Sets the value of the first child by the given name to the given
	 * value.  If there is no child by that name one will be created.
	 */
    public void setChildValue(String name, boolean value)
    {
        XMLElement e = getChild(name);
        if( value )
        {
            if( e == null )
                addChild(name);
        }
        else
        {
            if( e != null )
                removeChild(name);
        }
    }
    
	/**
	 * Sets the value of the child at the given position to the given
	 * value.  If there is no child at that position nothing will be done.
	 */
    public void setChildValue(int i, String value)
    {
        XMLElement e = getChild(i);
        if( e != null )
            e.setValue(value);
    }
    
	/**
	 * Sets the value of the child at the given position to the given
	 * value.  If there is no child at that position nothing will be done.
	 */
    public void setChildValue(int i, long value)
    {
        XMLElement e = getChild(i);
        if( e != null )
            e.setValue(value);
    }
    
	/**
	 * Sets the value of the child at the given position to the given
	 * value.  If there is no child at that position nothing will be done.
	 */
    public void setChildValue(int i, boolean value)
    {
        XMLElement e = getChild(i);
        if( ! value && e != null )
                removeChild(i);
    }
    
    /**
     * Calls {@link #toString(int)} with tabLength = 4
     */
    public String toString()
    {
        return toString(4);
    }
    
    /**
     * Creates a String representing this element and all of its children.
     * Each element will be indented one tab for each element above it
     * in the tree.  A tab is simply a group of spaces (' ') equal to
     * tabLength.  With a tabLength of 4 it produces a very human-readable
     * formant.  With a tabLength of 0 it produces a more compact output
     * that, while diffucult for humans to read, saves space and is still
     * 100% machine readable.
     * 
     * @param tabLength The number of spaces to use for each tab.
     * The valid range is tabLength >= 0.
     */
    public String toString(int tabLength)
    {
        // Use classes that are also available in MIDP
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        PrintStream pOut = new PrintStream(bOut);
//        Writer sOut = new StringWriter();
//        Writer out  = new BufferedWriter(sOut);
        Writer out  = new OutputStreamWriter(pOut);
        
        try
        {
            writeTo( out, tabLength );
            out.flush();
        }
        catch( IOException x )
        {
            // This should never, ever, happen since StringWriter (now PrintStream)
            // is not capable of throwing any IOExceptions.
            System.err.println(
                "A highly improbable situation has occured.  "+
                "Somehow java.io.StringWriter has thrown an IOException: "+x.getMessage()+".  "+
                "Here comes the stack trace:");
            x.printStackTrace();
            return null;
        }
        
        return bOut.toString();
    }
    
	/**
	 * Calls {@link #write(Writer,int)} with tabLength = 4
	 */
    public void writeTo(Writer out)
        throws IOException
    {
        writeTo(out,4);
    }
    
	/**
	 * Writes this this element and all of its children to the given Writer.
	 * Each element will be indented one tab for each element above it
	 * in the tree.  A tab is simply a group of spaces (' ') equal to
	 * tabLength.  With a tabLength of 4 it produces a very human-readable
	 * formant.  With a tabLength of 0 it produces a more compact output
	 * that, while diffucult for humans to read, saves space and is still
	 * 100% machine readable.
	 * 
	 * @param tabLength The number of spaces to use for each tab.
	 * The valid range is tabLength >= 0.
	 */
    public void writeTo(Writer out, int tabLength)
        throws IOException
    {
        StringBuffer buf = new StringBuffer();
        String baseTab = null;
        
        if( tabLength == 0 )
            baseTab = NULL_STRING;
        else
        {
            for( int i = tabLength; i > 0; i -- )
                buf.append(' ');
            baseTab = buf.toString();
            buf = new StringBuffer();
        }
        
        writeTo(out,baseTab,NULL_STRING,false);
    }
    
    protected void writeTo(
        final Writer out,
        final String baseTab,
        final String tab,
        final boolean parentHasValue)
            throws IOException
    {
        final boolean hasChild = children.size() > 0;
        final boolean hasValue = ( value != null && value.length()  > 0 );

        if( baseTab != NULL_STRING && ! parentHasValue )
            out.write(tab);
        
        out.write('<');
        out.write(name);
        
        Enumeration e;
        
        String key;
        for( e = attributes.keys(); e.hasMoreElements(); )
        {
            key = (String)e.nextElement();
            out.write(' ');
            out.write(key);
            out.write("='");
            out.write( XMLUtils.escape((String)attributes.get(key)) );
            out.write('\'');
        }
        e = null;
        key = null;
        
        if( ! ( hasChild || hasValue ) )
        {
            if( baseTab != NULL_STRING )
                out.write("/>\n");
            else
                out.write("/>");
            return;
        }

        if( hasValue )
        {
            out.write('>');
            out.write( XMLUtils.escape(value) );
        }
            
        else if( baseTab != NULL_STRING )
            out.write(">\n");
        
        else
            out.write('>');

        if( hasChild )
        {
            final String newTab = ( baseTab == NULL_STRING ? NULL_STRING : baseTab + tab );
            for( e = children.elements(); e.hasMoreElements(); )
                ((XMLElement)e.nextElement()).writeTo(out,baseTab,newTab,hasValue);
            e = null;
        }
        
        if( baseTab != NULL_STRING && ! hasValue )
            out.write(tab);
        
        out.write("</");
        out.write(name);
        out.write('>');
        
        if( baseTab != NULL_STRING )
            out.write('\n');
    }
    
    /**
     * Creates a 'deep' copy of this element.  This guarentees that any changes
     * made to the original will not effect to copy.
     */
    public XMLElement copyDeep()
    {
        XMLElement el = new XMLElement(name,attributes,value);
        
        for( Enumeration e = children.elements(); e.hasMoreElements(); )
            el.addChild( ((XMLElement)e.nextElement()).copyDeep() );
        
        return el;
    }
    
	/**
	 * Creates a 'shallow' copy of this element.
	 */
    public XMLElement copyShallow()
    {
        return new XMLElement(this);
    }
}
