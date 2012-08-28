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
package org.eclipse.vjet.workbench.javalaunch.utils;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.ui.IStartup;

public class LaunchUtilEarlyStartup implements IStartup {

	@Override
	public void earlyStartup() {
		  // Add a launch listener so we can change the vm args.
        ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
        LaunchListener listener = new LaunchListener();
        launchManager.addLaunchListener(listener);

	}

}
