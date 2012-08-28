/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.dap.util;

import java.io.StringWriter;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.eclipse.vjet.dsf.common.context.DsfCtx;
import org.eclipse.vjet.dsf.common.xml.IIndenter;
import org.eclipse.vjet.dsf.html.HtmlWriterHelper;
import org.eclipse.vjet.dsf.html.dom.BaseHtmlElement;
import org.eclipse.vjet.dsf.html.dom.DBody;
import org.eclipse.vjet.dsf.html.dom.DHtml;
import org.eclipse.vjet.dsf.html.dom.DHtmlDocument;

public class DapDomHelper {
	
	private static final String BODY = "body";

	public static String getId(final BaseHtmlElement element) {
		
		String id = element.getHtmlId();
		if (id == null || id.trim().length() == 0) {
			if (element.getNodeName().equalsIgnoreCase(BODY)){
				id = getBodyId();
			}
			else {
				id = DsfCtx.ctx().ids().nextHtmlId();
			}
			element.setHtmlId(id);
		}
		return id;
	}
	
	public static String getBodyId() {
		return BODY;
	}
	
	public static String getPath(final Node node){
		return getPath(node, true);
	}
	
	public static String getPath(final Node node, boolean useId){
		if (node == null){
			return null;
		}
		
		if (node instanceof BaseHtmlElement && useId) {
			String id = ((BaseHtmlElement)node).getHtmlId();
			if (id != null && id.length() > 0) {
				if (!isInDoc(node)) {
					return null;
				}
				return "document.getElementById('" + id + "')";
			}
		}
		
		if (node instanceof DBody){
			return "document.body";
		}
		if (node instanceof DHtml){
			return "document.documentElement";
		}
		if (node instanceof DHtmlDocument){
			return "document";
		}
		
		
		Node parent = node.getParentNode();
		if (parent == null){
			return null;
		}
		
		int index = getIndex(parent, node);
		if (index >= 0) {
			String parentPath = getPath(parent);
			if (parentPath != null) {
				return parentPath + ".childNodes[" + String.valueOf(index) + "]";
			}
		}		
		return null;
	}
	
	public static int getIndex(final Node parent, final Node node) {
		// skip calling getChildNodes() if we don't have to.
		if (! parent.hasChildNodes()) return -1 ;
		
		NodeList list = parent.getChildNodes();
		for (int i=0; i<list.getLength(); i++){
			if (list.item(i) == node){
				return i;
			}
		}
		return -1;
	}
	
	public static String getHtml(final Node node){
		final StringWriter writer = new StringWriter(1000);
		HtmlWriterHelper.write(node, writer, IIndenter.COMPACT);
		return writer.toString();
	}
	
	public static boolean isInDoc(final Node node) {
		if (node == null) {
			return false;
		}
		if (node instanceof DBody || node instanceof DHtml){
			return true;
		}
		return isInDoc(node.getParentNode());
	}
}
