/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.active.dom.html;

import org.eclipse.vjet.dsf.html.dom.DHtml;
import org.eclipse.vjet.dsf.html.dom.EHtmlAttr;
import org.eclipse.vjet.dsf.jsnative.HtmlHtml;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;

public class AHtmlHtml extends AHtmlElement implements  HtmlHtml {

	private static final long serialVersionUID = 1L;
	
	protected AHtmlHtml(AHtmlDocument doc, DHtml html) {
		super(doc, html);
		populateScriptable(AHtmlHtml.class, doc == null ? BrowserType.IE_6P : doc.getBrowserType());
	}

	public String getVersion() {
		return getDHtml().getHtmlVersion();
	}

	public void setVersion(String version) {
		getDHtml().setHtmlVersion(version);
		onAttrChange(EHtmlAttr.version, version);
	}
	
	private DHtml getDHtml() {
		return (DHtml) getDNode();
	}

}
