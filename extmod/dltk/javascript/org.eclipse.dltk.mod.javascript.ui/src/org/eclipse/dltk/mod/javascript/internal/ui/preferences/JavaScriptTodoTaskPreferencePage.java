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

import org.eclipse.core.runtime.Preferences;
import org.eclipse.dltk.mod.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.mod.ui.preferences.TodoTaskAbstractPreferencePage;

public class JavaScriptTodoTaskPreferencePage extends
		TodoTaskAbstractPreferencePage {

	protected Preferences getPluginPreferences() {
		return JavaScriptPlugin.getDefault().getPluginPreferences();
	}

	protected String getHelpId() {
		return null;
	}

	protected void setDescription() {
		setDescription(JavaScriptPreferenceMessages.TodoTaskDescription);
	}
}
