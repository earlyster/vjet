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
import org.eclipse.dltk.mod.debug.core.model.IScriptMethodEntryBreakpoint;
import org.eclipse.dltk.mod.ui.util.SWTFactory;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class ScriptMethodBreakpointPropertyPage extends
		ScriptBreakpointPropertyPage {

	private Button breakOnEntryButton;
	private Button breakOnExitButton;

	public ScriptMethodBreakpointPropertyPage() {

	}

	protected void createTypeSpecificButtons(Composite parent) {
		setTitle(BreakpointMessages.MethodBreakpointTitle);

		breakOnEntryButton = SWTFactory.createCheckButton(parent,
				BreakpointMessages.SuspendOnMethodEntryLabel, null, false, 1);

		breakOnExitButton = SWTFactory.createCheckButton(parent,
				BreakpointMessages.SuspendOnMethodExitLabel, null, false, 1);
	}

	protected void loadValues() throws CoreException {
		super.loadValues();

		IScriptMethodEntryBreakpoint breakpoint = (IScriptMethodEntryBreakpoint) getBreakpoint();

		breakOnEntryButton.setSelection(breakpoint.breakOnEntry());
		breakOnExitButton.setSelection(breakpoint.breakOnExit());
	}

	protected void saveValues() throws CoreException {
		super.saveValues();

		IScriptMethodEntryBreakpoint breakpoint = (IScriptMethodEntryBreakpoint) getBreakpoint();

		breakpoint.setBreakOnEntry(breakOnEntryButton.getSelection());
		breakpoint.setBreakOnExit(breakOnExitButton.getSelection());
	}
}
