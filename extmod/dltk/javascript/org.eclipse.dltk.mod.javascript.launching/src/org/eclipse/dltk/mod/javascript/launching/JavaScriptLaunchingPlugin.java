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
package org.eclipse.dltk.mod.javascript.launching;

import java.io.IOException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.dltk.mod.core.environment.IDeployment;
import org.eclipse.dltk.mod.core.environment.IExecutionEnvironment;
import org.eclipse.dltk.mod.core.environment.IFileHandle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class JavaScriptLaunchingPlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.dltk.mod.tcl.launching";

	// The shared instance
	private static JavaScriptLaunchingPlugin plugin;

	/**
	 * The constructor
	 */
	public JavaScriptLaunchingPlugin() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static JavaScriptLaunchingPlugin getDefault() {
		return plugin;
	}

	public static String getUniqueIdentifier() {
		return PLUGIN_ID;
	}

	public IFileHandle getConsoleProxy(IExecutionEnvironment exeEnv)
			throws IOException {
		IDeployment deployment = exeEnv.createDeployment();
		IPath path = deployment.add(this.getBundle(), "console");
		path.append("ConsoleProxy.js");
		return deployment.getFile(path);
	}

}