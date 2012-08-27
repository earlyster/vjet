/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.active.util;

import org.eclipse.vjet.dsf.active.dom.html.ANode;
import org.eclipse.vjet.dsf.active.dom.html.ANodeInternal;
import org.eclipse.vjet.dsf.html.HtmlWriterHelper;
import org.eclipse.vjet.dsf.html.XHtmlWriterHelper;
import org.eclipse.vjet.dsf.common.xml.IIndenter;

public final class ANodeHelper extends ANodeInternal {
	
	public static String getHtmlText(ANode node) {
		return HtmlWriterHelper.asString(ANodeInternal.getInternalNode(node));
	}
	
	public static String getHtmlText(ANode node, IIndenter indenter) {
		return HtmlWriterHelper.asString(ANodeInternal.getInternalNode(node),indenter);
	}
	
	public static String getXHtmlText(ANode node) {
		return XHtmlWriterHelper.asString(ANodeInternal.getInternalNode(node));
	}
	
	public static String getXHtmlText(ANode node, IIndenter indenter) {
		return XHtmlWriterHelper.asString(ANodeInternal.getInternalNode(node),indenter);
	}
	

	
}
