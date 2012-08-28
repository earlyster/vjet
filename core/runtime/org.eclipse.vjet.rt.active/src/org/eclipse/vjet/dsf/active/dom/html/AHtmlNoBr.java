/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.active.dom.html;

import org.eclipse.vjet.dsf.html.dom.DNoBr;
import org.eclipse.vjet.dsf.jsnative.HtmlNoBr;

public class AHtmlNoBr extends AHtmlElement implements HtmlNoBr {

	private static final long serialVersionUID = 1L;

	protected AHtmlNoBr(DNoBr br) {
		this(null, br);
	}
	
	protected AHtmlNoBr(AHtmlDocument doc, DNoBr br) {
		super(doc, br);
	}
}
