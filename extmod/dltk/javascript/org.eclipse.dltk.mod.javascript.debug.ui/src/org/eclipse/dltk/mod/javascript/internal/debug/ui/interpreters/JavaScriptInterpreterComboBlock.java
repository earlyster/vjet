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
package org.eclipse.dltk.mod.javascript.internal.debug.ui.interpreters;

import org.eclipse.dltk.mod.debug.ui.launchConfigurations.IMainLaunchConfigurationTabListenerManager;
import org.eclipse.dltk.mod.internal.debug.ui.interpreters.AbstractInterpreterComboBlock;
import org.eclipse.dltk.mod.javascript.core.JavaScriptNature;
import org.eclipse.jface.preference.IPreferencePage;

public class JavaScriptInterpreterComboBlock extends
		AbstractInterpreterComboBlock {

	protected JavaScriptInterpreterComboBlock(
			IMainLaunchConfigurationTabListenerManager tab) {
		super(tab);
	}

	protected void showInterpreterPreferencePage() {
		IPreferencePage page = new JavaScriptInterpreterPreferencePage();
		//showPrefPage("org.eclipse.dltk.mod.tcl.debug.ui.interpreters.TclInterpreterPreferencePage", page); //$NON-NLS-1$
	}

	protected String getCurrentLanguageNature() {
		return JavaScriptNature.NATURE_ID;
	}
}
