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
package org.eclipse.dltk.mod.debug.ui;

import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.dltk.mod.core.PriorityClassDLTKExtensionManager;
import org.eclipse.dltk.mod.debug.core.model.IScriptDebugTarget;

public class DLTKDebugUILanguageManager extends
		PriorityClassDLTKExtensionManager {

	private static DLTKDebugUILanguageManager self;

	private final static String LANGUAGE_EXTPOINT = DLTKDebugUIPlugin.PLUGIN_ID
			+ ".language"; //$NON-NLS-1$

	private DLTKDebugUILanguageManager() {
		super(LANGUAGE_EXTPOINT);
	}

	static DLTKDebugUILanguageManager getInstance() {
		if (self == null) {
			self = new DLTKDebugUILanguageManager();
		}

		return self;
	}

	public static IDLTKDebugUILanguageToolkit getLanguageToolkit(
			IDebugTarget target) {
		Assert.isTrue(target instanceof IScriptDebugTarget);

		String natureId = ((IScriptDebugTarget) target).getLanguageToolkit()
				.getNatureId();

		return getLanguageToolkit(natureId);
	}

	public static IDLTKDebugUILanguageToolkit getLanguageToolkit(String natureId) {
		return (IDLTKDebugUILanguageToolkit) getInstance().getObject(natureId);
	}

	public static IDLTKDebugUILanguageToolkit[] getLanguageToolkits() {
		List toolkits = getInstance().getObjectList();
		return (IDLTKDebugUILanguageToolkit[]) toolkits
				.toArray(new IDLTKDebugUILanguageToolkit[toolkits.size()]);
	}
}
