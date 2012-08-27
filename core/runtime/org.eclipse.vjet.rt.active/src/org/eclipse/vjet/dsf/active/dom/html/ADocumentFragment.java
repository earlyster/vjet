/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.active.dom.html;

import org.eclipse.vjet.dsf.dom.DDocumentFragment;
import org.eclipse.vjet.dsf.jsnative.DocumentFragment;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;

public class ADocumentFragment extends ANode implements DocumentFragment {

	private static final long serialVersionUID = 1L;
	
	protected ADocumentFragment(AHtmlDocument doc, DDocumentFragment node) {
		super(doc, node);
		populateScriptable(ADocumentFragment.class, doc == null ? BrowserType.IE_6P : doc.getBrowserType());
	}
	
	@Override
	public String getNodeName() {
		return "#document-fragment";
	}
	
}