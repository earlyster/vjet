/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.active.dom.html;

import org.eclipse.vjet.dsf.html.dom.DIsIndex;
import org.eclipse.vjet.dsf.html.dom.EHtmlAttr;
import org.eclipse.vjet.dsf.jsnative.HtmlForm;
import org.eclipse.vjet.dsf.jsnative.HtmlIsIndex;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;

public class AHtmlIsIndex extends AHtmlElement implements HtmlIsIndex {

	private static final long serialVersionUID = 1L;
	
	protected AHtmlIsIndex(AHtmlDocument doc, DIsIndex node) {
		super(doc, node);
		populateScriptable(AHtmlIsIndex.class, doc == null ? BrowserType.IE_6P : doc.getBrowserType());
	}

	public HtmlForm getForm() {
		return super.getFormInternal();
	}

	public String getPrompt() {
		return getDIsIndex().getHtmlPrompt();
	}

	public void setPrompt(String prompt) {
		getDIsIndex().setHtmlPrompt(prompt);
		onAttrChange(EHtmlAttr.prompt, prompt);
	}
	
	private DIsIndex getDIsIndex() {
		return (DIsIndex) getDNode();
	}
}
