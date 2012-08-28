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
package org.eclipse.dltk.mod.javascript.internal.debug.ui;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.debug.ui.actions.IRunToLineTarget;
import org.eclipse.debug.ui.actions.IToggleBreakpointsTarget;
import org.eclipse.dltk.mod.internal.debug.ui.ScriptRunToLineAdapter;

public class JavaScriptEditorDebugAdapterFactory implements IAdapterFactory {
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adapterType == IRunToLineTarget.class) {
			return new ScriptRunToLineAdapter();
		} else if (adapterType == IToggleBreakpointsTarget.class) {
			return new JavaScriptToggleBreakpointAdapter();
		}

		return null;
	}

	public Class[] getAdapterList() {
		return new Class[] { IRunToLineTarget.class,
				IToggleBreakpointsTarget.class };
	}
}
