/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.eclipse.internal.debug.ui;

import org.eclipse.dltk.mod.debug.ui.AbstractDebugUILanguageToolkit;
import org.eclipse.jface.preference.IPreferenceStore;

import org.eclipse.vjet.eclipse.debug.ui.VjetDebugUIPlugin;
import org.eclipse.vjet.eclipse.internal.debug.VjetDebugConstants;

public class VjoDebugUILanguageToolkit extends
		AbstractDebugUILanguageToolkit {

	/*
	 * @see
	 * org.eclipse.dltk.mod.debug.ui.IDLTKDebugUILanguageToolkit#getDebugModelId()
	 */
	public String getDebugModelId() {
		return VjetDebugConstants.DEBUG_MODEL_ID;
	}

	/*
	 * @see
	 * org.eclipse.dltk.mod.debug.ui.IDLTKDebugUILanguageToolkit#getPreferenceStore
	 * ()
	 */
	public IPreferenceStore getPreferenceStore() {
		return VjetDebugUIPlugin.getDefault().getPreferenceStore();
	}

	public String[] getVariablesViewPreferencePages() {
		return new String[] { "org.eclipse.vjet.eclipse.preferences.debug.detailFormatters" };
	}

}