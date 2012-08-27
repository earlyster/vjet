/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.active.client;

import org.eclipse.vjet.dsf.active.dom.html.AElement;
import org.eclipse.vjet.dsf.active.dom.html.AHtmlDocument;
import org.eclipse.vjet.dsf.active.event.IBrowserBinding;
import org.eclipse.vjet.dsf.jsnative.TextRectangle;
import org.eclipse.vjet.dsf.jsnative.TextRectangleList;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;

public class ATextRectangleList extends ActiveObject implements
		TextRectangleList {
	public ATextRectangleList(AHtmlDocument doc, AElement elem,
			IBrowserBinding browserBinding) {
		populateScriptable(ATextRectangleList.class,
				doc == null ? BrowserType.IE_6P : doc.getBrowserType());
	}

	public long getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	public TextRectangle item(long index) {
		// TODO Auto-generated method stub
		return null;
	}
}
