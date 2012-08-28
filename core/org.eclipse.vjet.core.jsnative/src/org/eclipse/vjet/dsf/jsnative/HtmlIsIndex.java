/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsnative;

import org.eclipse.vjet.dsf.jsnative.anno.Alias;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserSupport;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;
import org.eclipse.vjet.dsf.jsnative.anno.DOMSupport;
import org.eclipse.vjet.dsf.jsnative.anno.DomLevel;
import org.eclipse.vjet.dsf.jsnative.anno.JsMetatype;
import org.eclipse.vjet.dsf.jsnative.anno.Property;

/**
 * http://www.w3.org/TR/REC-html40/interact/forms.html#edef-ISINDEX
 *
 */
@Alias("HTMLIsIndexElement")
@DOMSupport(DomLevel.ONE)
@JsMetatype
public interface HtmlIsIndex extends HtmlElement {

	@DOMSupport(DomLevel.ONE)
	@BrowserSupport({BrowserType.FIREFOX_2P, BrowserType.OPERA_9P, BrowserType.SAFARI_3P})
	@Property  HtmlForm getForm();

	@DOMSupport(DomLevel.ONE)
	@BrowserSupport({BrowserType.FIREFOX_2P, BrowserType.OPERA_9P, BrowserType.SAFARI_3P})
	@Property  String getPrompt();
	
	@DOMSupport(DomLevel.ONE)
	@BrowserSupport({BrowserType.FIREFOX_2P, BrowserType.OPERA_9P, BrowserType.SAFARI_3P})
	@Property  void setPrompt(String prompt);

	
}
