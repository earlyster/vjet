/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsnative;

import org.eclipse.vjet.dsf.jsnative.anno.BrowserSupport;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;
import org.eclipse.vjet.dsf.jsnative.anno.JsMetatype;
import org.eclipse.vjet.dsf.jsnative.anno.JsSupport;
import org.eclipse.vjet.dsf.jsnative.anno.JsVersion;
import org.eclipse.vjet.dsf.jsnative.anno.Property;
import org.mozilla.mod.javascript.IWillBeScriptable;

/**
 * JavaScript object representing Pligin installed in the browser
 *
 */
@JsSupport( JsVersion.MOZILLA_ONE_DOT_ONE)
@JsMetatype
public interface Plugin extends IWillBeScriptable {
	
	/**
	 * Returns description of the plugin
	 * @return
	 */
	@BrowserSupport({BrowserType.FIREFOX_1P, BrowserType.OPERA_7P, BrowserType.SAFARI_3P})
	@Property String getDescription();

	/**
	 * Retruns file name of the plugin itself
	 * @return
	 */
	@BrowserSupport({BrowserType.FIREFOX_1P, BrowserType.OPERA_7P, BrowserType.SAFARI_3P})
	@Property String getFilename();

	/**
	 * Returns number of elements in the MimeType array of the data formats 
	 * supported by the plugin
	 * @return
	 */
	@BrowserSupport({BrowserType.FIREFOX_1P, BrowserType.OPERA_7P, BrowserType.SAFARI_3P})
	@Property int getLength();
	
	/**
	 * Name of the plugin
	 * @return
	 */
	@BrowserSupport({BrowserType.FIREFOX_1P, BrowserType.OPERA_7P, BrowserType.SAFARI_3P})
	@Property String getName();

}
