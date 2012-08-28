/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.html.js;

import org.eclipse.vjet.dsf.html.dom.DLabel;

@SuppressWarnings("serial")
public class JSLabel extends JSElement {

	private DLabel label = null;

	private JSLabel() {
	}

	/** Creates new JSLabel */
	public JSLabel(JSWindow window, DLabel label) {
		super(window, label);

		this.label = label;
	}
	
	public void setText(final String text){
		label.setHtmlExtTextValue(text);
		getListener().onElementChange(label);
	}
}
