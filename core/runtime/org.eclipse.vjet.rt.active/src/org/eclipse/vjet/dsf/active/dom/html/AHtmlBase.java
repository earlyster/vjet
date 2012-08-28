/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.active.dom.html;

import org.eclipse.vjet.dsf.html.dom.DBase;
import org.eclipse.vjet.dsf.html.dom.EHtmlAttr;
import org.eclipse.vjet.dsf.jsnative.HtmlBase;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;

public class AHtmlBase extends AHtmlElement implements HtmlBase {

	private static final long serialVersionUID = 1L;
	
	protected AHtmlBase(AHtmlDocument doc, DBase node) {
		super(doc, node);
		populateScriptable(AHtmlBase.class, doc == null ? BrowserType.IE_6P : doc.getBrowserType());
	}

	public String getHref() {
		return getDBase().getHtmlHref();
	}

	public String getTarget() {
		return getDBase().getHtmlTarget();
	}

	public void setHref(String href) {
		getDBase().setHtmlHref(href);
		onAttrChange(EHtmlAttr.href, href);
	}

	public void setTarget(String target) {
		getDBase().setHtmlTarget(target);
		onAttrChange(EHtmlAttr.target, target);
	}
	
	private DBase getDBase() {
		return (DBase) getDNode();
	}

}
