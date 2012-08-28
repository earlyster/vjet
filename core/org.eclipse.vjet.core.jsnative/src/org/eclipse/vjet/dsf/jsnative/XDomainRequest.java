/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsnative;

import org.eclipse.vjet.dsf.jsnative.anno.BrowserSupport;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;
import org.eclipse.vjet.dsf.jsnative.anno.Constructor;
import org.eclipse.vjet.dsf.jsnative.anno.Function;
import org.eclipse.vjet.dsf.jsnative.anno.OverLoadFunc;
import org.eclipse.vjet.dsf.jsnative.anno.Property;
import org.mozilla.mod.javascript.IWillBeScriptable;


@BrowserSupport( {BrowserType.IE_6P})
public interface XDomainRequest extends IWillBeScriptable {
	
	

	@Constructor void XDomainRequest();
	
	/**
	 * Gets the Content-Type property in the HTML request or response header. 
	 * @return Object
	 */
	@Property Object getContentType();
	
	/**
	 * Gets the Content-Type property in the HTML request or response header. 
	 * @return String that receives the text received from the server. 
	 */
	@Property String getResponseText();
	
	/**
	 * Note: This documentation is preliminary and is subject to change.
	 * The timeout property. 
	 * @return int
	 */
	@BrowserSupport( {BrowserType.IE_8})
	@Property int getTimeout();
	@Property void setTimeout(int timeOut);
	
	
	/**
	 * Raised when there is an error that prevents the completion of the cross-domain request. 
	 */
	@Property Function getOnerror();
	@Property void setOnerror(Function error);
	
	/**
	 *Raised when the object has been completely received from the server. 
	 */
	@Property Function getOnload();
	@Property void setOnload(Function load);
	
	/**
	 *Raised when the object has been completely received from the server. 
	 */
	@Property Function getOnprogress();
	@Property void setOnprogress(Function progress);
	
	/**
	 *Raised when there is an error that prevents the completion of the request.  
	 */
	@Property Function getOntimeout();
	@Property void setOntimeout(Function timeout);
	
	
	
	@Function void abort();
	/**
	 * Creates a connection with a domain's server. 
	 * @param bstrMethod	One of the following required values: GET The HTTP GET method. POST The HTTP POST method. 
	 * @param bstrUrl Required. The server URL.
	 */
	@Function void open(String bstrMethod, String bstrUrl);
	
	/**
	 * Transmits a data string to the server for processing. 
	 * @param varBody Optional. Receives a String containing the data to transmit to the server. If omitted, the behavior is identical to that of sending an empty string ( "" ). 
	 */
	
	@OverLoadFunc void send();
	@OverLoadFunc void send(String varBody);
	
	
	

}
