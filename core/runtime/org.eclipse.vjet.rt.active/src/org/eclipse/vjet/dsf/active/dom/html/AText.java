/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.active.dom.html;

import org.w3c.dom.DOMException;

import org.eclipse.vjet.dsf.dom.DText;
import org.eclipse.vjet.dsf.jsnative.Text;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;

public class AText extends ACharacterData implements Text {

	private static final long serialVersionUID = 1L;
	
	public AText(AHtmlDocument doc, DText text) {
		super(doc, text);
		populateScriptable(
			AText.class, doc == null ? BrowserType.IE_6P : doc.getBrowserType());
	}
	
	public AText(ADocument doc, DText text) {
		super(doc, text);
		populateScriptable(AText.class, BrowserType.NONE);
	}

	/**
	 * DOM 3.0
	 */
	public String getWholeText() {
		//return getDText().getWholeText();
		return getData();
	}

	public boolean isElementContentWhitespace() {
		//return getDText().isElementContentWhitespace();
		return getData().trim().length() == 0;
	}

	public Text replaceWholeText(String content) {
		//return new AText((DText) getDText().replaceWholeText(content));
		setData(content);
		return this;
	}

	public Text splitText(int offset) {
		return new AText(getOwnerDocument(), (DText) getDText().splitText(offset));
	}
	
	@Override
	public String getNodeName() {
		return "#text";
	}
	
	public String getTextContent() throws DOMException {
		return getNodeValue();
	}
	
	private DText getDText() {
		return (DText) getDNode();
	}
}
