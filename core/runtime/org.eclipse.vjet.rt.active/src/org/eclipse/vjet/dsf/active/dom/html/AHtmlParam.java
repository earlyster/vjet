/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.active.dom.html;

import org.eclipse.vjet.dsf.html.dom.DParam;
import org.eclipse.vjet.dsf.html.dom.EHtmlAttr;
import org.eclipse.vjet.dsf.jsnative.HtmlParam;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;

public class AHtmlParam extends AHtmlElement implements HtmlParam {

	private static final long serialVersionUID = 1L;
	
	protected AHtmlParam(AHtmlDocument doc, DParam dp) {
		super(doc, dp);
		populateScriptable(AHtmlParam.class, doc == null ? BrowserType.IE_6P : doc.getBrowserType());
	}

	public String getName() {
		return getDParam().getHtmlName();
	}

	public String getType() {
		return getDParam().getHtmlType();
	}

	public String getValue() {
		return getDParam().getHtmlValue();
	}

	public String getValueType() {
		return getDParam().getHtmlValueType();
	}

	public void setName(String name) {
		getDParam().setHtmlName(name);
		onAttrChange(EHtmlAttr.name, name);
	}

	public void setType(String type) {
		getDParam().setHtmlType(type);
		onAttrChange(EHtmlAttr.type, type);
	}

	public void setValue(String value) {
		getDParam().setHtmlValue(value);
		onValueChange(value);
	}

	public void setValueType(String valueType) {
		getDParam().setHtmlValueType(valueType);
		onAttrChange(EHtmlAttr.valuetype, valueType);
	}
	
	private DParam getDParam() {
		return (DParam) getDNode();
	}

}
