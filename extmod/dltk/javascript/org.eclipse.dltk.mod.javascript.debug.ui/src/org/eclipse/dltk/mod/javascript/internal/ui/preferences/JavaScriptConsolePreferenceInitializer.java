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
package org.eclipse.dltk.mod.javascript.internal.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.dltk.mod.javascript.console.JavaScriptConsoleConstants;
import org.eclipse.dltk.mod.javascript.internal.debug.ui.JavaScriptDebugUIPlugin;
import org.eclipse.jface.preference.IPreferenceStore;


public class JavaScriptConsolePreferenceInitializer extends AbstractPreferenceInitializer {

	public JavaScriptConsolePreferenceInitializer() {
	}

	public void initializeDefaultPreferences() {
		IPreferenceStore store = JavaScriptDebugUIPlugin.getDefault()
				.getPreferenceStore();
		store.setDefault(JavaScriptConsoleConstants.PREF_NEW_PROMPT,
				JavaScriptConsoleConstants.DEFAULT_NEW_PROMPT);
		store.setDefault(JavaScriptConsoleConstants.PREF_CONTINUE_PROMPT,
				JavaScriptConsoleConstants.DEFAULT_CONTINUE_PROMPT);
	}

}
