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
/**
 * 
 */
package org.eclipse.dltk.mod.rhino.dbgp;

import java.util.HashMap;

final class UpdateBreakPointCommand extends DBGPDebugger.Command {
	/**
	 * 
	 */
	private final DBGPDebugger debugger;

	/**
	 * @param debugger
	 */
	UpdateBreakPointCommand(DBGPDebugger debugger) {
		this.debugger = debugger;
	}

	void parseAndExecute(String command, HashMap options) {

		String id = (String) options.get("-d");
		String newState = (String) options.get("-s");
		String newLine = (String) options.get("-n");
		String hitValue = (String) options.get("-h");
		String hitCondition = (String) options.get("-o");
		String condEString = (String) options.get("--");

		if (condEString != null) {
			condEString = Base64Helper.decodeString(condEString);
		}

		this.debugger.stackmanager.updateBreakpoint(id, newState, newLine,
				hitValue, hitCondition, condEString);
		String enabled = newState;
		this.debugger
				.printResponse("<response command=\"breakpoint_update\"\r\n"
						+ " transaction_id=\"" + options.get("-i") + "\">\r\n"
						+ " id=\"" + id + "\" state=\"" + enabled + "\" "
						+ "</response>\r\n" + "");
	}
}