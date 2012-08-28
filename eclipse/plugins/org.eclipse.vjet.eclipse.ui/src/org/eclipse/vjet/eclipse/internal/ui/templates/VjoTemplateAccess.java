/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.eclipse.internal.ui.templates;

import org.eclipse.vjet.eclipse.ui.VjetUIPlugin;
import org.eclipse.dltk.mod.ui.templates.ScriptTemplateAccess;
import org.eclipse.jface.preference.IPreferenceStore;

public class VjoTemplateAccess extends ScriptTemplateAccess {

	private static final String VJO_TEMPLATES_KEY = "org.eclipse.vjet.eclipse.Templates";

	private static class InstanceHolder {
		private static final VjoTemplateAccess _obj = new VjoTemplateAccess();
	}

	public static VjoTemplateAccess getInstance(){

		return InstanceHolder._obj;
	}
	
	@Override
	protected String getContextTypeId() {

		return VjoTemplateContextType.VJO_CONTEXT_TYPE_ID;
	}

	@Override
	protected String getCustomTemplatesKey() {

		return VJO_TEMPLATES_KEY;
	}

	@Override
	protected IPreferenceStore getPreferenceStore() {

		return VjetUIPlugin.getDefault().getPreferenceStore();
	}

}
