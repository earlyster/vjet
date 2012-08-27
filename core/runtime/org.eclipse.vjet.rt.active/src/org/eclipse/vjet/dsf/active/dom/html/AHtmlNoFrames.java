/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.active.dom.html;

import org.eclipse.vjet.dsf.html.dom.DNoFrames;
import org.eclipse.vjet.dsf.jsnative.HtmlNoFrames;

public class AHtmlNoFrames extends AHtmlElement implements HtmlNoFrames {

	private static final long serialVersionUID = 1L;

	protected AHtmlNoFrames(DNoFrames node) {
		this(null, node);
	}
	
	protected AHtmlNoFrames(AHtmlDocument doc, DNoFrames node) {
		super(doc, node);
	}
}
