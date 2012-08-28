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
/**
 * 
 */
package org.eclipse.dltk.mod.javascript.ui.actions;

import org.eclipse.dltk.mod.javascript.internal.ui.JavaScriptUILanguageToolkit;
import org.eclipse.dltk.mod.ui.IDLTKUILanguageToolkit;

/**
 * @author jcompagner
 * 
 */
public class OpenMethodAction extends
		org.eclipse.dltk.mod.ui.actions.OpenMethodAction {

	/**
	 * @see org.eclipse.dltk.mod.ui.actions.OpenMethodAction#getUILanguageToolkit()
	 */
	protected IDLTKUILanguageToolkit getUILanguageToolkit() {
		return new JavaScriptUILanguageToolkit();
	}

}
