/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsnative.global;

import org.eclipse.vjet.dsf.jsnative.anno.BrowserSupport;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;
import org.eclipse.vjet.dsf.jsnative.anno.Constructor;
import org.eclipse.vjet.dsf.jsnative.anno.JsSupport;
import org.eclipse.vjet.dsf.jsnative.anno.JsVersion;
import org.eclipse.vjet.dsf.jsnative.anno.Property;


/**
 * 
 * Represents JavaScript Error native object
 *
 */
@JsSupport( {JsVersion.MOZILLA_ONE_DOT_THREE, JsVersion.JSCRIPT_FIVE_DOT_ZERO})
public interface Error extends Object {
	
	@Constructor void Error();
	
	@Constructor void Error(String message);
	
	/**
	 * Description or message text of the error.
	 */
	@BrowserSupport({BrowserType.IE_6P})
	@Property String getDescription();
	
	/**
	 * Path or URL to the file that raised the error.
	 */
	@BrowserSupport({BrowserType.FIREFOX_1P})
	@Property String getFileName();
	
	/**
	 * Line number in file that raised the error.
	 */
	@BrowserSupport({BrowserType.FIREFOX_1P})
	@Property Number getLineNumber();
	
	/**
	 * Error message.
	 */
	@Property String getMessage();
	
	/**
	 * Error number.
	 */
	@BrowserSupport({BrowserType.IE_6P})
	@Property Number getNumber();
	
	/**
	 * Stack trace that gives information about the context of the error.
	 */
	@BrowserSupport({BrowserType.IE_6P, BrowserType.FIREFOX_1P})
	@Property String getStack();
	
}
