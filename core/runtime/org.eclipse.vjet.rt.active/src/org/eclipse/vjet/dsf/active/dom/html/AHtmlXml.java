/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.active.dom.html;

import org.eclipse.vjet.dsf.html.dom.DXml;
import org.eclipse.vjet.dsf.html.dom.EHtmlAttr;
import org.eclipse.vjet.dsf.jsnative.HtmlXml;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;

public class AHtmlXml extends AHtmlElement implements HtmlXml {

	private static final long serialVersionUID = 1L;
	
	protected AHtmlXml(AHtmlDocument doc, DXml node) {
		super(doc, node);
		populateScriptable(AHtmlXml.class, doc == null ? BrowserType.IE_6P : doc.getBrowserType());
	}

	public String getSrc() {
		return getDXml().getHtmlSrc();
	}

	public void setSrc(String src) {
		getDXml().setHtmlSrc(src);
		onAttrChange(EHtmlAttr.src, src);
	}
	
	private DXml getDXml() {
		return (DXml) getDNode();
	}
}
