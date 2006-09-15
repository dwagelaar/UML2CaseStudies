/*
 * Const.java
 *
 * Created on May 8, 2003, 10:22 PM
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
 * These are some of the String constants commonly used in Jabber streams.
 * @author  smeiners
 */
public interface Const
{
    // the constants that are commented out are ones that are
    // duplicated in previous blocks.

    String MESSAGE      = "message";
    String IQ           = "iq";
    String PRESENCE     = "presence";
    
    // From stream:stream
    String TYPE         = "type";
    String ID           = "id";
    String TO           = "to";
    String FROM         = "from";

    // From jabber:iq
    String GET          = "get";
    String SET          = "set";
    String RESULT       = "result";
    String ERROR        = "error";

    // From jabber:message
    String BODY         = "body";
    String THREAD       = "thread";
    String SUBJECT      = "subject";
    String NORMAL       = "normal";
    String CHAT         = "chat";
    String GROUPCHAT    = "groupchat";
    String HEADLINE     = "headline";
    //String ERROR    = "error";
    
    // From jabber:presence
    String SHOW         = "show";
    String STATUS       = "status";
    String PRIORITY     = "priority";
    String AVAILABLE    = "available";
    String UNAVAILABLE  = "unavailable";
    String SUBSCRIBE    = "subscribe";
    String SUBSCRIBED   = "subscribed";
    String UNSUBSCRIBE  = "unsubscribe";
    String UNSUBSCRIBED = "unsubscribed";
    //String ERROR        = "error";
    //String CHAT         = "chat";
    String DND          = "dnd";
    String AWAY         = "away";
    String EXTENDED_AWAY= "xa";
    
    
    // From jabber:iq:agent
    String NAME         = "name";
    String DESCRIPTION  = "description";
    String SERVICE      = "service";
    String TRANSPORT    = "transport";
    //String GROUPCHAT    = "groupchat";
    String REGISTER     = "register";
    String SEARCH       = "search";
    String JID          = "jid";
    

    // From jabber:iq:Auth
    String USERNAME     = "username";
    String PASSWORD     = "password";
    String DIGEST       = "digest";
    String SEQUENCE     = "sequence";
    String TOKEN        = "token";
    String RESOURCE     = "resource";
    String HASH         = "hash";
    
    // From jabber:iq:register
    String INSTRUCTIONS = "instructions";
    //String USERNAME     = "username";
    //String PASSWORD     = "password";
    //String NAME         = "name";
    String EMAIL        = "email";
    String ADDRESS      = "address";
    String CITY         = "city";
    String STATE        = "state";
    String ZIP          = "zip";
    String PHONE        = "phone";
    String URL          = "url";
    String DATE         = "date";
    String MISC         = "misc";
    String TEXT         = "text";
    String REMOVE       = "remove";

    // From jabber:iq:roster
    //String JID             = "jid";
    //String NAME            = "name";
    String SUBSCRIPTION    = "subscription";
    String ASK             = "ask";
    String GROUP           = "group";
    //String TO              = "to";
    //String FROM            = "from";
    String BOTH            = "both";
    String NONE            = "none";
    //String REMOVE          = "remove";
    //String SUBSCRIBE       = "subscribe";
    //String UNSUBSCRIBE     = "unsubscribe";
    
    // From jabber:iq:time
    String UTC             = "utc";
    String TZ              = "tz";
    String DISPLAY         = "display";
    
    // From jabber:iq:version
    String VERSION         = "version";
    String OS              = "os";

    // From jabber:x:delay
    //String FROM            = "from";
    String STAMP           = "stamp";
}
