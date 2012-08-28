/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.active.dom.html;

import org.eclipse.vjet.dsf.html.dom.DCol;
import org.eclipse.vjet.dsf.html.dom.EHtmlAttr;
import org.eclipse.vjet.dsf.jsnative.HtmlTableCol;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;

public class AHtmlTableCol extends AHtmlElement implements HtmlTableCol {
	
	private static final long serialVersionUID = 1L;

	protected AHtmlTableCol(AHtmlDocument doc, DCol node) {
		super(doc, node);
		populateScriptable(AHtmlTableCol.class, doc == null ? BrowserType.IE_6P : doc.getBrowserType());
	}

	public String getAlign() {
		return getDCol().getHtmlAlign();
	}

	public String getCh() {
		return getDCol().getHtmlCh();
	}
	
	public String getChar() {
		return getCh();
	}

	public String getChOff() {
		return getDCol().getHtmlChOff();
	}
	
	public String getCharoff() {
		return getChOff();
	}

	public int getSpan() {
		return getDCol().getHtmlSpan();
	}

	public String getVAlign() {
		return getDCol().getHtmlValign();
	}

	public String getWidth() {
		return getDCol().getHtmlWidth();
	}

	public void setAlign(String align) {
		getDCol().setHtmlAlign(align);
		onAttrChange(EHtmlAttr.align, align);
	}

	public void setCh(String _char) {
		getDCol().setHtmlCh(_char);
		onAttrChange(EHtmlAttr._char, _char);
	}
	
	public void setChar(String ch) {
		setCh(ch);
	}

	public void setChOff(String charoff) {
		getDCol().setHtmlChOff(charoff);
		onAttrChange(EHtmlAttr.charoff, charoff);
	}
	
	public void setCharoff(String chOff) {
		setChOff(chOff);
	}

	public void setSpan(int span) {
		getDCol().setHtmlSpan(span);
		onAttrChange(EHtmlAttr.span, String.valueOf(span));
	}

	public void setVAlign(String valign) {
		getDCol().setHtmlValign(valign);
		onAttrChange(EHtmlAttr.valign, valign);
	}

	public void setWidth(String width) {
		getDCol().setHtmlWidth(width);
		onAttrChange(EHtmlAttr.width, width);
	}
	
	private DCol getDCol() {
		return (DCol) getDNode();
	}









}
