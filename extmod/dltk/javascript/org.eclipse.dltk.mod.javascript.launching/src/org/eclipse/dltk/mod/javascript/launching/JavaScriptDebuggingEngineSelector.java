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
package org.eclipse.dltk.mod.javascript.launching;

import org.eclipse.dltk.mod.core.DLTKIdContributionSelector;
import org.eclipse.dltk.mod.core.PreferencesLookupDelegate;
import org.eclipse.dltk.mod.javascript.internal.debug.JavaScriptDebugConstants;
import org.eclipse.dltk.mod.javascript.internal.debug.JavaScriptDebugPlugin;

/**
 * JavaScript debugging engine id based selector
 */
public class JavaScriptDebuggingEngineSelector extends
		DLTKIdContributionSelector {
	/*
	 * @see org.eclipse.dltk.mod.core.DLTKIdContributionSelector#getSavedContributionId(org.eclipse.dltk.mod.core.PreferencesLookupDelegate)
	 */
	protected String getSavedContributionId(PreferencesLookupDelegate delegate) {
		return delegate.getString(JavaScriptDebugPlugin.PLUGIN_ID,
				JavaScriptDebugConstants.DEBUGGING_ENGINE_ID_KEY);
	}

}
