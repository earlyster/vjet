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
package org.eclipse.dltk.mod.javascript.internal.debug.ui.preferences;

import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.mod.debug.ui.preferences.AbstractDebuggingEngineOptionsBlock;
import org.eclipse.dltk.mod.javascript.core.JavaScriptNature;
import org.eclipse.dltk.mod.javascript.internal.debug.JavaScriptDebugConstants;
import org.eclipse.dltk.mod.javascript.internal.debug.JavaScriptDebugPlugin;
import org.eclipse.dltk.mod.ui.PreferencesAdapter;
import org.eclipse.dltk.mod.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage;
import org.eclipse.dltk.mod.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.mod.ui.preferences.PreferenceKey;
import org.eclipse.dltk.mod.ui.util.IStatusChangeListener;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;

public class JavaScriptDebuggingEnginePreferencePage extends AbstractConfigurationBlockPropertyAndPreferencePage {

	private static PreferenceKey DEBUGGING_ENGINE = new PreferenceKey(
			JavaScriptDebugPlugin.PLUGIN_ID,
			JavaScriptDebugConstants.DEBUGGING_ENGINE_ID_KEY);

	private static final String PREFERENCE_PAGE_ID = "org.eclipse.dltk.mod.javascript.preferences.debug.engines";
	private static final String PROPERTY_PAGE_ID = "org.eclipse.dltk.mod.javascript.propertyPage.debug.engines";
	
	protected AbstractOptionsBlock createOptionsBlock(
			IStatusChangeListener newStatusChangedListener, IProject project,
			IWorkbenchPreferenceContainer container) {
		return new AbstractDebuggingEngineOptionsBlock(
				newStatusChangedListener, project, getKeys(), container) {

			protected String getNatureId() {
				return JavaScriptNature.NATURE_ID;
			}

			protected PreferenceKey getSavedContributionKey() {
				return DEBUGGING_ENGINE;
			}
		};
	}

	/*
	 * @see org.eclipse.dltk.mod.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage#getHelpId()
	 */
	protected String getHelpId() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @see org.eclipse.dltk.mod.internal.ui.preferences.PropertyAndPreferencePage#getPreferencePageId()
	 */
	protected String getPreferencePageId() {
		return PREFERENCE_PAGE_ID;
	}

	/*
	 * @see org.eclipse.dltk.mod.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage#getProjectHelpId()
	 */
	protected String getProjectHelpId() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @see org.eclipse.dltk.mod.internal.ui.preferences.PropertyAndPreferencePage#getPropertyPageId()
	 */
	protected String getPropertyPageId() {
		return PROPERTY_PAGE_ID;
	}

	/*
	 * @see org.eclipse.dltk.mod.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage#setDescription()
	 */
	protected void setDescription() {
		setDescription(JavaScriptDebugPreferenceMessages.JavaScriptDebugEnginePreferencePage_description);
	}

	/*
	 * @see org.eclipse.dltk.mod.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage#setPreferenceStore()
	 */
	protected void setPreferenceStore() {
		setPreferenceStore(new PreferencesAdapter(JavaScriptDebugPlugin.getDefault()
				.getPluginPreferences()));
	}

	private PreferenceKey[] getKeys() {
		return new PreferenceKey[] { DEBUGGING_ENGINE };
	}
}
