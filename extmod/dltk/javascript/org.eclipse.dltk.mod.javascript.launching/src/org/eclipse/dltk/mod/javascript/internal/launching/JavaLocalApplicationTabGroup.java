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
package org.eclipse.dltk.mod.javascript.internal.launching;

import org.eclipse.debug.ui.ILaunchConfigurationDialog;

public class JavaLocalApplicationTabGroup extends org.eclipse.jdt.internal.debug.ui.launcher.LocalJavaApplicationTabGroup {

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		super.createTabs(dialog, mode);
//		ILaunchConfigurationTab[] tabs = getTabs();
//		List tabsArray = new ArrayList(tabs.length + 1);
//		tabsArray.add(new ProfilerSettingsTab());
//		for (int i = 0; i < tabs.length; i++) {
//			tabsArray.add(tabs[i]);
//		}
//		setTabs((ILaunchConfigurationTab[]) tabsArray.toArray(new ILaunchConfigurationTab[tabsArray.size()]));
	}

}
