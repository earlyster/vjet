/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.dap.rt;

import org.eclipse.vjet.dsf.common.exceptions.DsfRuntimeException;
import org.eclipse.vjet.dsf.jsnative.HtmlDocument;
import org.eclipse.vjet.dsf.jsnative.Window;

public abstract class JsBase {
	
	protected static Window window() {
		org.eclipse.vjet.dsf.jsnative.Window window = DapCtx.window();
		if (window == null) {
			throw new DsfRuntimeException("window did not exist");
		}
		return window;
	}
	
	protected static HtmlDocument document() {
		HtmlDocument document = DapCtx.document();
		if (document == null) {
			throw new DsfRuntimeException("document did not exist");
		}
		return document;
	}
}
