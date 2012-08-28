/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.active.dom.html;

import org.eclipse.vjet.dsf.dom.DProcessingInstruction;
import org.eclipse.vjet.dsf.jsnative.ProcessingInstruction;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;

public class AProcessingInstruction extends ANode implements
		ProcessingInstruction {
	
	private static final long serialVersionUID = 1L;

	protected AProcessingInstruction(AHtmlDocument doc, DProcessingInstruction node) {
		super(doc, node);
		populateScriptable(AProcessingInstruction.class, doc == null ? BrowserType.IE_6P : doc.getBrowserType());
	}

	public String getData() {
		return getDPi().getData();
	}

	public String getTarget() {
		return getDPi().getTarget();
	}

	public void setData(String data) {
		getDPi().setData(data);
	}
	
	@Override
	public String getNodeName() {
		// same as ProcessingInstruction.target
		return getTarget();
	}
	
	private DProcessingInstruction getDPi() {
		return (DProcessingInstruction) getDNode();
	}

}
