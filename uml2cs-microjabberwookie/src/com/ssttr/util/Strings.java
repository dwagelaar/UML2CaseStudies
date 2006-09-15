/*
 * Strings.java
 *
 * Created on May 3, 2003, 11:52 PM
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

package com.ssttr.util;

import java.util.Vector;
import java.util.Enumeration;

/**
 *
 * @author  smeiners
 * @author  dwagelaar
 */
public class Strings
{
    
    /** Creates a new instance of Strings.  This is not generally
     * needed since all the methods of this class are static. */
    public Strings ()
    {
    }
    
    private static final byte[] hexCodes =
    { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    
    /** Converts an array of data (binary if you like) into
     * a hexidecimal String.  This effectively doubles the
     * length of the data since it takes two bytes to represent one. */
    public static final String toHex(final byte[] data)
    { return new String(toHexBytes(data)); }

    /** Converts an array of data (binary if you like) into
     * a hexidecimal array.  This effectively doubles the
     * length of the data since it takes two bytes to represent one. */
    public static final byte[] toHexBytes(final byte[] data)
    {
        byte[] hex;
        if( (data[0] & 0xF0) == 0 )
            hex = new byte[data.length * 2 - 1];
        else
            hex = new byte[data.length * 2];
        
        int i= data.length - 1, j = hex.length - 1;

        while( i >= 0 )
        {
            hex[j--] = hexCodes[  data[i]        & 0xF ];
            if( j >= 0 )
                hex[j--] = hexCodes[ (data[i] >>> 4) & 0xF ];
            i --;
        }
        
        return hex;
    }
    
    private static final char A = 'A' - 0xA;

    /** Converts a hexidecimal String into it's original
     * (possibly binary) form. */    
    public static final byte[] fromHex(final String hex)
    { return fromHex(hex.toCharArray()); }

    /** Converts a hexidecimal array into it's original
     * (possibly binary) form. */    
    public static final byte[] fromHex(final char[] hex)
    {
        if( hex[0] == 0 )
            hex[0] = '0';
        
        byte[] data = new byte[(hex.length+1) / 2];
        int i = hex.length - 1, j = data.length - 1;

        while( i >= 0 )
        {
            data[j]  = (byte)  (hex[i] - (hex[i] > '9' ? A : '0') );
            i --;
            
            if( i < 0 )
                break;
                
            data[j] |= (byte)( (hex[i] - (hex[i] > '9' ? A : '0') ) << 4 );
            i --;
            
            j --;
        }
        
        return data;
    }
    
    /** Converts a hexidecimal array into it's original
     * (possibly binary) form. */    
    public static final byte[] fromHex(final byte[] hex)
    {
        byte[] data = new byte[(hex.length+1) / 2];
        int i = hex.length - 1, j = data.length - 1;

        while( i >= 0 )
        {
            data[j]  = (byte)  (hex[i] - (hex[i] > '9' ? A : '0') );
            i --;
            
            if( i < 0 )
                break;
                
            data[j] |= (byte)( (hex[i] - (hex[i] > '9' ? A : '0') ) << 4 );
            i --;
            
            j --;
        }
        
        return data;
    }
    
    /** Converts a String into a list of StringS, seperated by a
     * given separator. */
    public static final Vector tokenize(String string, char separator)
    {
        Vector v = new Vector();
        
        int p,l = 0;
        p = string.indexOf(separator);
        
        while( p >= 0 )
        {
            //Use JDK 1.1 API
            v.addElement( string.substring(l, p) );
            l = p + 1;
            p = string.indexOf(separator, l);
        }
        
        //Use JDK 1.1 API
        v.addElement( string.substring(l) );
        
        return v;
    }
    
    /** Combines a list of StringS into a single String with a
     * separator in between each part. */
    public static final String untokenize(Vector list, char separator)
    {
        boolean first = true;
        StringBuffer buf = new StringBuffer();
        
        for( Enumeration e = list.elements (); e.hasMoreElements(); )
        {
            if( first )
                first = false;
            else
                buf.append(separator);
            
            buf.append( e.nextElement () );
        }
        
        return buf.toString();
    }
}
