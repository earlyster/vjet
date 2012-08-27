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
