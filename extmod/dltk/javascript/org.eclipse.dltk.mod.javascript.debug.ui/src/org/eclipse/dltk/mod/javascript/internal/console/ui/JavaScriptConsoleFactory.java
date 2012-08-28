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
package org.eclipse.dltk.mod.javascript.internal.console.ui;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.dltk.mod.console.IScriptInterpreter;
import org.eclipse.dltk.mod.console.ScriptConsolePrompt;
import org.eclipse.dltk.mod.console.ui.IScriptConsoleFactory;
import org.eclipse.dltk.mod.console.ui.ScriptConsole;
import org.eclipse.dltk.mod.console.ui.ScriptConsoleFactoryBase;
import org.eclipse.dltk.mod.javascript.console.JavaScriptConsoleConstants;
import org.eclipse.dltk.mod.javascript.console.JavaScriptConsoleUtil;
import org.eclipse.dltk.mod.javascript.console.JavaScriptInterpreter;
import org.eclipse.dltk.mod.javascript.internal.debug.ui.JavaScriptDebugUIPlugin;
import org.eclipse.jface.preference.IPreferenceStore;


public class JavaScriptConsoleFactory extends ScriptConsoleFactoryBase implements
		IScriptConsoleFactory {
	protected IPreferenceStore getPreferenceStore() {
		return JavaScriptDebugUIPlugin.getDefault().getPreferenceStore();
	}

	protected ScriptConsolePrompt makeInvitation() {
		IPreferenceStore store = getPreferenceStore();
		return new ScriptConsolePrompt(store
				.getString(JavaScriptConsoleConstants.PREF_NEW_PROMPT), store
				.getString(JavaScriptConsoleConstants.PREF_CONTINUE_PROMPT));
	}

	protected JavaScriptConsole makeConsole(JavaScriptInterpreter interpreter, String id) {
		JavaScriptConsole console = new JavaScriptConsole(interpreter, id);
		console.setPrompt(makeInvitation());
		return console;
	}

	private JavaScriptConsole createConsoleInstance(IScriptInterpreter interpreter, String id) {
		if (interpreter == null) {
			try {
				id = "default";
				interpreter = new JavaScriptInterpreter();
				JavaScriptConsoleUtil
						.runDefaultTclInterpreter((JavaScriptInterpreter) interpreter);
			} catch (Exception e) {
				return null;
			}
		}

		return makeConsole((JavaScriptInterpreter) interpreter, id);
	}

	protected ScriptConsole createConsoleInstance() {
		return createConsoleInstance(null, null);
	}

	public JavaScriptConsoleFactory() {
	}

	public void openConsole(IScriptInterpreter interpreter, String id, ILaunch launch) {
		registerAndOpenConsole(createConsoleInstance(interpreter, id));
	}
}
