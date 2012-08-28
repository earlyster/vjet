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
package org.eclipse.dltk.mod.javascript.jsjdtdebugger.handler;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.dltk.mod.javascript.jsjdtdebugger.JavaScriptAndJdtDebuggerPlugin;
import org.eclipse.dltk.mod.javascript.jsjdtdebugger.preferences.IJavaScriptAndJdtDebuggerPreferenceConstants;

public class ToggleSuspendOnException extends
		AbstractTogglePreferenceKeyHandler {

	protected Preferences getPreferences() {
		return JavaScriptAndJdtDebuggerPlugin.getDefault()
				.getPluginPreferences();
	}

	protected String getKey() {
		return IJavaScriptAndJdtDebuggerPreferenceConstants.PREF_BREAK_ON_EXCEPTION;
	}
}
