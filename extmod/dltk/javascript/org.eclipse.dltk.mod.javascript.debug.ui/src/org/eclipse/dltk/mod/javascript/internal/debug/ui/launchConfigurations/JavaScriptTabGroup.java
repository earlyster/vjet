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
package org.eclipse.dltk.mod.javascript.internal.debug.ui.launchConfigurations;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.dltk.mod.debug.ui.launchConfigurations.ScriptBuildTab;
import org.eclipse.dltk.mod.javascript.internal.debug.ui.interpreters.JavaScriptInterpreterTab;

public class JavaScriptTabGroup extends AbstractLaunchConfigurationTabGroup {
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				new JavaScriptMainLaunchConfigurationTab(mode),
				new JavaScriptArgumentsTab(), new ScriptBuildTab(),
				new JavaScriptInterpreterTab(), new EnvironmentTab(),
				// new SourceContainerLookupTab(),
				// new CommonTab()
				new JavaScriptCommonTab() };
		setTabs(tabs);
	}
}
