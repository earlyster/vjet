/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.active.dom.html;

import org.eclipse.vjet.dsf.dom.DNode;
import org.eclipse.vjet.dsf.html.dom.DHtmlDocument;

/**
 * For framework only. Application should not use it.
 */
public class AHtmlInternal {

	protected static DHtmlDocument getInternalDocument(AHtmlDocument adoc){
		return adoc == null ? null : adoc.getDHtmlDocument();
	}
	
	protected static DNode getInternalNode(ANode node) {
		if (node == null) return null;
		return node.getDNode();
	}
}
