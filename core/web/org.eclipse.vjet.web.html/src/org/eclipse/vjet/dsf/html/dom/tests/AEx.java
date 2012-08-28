/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.html.dom.tests;

import org.eclipse.vjet.dsf.html.HtmlWriterHelper;
import org.eclipse.vjet.dsf.html.dom.DHtmlDocument;
import org.eclipse.vjet.dsf.html.dom.DHtmlDocumentBuilder;
import org.eclipse.vjet.dsf.common.FileUtils;

import org.eclipse.vjet.dsf.common.xml.IIndenter;

public class AEx {
	public static void main(String[] args) {
		String xml = FileUtils.getResourceString(AEx.class, "A.xml") ;
		DHtmlDocument doc = DHtmlDocumentBuilder.getDocument(xml) ;
		String s = HtmlWriterHelper.asString(doc, new IIndenter.Pretty()) ;
		System.out.println(s) ;
	}
}
