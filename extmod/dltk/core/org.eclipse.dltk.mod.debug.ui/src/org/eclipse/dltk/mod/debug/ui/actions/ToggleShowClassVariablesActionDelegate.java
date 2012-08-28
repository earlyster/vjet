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
package org.eclipse.dltk.mod.debug.ui.actions;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.dltk.mod.debug.core.DLTKDebugPlugin;
import org.eclipse.dltk.mod.debug.core.DLTKDebugPreferenceConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class ToggleShowClassVariablesActionDelegate implements
		IViewActionDelegate {

	protected Preferences getPrefs() {
		return DLTKDebugPlugin.getDefault().getPluginPreferences();
	}

	public void init(IViewPart view) {

	}

	public void run(IAction action) {
		boolean value = getPrefs().getBoolean(
				DLTKDebugPreferenceConstants.PREF_DBGP_SHOW_SCOPE_CLASS);
		getPrefs().setValue(
				DLTKDebugPreferenceConstants.PREF_DBGP_SHOW_SCOPE_CLASS, !value);
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}
}
