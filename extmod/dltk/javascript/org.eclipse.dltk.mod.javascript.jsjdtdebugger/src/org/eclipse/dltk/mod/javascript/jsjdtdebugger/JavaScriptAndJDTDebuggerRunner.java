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
package org.eclipse.dltk.mod.javascript.jsjdtdebugger;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.dltk.mod.core.PreferencesLookupDelegate;
import org.eclipse.dltk.mod.javascript.internal.debug.JavaScriptDebugConstants;
import org.eclipse.dltk.mod.javascript.internal.debug.JavaScriptDebugPlugin;
import org.eclipse.dltk.mod.javascript.internal.launching.JavaScriptInterpreterRunner;
import org.eclipse.dltk.mod.javascript.launching.IConfigurableRunner;
import org.eclipse.dltk.mod.javascript.launching.IJavaScriptInterpreterRunnerConfig;
import org.eclipse.dltk.mod.launching.DebuggingEngineRunner;
import org.eclipse.dltk.mod.launching.IInterpreterInstall;
import org.eclipse.dltk.mod.launching.InterpreterConfig;

public class JavaScriptAndJDTDebuggerRunner extends DebuggingEngineRunner
		implements IConfigurableRunner {

	public static String ENGINE_ID = "org.eclipse.dltk.mod.javascript.jsjdtdebugger";

	IJavaScriptInterpreterRunnerConfig runnerconfig = JavaScriptInterpreterRunner.DEFAULT_CONFIG;

	public JavaScriptAndJDTDebuggerRunner(IInterpreterInstall install) {
		super(install);
	}

	public String getDebugModelId() {
		return JavaScriptDebugConstants.DEBUG_MODEL_ID;
	}

	public void run(InterpreterConfig config, ILaunch launch,
			IProgressMonitor monitor) throws CoreException {
		initializeLaunch(launch, config,
				createPreferencesLookupDelegate(launch));
		JavaScriptInterpreterRunner
				.doRunImpl(config, launch, this.runnerconfig);
	}

	public void setRunnerConfig(IJavaScriptInterpreterRunnerConfig config) {
		this.runnerconfig = config;
	}

	protected String getDebuggingEngineId() {
		return ENGINE_ID;
	}

	/**
	 * @deprecated Use {@link #addEngineConfig(InterpreterConfig,PreferencesLookupDelegate,ILaunch)} instead
	 */
	protected InterpreterConfig addEngineConfig(InterpreterConfig config,
			PreferencesLookupDelegate delegate) throws CoreException {
				return addEngineConfig(config, delegate, null);
			}

	protected InterpreterConfig addEngineConfig(InterpreterConfig config,
			PreferencesLookupDelegate delegate, ILaunch launch) throws CoreException {
		return config;
	}

	protected String getDebugPreferenceQualifier() {
		return JavaScriptDebugPlugin.PLUGIN_ID;
	}

	protected String getDebuggingEnginePreferenceQualifier() {
		return JavaScriptAndJdtDebuggerPlugin.PLUGIN_ID;
	}

	protected String getLoggingEnabledPreferenceKey() {
		// not yet supported...
		return null;
	}

	protected String getLogFileNamePreferenceKey() {
		// not yet supported...
		return null;
	}

	protected String getLogFilePathPreferenceKey() {
		// not yet supported...
		return null;
	}
}
