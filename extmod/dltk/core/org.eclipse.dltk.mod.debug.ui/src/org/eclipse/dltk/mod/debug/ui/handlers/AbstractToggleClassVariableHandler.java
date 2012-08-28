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
package org.eclipse.dltk.mod.debug.ui.handlers;

import org.eclipse.dltk.mod.debug.core.DLTKDebugPreferenceConstants;
import org.eclipse.dltk.mod.debug.core.model.IScriptDebugTarget;

/**
 * Abstract handler implementation that can be used to toggle the display of
 * 'class' debugging variables.
 */
public abstract class AbstractToggleClassVariableHandler extends
		AbstractToggleVariableHandler {

	/*
	 * @see org.eclipse.dltk.mod.debug.ui.handlers.AbstractToggleVariableHandler#getVariableDisplayPreferenceKey()
	 */
	protected String getVariableDisplayPreferenceKey() {
		return DLTKDebugPreferenceConstants.PREF_DBGP_SHOW_SCOPE_CLASS;
	}

	/*
	 * @see org.eclipse.dltk.mod.debug.ui.handlers.AbstractToggleVariableHandler#toggleVariableDisplay(org.eclipse.dltk.mod.debug.core.model.IScriptDebugTarget)
	 */
	protected final void toggleVariableDisplay(IScriptDebugTarget target,
			boolean enabled) {
		target.toggleClassVariables(enabled);
	}
}
