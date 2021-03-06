/*******************************************************************************
 * Copyright (c) 2000, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.dltk.mod.javascript.internal.launching;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.Launch;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.dltk.mod.console.ScriptConsoleServer;
import org.eclipse.dltk.mod.core.DLTKCore;
import org.eclipse.dltk.mod.core.IScriptProject;
import org.eclipse.dltk.mod.javascript.internal.debug.JavaScriptDebugPlugin;
import org.eclipse.dltk.mod.javascript.launching.IConfigurableRunner;
import org.eclipse.dltk.mod.javascript.launching.IJavaScriptInterpreterRunnerConfig;
import org.eclipse.dltk.mod.javascript.launching.JavaScriptLaunchConfigurationConstants;
import org.eclipse.dltk.mod.launching.AbstractInterpreterRunner;
import org.eclipse.dltk.mod.launching.AbstractScriptLaunchConfigurationDelegate;
import org.eclipse.dltk.mod.launching.IInterpreterInstall;
import org.eclipse.dltk.mod.launching.InterpreterConfig;
import org.eclipse.dltk.mod.launching.debug.DbgpConstants;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMRunner;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.VMRunnerConfiguration;
import org.osgi.framework.Bundle;

public class JavaScriptInterpreterRunner extends AbstractInterpreterRunner
		implements IConfigurableRunner {

	public static final IJavaScriptInterpreterRunnerConfig DEFAULT_CONFIG = new IJavaScriptInterpreterRunnerConfig() {

		public void adjustRunnerConfiguration(VMRunnerConfiguration vconfig,
				InterpreterConfig iconfig, ILaunch launch, IJavaProject project) {

		}

		public String[] computeClassPath(InterpreterConfig config,
				ILaunch launch, IJavaProject project) throws Exception {
			return JavaScriptInterpreterRunner.getClassPath(project);
		}

		public String[] getProgramArguments(InterpreterConfig config,
				ILaunch launch, IJavaProject project) {
			return new String[0];
		}

		public String getRunnerClassName(InterpreterConfig config,
				ILaunch launch, IJavaProject project) {
			return "RhinoRunner";
		}

	};
	private IJavaScriptInterpreterRunnerConfig config = DEFAULT_CONFIG;

	public void run(InterpreterConfig config, ILaunch launch,
			IProgressMonitor monitor) throws CoreException {
		doRunImpl(config, launch, this.config);
	}

	public static void doRunImpl(InterpreterConfig config, ILaunch launch,
			IJavaScriptInterpreterRunnerConfig iconfig) throws CoreException {

		String host = (String) config.getProperty(DbgpConstants.HOST_PROP);
		if (host == null) {
			host = "";
		}

		String port = (String) config.getProperty(DbgpConstants.PORT_PROP);
		if (port == null) {
			port = "";
		}

		String sessionId = (String) config
				.getProperty(DbgpConstants.SESSION_ID_PROP);

		if (sessionId == null) {
			sessionId = "";
		}

		IScriptProject proj = AbstractScriptLaunchConfigurationDelegate
				.getScriptProject(launch.getLaunchConfiguration());
		IJavaProject myJavaProject = JavaCore.create(proj.getProject());
		IVMInstall vmInstall = myJavaProject.exists() ? JavaRuntime
				.getVMInstall(myJavaProject) : JavaRuntime
				.getDefaultVMInstall();
		if (vmInstall != null) {
			IVMRunner vmRunner = vmInstall
					.getVMRunner(ILaunchManager.DEBUG_MODE);
			if (vmRunner != null) {
				{

					try {

						try {
							String[] newClassPath = getClassPath(myJavaProject);

							VMRunnerConfiguration vmConfig = new VMRunnerConfiguration(
									iconfig.getRunnerClassName(config, launch,
											myJavaProject), newClassPath);
							IPath scriptFilePath = config.getScriptFilePath();
							if (scriptFilePath == null) {
								throw new CoreException(new Status(
										IStatus.ERROR,
										JavaScriptDebugPlugin.PLUGIN_ID,
										"Script File name is not specified..."));
							}
							String[] strings = new String[] {
									scriptFilePath.toPortableString(), host,
									"" + port, sessionId };
							String[] newStrings = iconfig.getProgramArguments(
									config, launch, myJavaProject);
							String[] rs = new String[strings.length
									+ newStrings.length];
							for (int a = 0; a < strings.length; a++)
								rs[a] = strings[a];
							for (int a = 0; a < newStrings.length; a++)
								rs[a + strings.length] = newStrings[a];
							vmConfig.setProgramArguments(strings);
							ILaunch launchr = new Launch(launch
									.getLaunchConfiguration(),
									ILaunchManager.DEBUG_MODE, null);
							iconfig.adjustRunnerConfiguration(vmConfig, config,
									launch, myJavaProject);
							vmRunner.run(vmConfig, launchr, null);
							IDebugTarget[] debugTargets = launchr
									.getDebugTargets();
							for (int a = 0; a < debugTargets.length; a++) {
								launch.addDebugTarget(debugTargets[a]);
							}
							IProcess[] processes = launchr.getProcesses();
							for (int a = 0; a < processes.length; a++)
								launch.addProcess(processes[a]);
							return;
						} catch (URISyntaxException e) {
							e.printStackTrace();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		throw new CoreException(new Status(IStatus.ERROR, "", ""));
	}

	public static String[] getClassPath(IJavaProject myJavaProject)
			throws IOException, URISyntaxException {
		Bundle bundle = Platform
				.getBundle(GenericJavaScriptInstallType.EMBEDDED_RHINO_BUNDLE_ID);

		Bundle bundle1 = Platform
				.getBundle(GenericJavaScriptInstallType.DBGP_FOR_RHINO_BUNDLE_ID);
		URL resolve = FileLocator.toFileURL(bundle1
				.getResource("RhinoRunner.class"));
		String externalForm = resolve.toExternalForm();
		File fl = new File(toURI(externalForm)).getParentFile();
		URL fileURL = FileLocator.toFileURL(bundle
				.getResource("org/mozilla/classfile/ByteCode.class"));
		String externalForm2 = fileURL.toExternalForm();
		File fl1 = new File(toURI(externalForm2)).getParentFile()
				.getParentFile().getParentFile().getParentFile();
		String[] classPath = null;
		try {
			classPath = computeBaseClassPath(myJavaProject);
		} catch (CoreException e) {
		}
		String[] newClassPath = new String[classPath.length + 2];
		System.arraycopy(classPath, 0, newClassPath, 0, classPath.length);
		newClassPath[classPath.length] = fl.getAbsolutePath();
		newClassPath[classPath.length + 1] = fl1.getAbsolutePath();
		return newClassPath;
	}

	private static URI toURI(String externalForm) throws MalformedURLException {
		URL url = new URL(replaceSpaces(externalForm));
		try {
			return new URI(url.toString());
		} catch (URISyntaxException e) {
			throw new MalformedURLException(e.getMessage());
		}
	}

	private static String replaceSpaces(String text) {
		return text.replaceAll(" ", "%20");
	}

	protected static String[] computeBaseClassPath(IJavaProject myJavaProject)
			throws CoreException {
		if (!myJavaProject.exists())
			return new String[0];
		return JavaRuntime.computeDefaultRuntimeClassPath(myJavaProject);
	}

	protected String constructProgramString(InterpreterConfig config)
			throws CoreException {

		return "";
	}

	public JavaScriptInterpreterRunner(IInterpreterInstall install) {
		super(install);
	}

	protected String[] alterCommandLine(String[] cmdLine, String id) {
		ScriptConsoleServer server = ScriptConsoleServer.getInstance();
		String port = Integer.toString(server.getPort());
		String[] newCmdLine = new String[cmdLine.length + 4];

		newCmdLine[0] = cmdLine[0];
		newCmdLine[1] = DLTKCore.getDefault().getStateLocation().append(
				"tcl_proxy").toOSString();

		newCmdLine[2] = "localhost";
		newCmdLine[3] = port;
		newCmdLine[4] = id;

		for (int i = 1; i < cmdLine.length; ++i) {
			newCmdLine[i + 4] = cmdLine[i];
		}

		return newCmdLine;
	}

	protected String getProcessType() {
		return JavaScriptLaunchConfigurationConstants.ID_JAVASCRIPT_PROCESS_TYPE;
	}

	public void setRunnerConfig(IJavaScriptInterpreterRunnerConfig config) {
		this.config = config;
	}
}
