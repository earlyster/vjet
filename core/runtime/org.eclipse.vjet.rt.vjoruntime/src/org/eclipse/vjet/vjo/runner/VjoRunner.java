/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.vjo.runner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.eclipse.vjet.dsf.dap.rt.BodyOnloadAdapter;
import org.eclipse.vjet.dsf.dap.rt.DapCtx;
import org.eclipse.vjet.dsf.dap.rt.DapCtx.ExeMode;
import org.eclipse.vjet.dsf.jsrunner.BrowserRemoteLauncher;
import org.eclipse.vjet.dsf.jsrunner.IBrowserLauncher;
import org.eclipse.vjet.dsf.jsrunner.JsRunner;
import org.eclipse.vjet.dsf.util.JavaSourceLocator;
import org.eclipse.vjet.vjo.VjBootstrapJsr;
import org.eclipse.vjet.vjo.jsunit.JsUnitFailure;
import org.eclipse.vjet.vjo.jsunit.VjoJsUnit;
import org.eclipse.vjet.vjo.loader.VjoConsole;
import org.eclipse.vjet.vjo.loader.VjoLoader;
import org.mozilla.mod.javascript.Scriptable;
import org.mozilla.mod.javascript.ScriptableObject;

/**
 * specialized js runner with vjo runtime enabled
 */
public class VjoRunner extends JsRunner {
	
	public static void main(String[] args) {
		try {
			ProgramInfo info = getProgramInfo(args);
			if (A_MODE_VALUE.equals(info.getOption(DAP_MODE_KEY))) {
				DapCtx.ctx().setExeMode(ExeMode.ACTIVE);
			}
			IBrowserLauncher browserLauncher = null;
			String browserServiceUrl = info.getBrowserServiceUrl();
			if (browserServiceUrl != null) {
				browserLauncher = new BrowserRemoteLauncher(browserServiceUrl);
			}
			VjoRunner runner = new VjoRunner(info, needDebug(), browserLauncher);
			if (runner.m_activeWeb != null) {
				runner.m_activeWeb.waitForWindowLoaded();
				runner.m_activeWeb.waitForExit();
				runner.m_activeWeb.destroy();
				return;
			}
			
			VjoJsUnit jsUnit = new VjoJsUnit();
			runner.enableJsUnit(jsUnit);
			
			runner.complete();
			
			List<JsUnitFailure> failures = jsUnit.getFailures();
			for (JsUnitFailure failure : failures) {
				System.err.println(failure.toString());
			}
		} catch (MalformedURLException e) {
			System.err.println("Provided  JS File path is not correct : "+args[0]);
		}
	}
	
	public VjoRunner(ProgramInfo info, boolean debug) {
		this(info, debug, null);
	}
	
	public VjoRunner(ProgramInfo info, boolean debug, IBrowserLauncher launcher) {
		super(info, debug, launcher);
		if (m_activeWeb != null) {
			return;
		}
		enableVjo();
		if (debug) {
			loadDescriptForDebug();
		}
	}
	
	private void loadDescriptForDebug() {
		Scriptable vjo = (Scriptable)ScriptableObject.getProperty(m_scope, "vjo");
		Scriptable loader = (Scriptable)ScriptableObject.getProperty(vjo, "loader");
		if (loader instanceof VjoLoader) {
			((VjoLoader)loader).load("org.eclipse.vjet.vjo.runner.DescriptUtils");
		}
	}
	
	public void enableJsUnit(VjoJsUnit jsUnit) {
		jsUnit.attach(m_cx, m_scope);
	}
	
	@Override
	public void loadHtml(String htmlFile) {
		super.loadHtml(htmlFile);
		BodyOnloadAdapter.fireOnload(m_window);
	}
	
	@Override
	public void loadHtml(URL url) {
		super.loadHtml(url);
		BodyOnloadAdapter.fireOnload(m_window);
	}
	
	private void enableVjo() {
		URL sourceUrl = null;
		try {
			//load from source if available
			sourceUrl = JavaSourceLocator.getInstance()
				.getSourceUrl(VjBootstrapJsr.getSourceUri(), ".js");
		}
		catch (Throwable e) {
			//Do nothing
		}
		if (sourceUrl == null) {
			sourceUrl = VjBootstrapJsr.getJsAsUrl();
		}
		runScript(sourceUrl);
		VjoLoader.enable(m_cx, m_scope);
		VjoConsole.enable(m_cx, m_scope);
	}
	
	@Override
	protected ActiveWebListener createWebListener(boolean debugEnabled) {
		return new VjoActiveWebListener(debugEnabled);
	}
	
	protected class VjoActiveWebListener extends ActiveWebListener {
		public VjoActiveWebListener(boolean debugEnabled) {
			super(debugEnabled);
		}
		
		public void windowOnload() {
			init();
			
			enableVjo();			
			if (m_debugEnabled) {
				loadDescriptForDebug();
			}
			VjoJsUnit jsUnit = new VjoJsUnit();
			enableJsUnit(jsUnit);
			
			execJs();
			
			List<JsUnitFailure> failures = jsUnit.getFailures();
			for (JsUnitFailure failure : failures) {
				System.err.println(failure.toString());
			}
		}
	}
}
