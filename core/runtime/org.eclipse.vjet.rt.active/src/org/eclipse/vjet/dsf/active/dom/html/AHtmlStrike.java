/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.active.dom.html;

import org.eclipse.vjet.dsf.html.dom.DStrike;
import org.eclipse.vjet.dsf.jsnative.HtmlStrike;

public class AHtmlStrike extends AHtmlElement implements HtmlStrike {

	private static final long serialVersionUID = 1L;

	protected AHtmlStrike(DStrike node) {
		this(null, node);
	}
	
	protected AHtmlStrike(AHtmlDocument doc, DStrike node) {
		super(doc, node);
	}
}
