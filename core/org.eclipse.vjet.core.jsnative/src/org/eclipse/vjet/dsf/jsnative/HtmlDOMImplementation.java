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
import org.eclipse.vjet.dsf.jsnative.anno.DOMSupport;
import org.eclipse.vjet.dsf.jsnative.anno.DomLevel;
import org.eclipse.vjet.dsf.jsnative.anno.Function;
import org.eclipse.vjet.dsf.jsnative.anno.JsMetatype;

	
/**
 * The <code>HtmlDOMImplementation</code> interface extends the <code>DOMImplementation</code> interface with 
 * a method for creating an HTML document instance. 
 *
 */
@Alias("HTMLDOMImplementation")
@DOMSupport(DomLevel.THREE)
@JsMetatype
public interface HtmlDOMImplementation extends DOMImplementation {
	
	/**
	 * Creates an <code>HTMLDocument</code> object with the minimal tree made of the following elements: 
	 * HTML, HEAD, TITLE, and BODY.
	 * @param title The title of the document to be set as the content of the TITLE element, 
	 * through a child Text node.
	 * @return HTMLDocument A new <code>HTMLDocument</code> object.
	 */
    @Function HtmlDocument createHTMLDocument(String title);

}

