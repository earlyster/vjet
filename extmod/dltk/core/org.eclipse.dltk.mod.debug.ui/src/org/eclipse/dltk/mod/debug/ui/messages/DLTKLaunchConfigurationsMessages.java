/*******************************************************************************
 * Copyright (c) 2000, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.mod.debug.ui.messages;

import org.eclipse.osgi.util.NLS;

public class DLTKLaunchConfigurationsMessages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.dltk.mod.debug.ui.messages.ScriptLaunchConfigurationsMessages";//$NON-NLS-1$
	public static String mainTab_title;
	public static String mainTab_projectGroup;
	public static String mainTab_projectButton;
	public static String mainTab_chooseProject_title;
	public static String mainTab_chooseProject_message;
	public static String mainTab_searchButton;
	public static String mainTab_mainModule;
	public static String mainTab_searchButton_title;
	public static String mainTab_searchButton_message;
	public static String error_selectProject;
	public static String error_notAValidProject;
	public static String mainTab_errorDlg_invalidProject;
	public static String mainTab_errorDlg_notALangProject;
	public static String mainTab_errorDlg_reasonNotALangProject;
	public static String error_selectScript;
	public static String error_scriptNotFound;
	public static String MainLaunchConfigurationTab_0;
	public static String MainLaunchConfigurationTab_1;
	public static String MainLaunchConfigurationTab_2;

	public static String remoteTab_title;
	public static String remoteTab_connectionProperties;
	public static String remoteTab_connectionPort;
	public static String remoteTab_connectionIdeKey;
	public static String remoteError_ideKeyEmpty;
	public static String remoteTab_remoteSourceMapping;
	public static String remoteTab_remoteWorkingDir;
	public static String remoteTab_scriptSourceFolders;
	public static String ScriptLaunchConfigurationTab_debugOptions;

	private DLTKLaunchConfigurationsMessages() {
		// dont instatiate
	}

	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME,
				DLTKLaunchConfigurationsMessages.class);
	}
}
