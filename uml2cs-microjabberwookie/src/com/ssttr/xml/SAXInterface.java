/*
 * ParserInt.java
 *
 * Created on April 16, 2003, 8:20 PM
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

import java.util.Hashtable;

/**
 * This is the interface you must implement if you plan to use the {@link SAXParser}
 * class.  As in the {@link SAXParser} class this interface has some extra callbacks
 * that were implemented specifically to make working with the Jabber (XMPP) protocol
 * easier.  Those are {@link #chunkStart} and {@link #chunkStop}.  If you are parsing
 * a non-Jabber XML stream you may simply treat these as if they were calls to
 * {@link #elementStart} and {@link #elementStop}.  The easiest way to do this of course
 * is to simply call one from the other.
 * @author  smeiners
 */
public interface SAXInterface
{
	/**
	 * This signals that the parser has found its first XML element.
	 * @param tag The name of the tag that was found.
	 * @param attrs A Hashtable that contains a mapping of element
	 * attributes their respective values.  Both are StringS.
	 */
    void docStart(String tag, Hashtable attrs);
    
    /**
     * This signals that the parser has found an XML element that is
     * exactly one level below the one that started the document.  This
     * is mostly usefull for Jabber related XML parsing.
	 * @param tag The name of the tag that was found.
	 * @param attrs A Hashtable that contains a mapping of element
	 * attributes their respective values.  Both are StringS.
     */
    void chunkStart(String tag, Hashtable attrs);
    
    /**
     * This signals that the parser has found an XML element that is
     * two levels or more below the one that started the document. 
	 * @param tag The name of the tag that was found.
	 * @param attrs A Hashtable that contains a mapping of element
	 * attributes their respective values.  Both are StringS.
     */
    void elementStart(String tag, Hashtable attrs);
    
    /**
     * This signals that the parser has encountered an XML processing
     * instruction.  The parser does not do anything internally, it
     * simply passes is along, verbatim.
     * @param element the processing instruction, as read by the parser.
     */
    void processingInstruction(String element);
    
    /**
     * This signals that the parser has encountered an embedded DTD
     * in the XML document.  The parser does not handle DTDs itself
     * so it simply passes it along to you, verbatim.
     * @param dtd the embedded DTD, as read by the parser.
     */
    void dtdData(String dtd);

	/**
	 * This signals that the parser has found a closing tag that matches
	 * a tag previously found and signaled by {@link elementStart}.
	 * @param tag The name of the tag.
	 */    
    void elementStop(String tag);
    
    /** 
     * This signals that the parser has encountered some character-data
     * in the XML stream.  This includes any data that is not inbetween
     * a matched &lt; and &gt; set and was not classified as a processing
     * instruction or an embedded DTD.  All cData is passed through
     * {@link XMLUtils#unescape} before being handed to this callback.
     * Also, any extended cData will have it's enclosing brackets removed.
     * @param data The character-data as read and minimally parsed by the parser.
     */
    void cData(String data);
    
	/**
	 * This signals that the parser has found a closing tag that matches
	 * a tag previously found and signaled by {@link chunkStart}.
	 * @param tag The name of the tag.
	 */    
    void chunkStop(String tag);
    
	/**
	 * This signals that the parser has found a closing tag that matches
	 * a tag previously found and signaled by {@link docStart}.
	 * @param tag The name of the tag.
	 */    
    void docStop(String tag);
    
}
