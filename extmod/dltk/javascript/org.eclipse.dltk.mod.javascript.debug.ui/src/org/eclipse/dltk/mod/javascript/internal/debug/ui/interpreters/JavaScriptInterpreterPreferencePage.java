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

import org.eclipse.dltk.mod.internal.debug.ui.interpreters.ScriptInterpreterPreferencePage;
import org.eclipse.dltk.mod.internal.debug.ui.interpreters.InterpretersBlock;

public class JavaScriptInterpreterPreferencePage extends ScriptInterpreterPreferencePage {

	//public static final String PAGE_ID = "org.eclipse.dltk.mod.debug.ui.TCLInterpreters";

	public InterpretersBlock createInterpretersBlock() {
		return new JavaScriptInterpretersBlock();
	}
}
