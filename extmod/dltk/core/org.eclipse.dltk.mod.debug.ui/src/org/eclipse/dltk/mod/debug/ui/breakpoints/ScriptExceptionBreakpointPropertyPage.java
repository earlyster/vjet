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
package org.eclipse.dltk.mod.debug.ui.breakpoints;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.mod.debug.core.model.IScriptExceptionBreakpoint;
import org.eclipse.dltk.mod.ui.util.SWTFactory;
import org.eclipse.swt.widgets.Composite;

public class ScriptExceptionBreakpointPropertyPage extends
		ScriptBreakpointPropertyPage {

	protected void createLocationLabels(Composite parent) throws CoreException {
		super.createLocationLabels(parent);
		final IScriptExceptionBreakpoint breakpoint = (IScriptExceptionBreakpoint) getBreakpoint();

		// Exception type
		SWTFactory.createLabel(parent, BreakpointMessages.ExceptionType, 1);
		SWTFactory.createLabel(parent, breakpoint.getTypeName(), 1);
	}

	// private Button fSuspendOnCaught;
	// private Button fSuspendOnUncaught;
	// private Button fSuspendOnSubclasses;

	protected void createTypeSpecificButtons(Composite parent) {
		// fSuspendOnCaught = SWTFactory.createCheckButton(parent,
		// "Caught Exception", null, false, 1);
		//
		// fSuspendOnUncaught = SWTFactory.createCheckButton(parent,
		// "Uncaught Exception", null, false, 1);
		//
		// fSuspendOnSubclasses = SWTFactory.createCheckButton(parent,
		// "Suspend on Subclasses of this Exception", null, false, 1);
	}

	protected void loadValues() throws CoreException {
		super.loadValues();
		//
		// IScriptExceptionBreakpoint breakpoint = (IScriptExceptionBreakpoint)
		// getBreakpoint();
		//
		// fSuspendOnCaught.setSelection(breakpoint.isCaught());
		// fSuspendOnUncaught.setSelection(breakpoint.isUncaught());
		//fSuspendOnSubclasses.setSelection(breakpoint.isSuspendOnSubclasses());
	}

	protected void saveValues() throws CoreException {
		super.saveValues();
		//
		// IScriptExceptionBreakpoint breakpoint = (IScriptExceptionBreakpoint)
		// getBreakpoint();
		//
		// breakpoint.setCaught(fSuspendOnCaught.getSelection());
		// breakpoint.setUncaught(fSuspendOnUncaught.getSelection());
		// breakpoint.setSuspendOnSubclasses(fSuspendOnUncaught.getSelection());
	}

}
