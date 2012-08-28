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
package org.eclipse.dltk.mod.javascript.jsjdtdebugger.preferences;

import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.mod.javascript.jsjdtdebugger.JavaScriptAndJdtDebuggerPlugin;
import org.eclipse.dltk.mod.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage;
import org.eclipse.dltk.mod.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.mod.ui.preferences.PreferenceKey;
import org.eclipse.dltk.mod.ui.util.IStatusChangeListener;
import org.eclipse.dltk.mod.ui.util.SWTFactory;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;

public class JavaScriptAndJdtDebuggerPreferencePage extends
		AbstractConfigurationBlockPropertyAndPreferencePage {

	private static String PREFERENCE_PAGE_ID = "org.eclipse.dltk.mod.javascript.preferences.debug.engines.jsjdtdebugger";
	private static String PROPERTY_PAGE_ID = "org.eclipse.dltk.mod.javascript.propertyPage.debug.engines.jsjdtdebugger";

	/*
	 * @see org.eclipse.dltk.mod.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage#createOptionsBlock(org.eclipse.dltk.mod.ui.util.IStatusChangeListener,
	 *      org.eclipse.core.resources.IProject,
	 *      org.eclipse.ui.preferences.IWorkbenchPreferenceContainer)
	 */
	protected AbstractOptionsBlock createOptionsBlock(
			IStatusChangeListener newStatusChangedListener, IProject project,
			IWorkbenchPreferenceContainer container) {
		return new AbstractOptionsBlock(newStatusChangedListener, project,
				new PreferenceKey[] {}, container) {

			protected Control createOptionsBlock(Composite parent) {
				Composite composite = SWTFactory.createComposite(parent, parent
						.getFont(), 1, 1, GridData.FILL);
				SWTFactory.createLabel(composite,
						PreferenceMessages.NoSettingsAvailable, 1);
				return composite;
			}
		};
	}

	/*
	 * @see org.eclipse.dltk.mod.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage#getHelpId()
	 */
	protected String getHelpId() {
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
		setDescription(PreferenceMessages.PreferencesDescription);
	}

	/*
	 * @see org.eclipse.dltk.mod.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage#setPreferenceStore()
	 */
	protected void setPreferenceStore() {
		setPreferenceStore(JavaScriptAndJdtDebuggerPlugin.getDefault()
				.getPreferenceStore());
	}
}
