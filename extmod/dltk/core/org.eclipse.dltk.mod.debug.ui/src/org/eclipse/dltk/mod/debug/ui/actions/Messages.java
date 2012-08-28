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
package org.eclipse.dltk.mod.debug.ui.actions;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.dltk.mod.debug.ui.actions.messages"; //$NON-NLS-1$
	public static String AddExceptionAction_addExceptionBreakpoint;
	public static String AddExceptionAction_scriptToggleExceptionBreakpoint;
	public static String AddExceptionAction_search;
	public static String AddExceptionAction_unableToCreateBreakpoint;
	public static String AddExceptionTypeDialogExtension_selectedItemIsNotAnException;
	public static String AddExceptionTypeDialogExtension_suspendOnCaught;
	public static String AddExceptionTypeDialogExtension_SuspendOnUncaught;
	public static String ToggleWatchPointAction_error;
	public static String ToggleWatchPointAction_toggleWatchpoint;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
