/*
 * XMLUUtils.java
 * 
 * Created on Apr 16, 2003
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

/**
 * This class provides some handy methods for encoding and decoding reserved
 * XML characters to and from their &amp;*; counterparts. 
 * @author smeiners
 */
public class XMLUtils
{
    private static final char[] entityChars =
    {
        '<',
        '>',
        '"',
        '\'',
        '&'
    };

    private static final String[] entityStrings =
    {
        "&lt;",
        "&gt;",
        "&quot;",
        "&apos;",
        "&amp;"
    };

	/**
	 * Since all the methods of this class are static this isn't generally
	 * too useful.  But every once in a while you end up needing access to
	 * it from something with special requirements, like a Velocity template
	 * which needs a real instance of the class, even to call static methods.
	 */
	public XMLUtils()
	{
	}

    private static final int findChar(char c)
    {
        for( int i = entityChars.length - 1; i >= 0; i -- )
            if( entityChars[i] == c )
                return i;
        return -1;
    }

    private static final int findString(String s)
    {
        for( int i = entityStrings.length - 1; i >= 0; i -- )
            if( entityStrings[i].equals(s) )
                return i;
        return -1;
    }

	/**
	 * Simply converts the the five reserved XML characters (&lt;,&gt;,",\,&) into
	 * their escaped counterparts.
	 */
	public static final String escape (String str)
	{
	    if( str == null )
	        return null;
	    
	    StringBuffer b = new StringBuffer ();
	    final char[] chars = str.toCharArray ();
	    final int len = chars.length;
	    int st;
	    
	    for( int i = 0; i < len; i ++ )
	    {
	        st = findChar(chars[i]);
	        if( st != -1 )
	            b.append(entityStrings[st]);
	        else
	            b.append(chars[i]);
	    }
	    
	    return b.toString ();
	}

	/**
	 * Simply converts the the five reserved XML characters (&lt;,&gt;,",\,&) from
	 * their escaped counterparts to their normal selves.
	 */
	public static final String unEscape (String str)
	{
	    StringBuffer b = new StringBuffer ();
	    final char[] chars = str.toCharArray ();
	    final int len = chars.length;
	    char[] tmp = new char[6];
	    String tmps;
	    int pos = 0, ch;
	
	    for( int i = 0; i < len; i ++ )
	    {
	        if( pos == 0 )
	        {
	            if( chars[i] == '&' )
	                tmp[pos++] = chars[i];
	            else
	                b.append (chars[i]);
	        }
	        else
	        {
	            tmp[pos++] = chars[i];
	            
	            if( chars[i] == ';' )
	            {
	                tmps = new String (tmp,0,pos);
	                ch = XMLUtils.findString(tmps);
	
	                if( ch != -1 )
	                    b.append ( entityChars[ch] );
	                else
	                    b.append (tmps);
	                
	                pos = 0;
	            }
	            else if( pos == 6 )
	            {
	                b.append (tmp,0,pos);
	                pos = 0;
	            }
	        }
	    }
	    
	    if( pos > 0 )
	        b.append (tmp,0,pos);
	    
	    return b.toString ();
	}

}
