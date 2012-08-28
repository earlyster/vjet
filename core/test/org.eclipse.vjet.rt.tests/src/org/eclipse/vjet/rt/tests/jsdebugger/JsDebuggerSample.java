/*******************************************************************************
 * Copyright (c) 2012 eBay Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     eBay Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.vjet.rt.tests.jsdebugger;
import java.io.IOException;

import org.eclipse.vjet.dsf.active.client.AHtmlParser;
import org.eclipse.vjet.dsf.active.client.AWindow;
import org.eclipse.vjet.dsf.html.js.ActiveJsExecutionControlCtx;

import org.eclipse.vjet.dsf.common.resource.ResourceUtil;

 public class JsDebuggerSample {
     public static void main(String[] args) throws IOException {
         ActiveJsExecutionControlCtx.ctx().setExecuteJavaScript(true);
         AWindow window = (AWindow) AHtmlParser.parse(
             ResourceUtil.getResource(JsDebuggerSample.class, "Sample.html"));
         System.out.println(HtmlDisplayer.getHtml(window));
    }
}
