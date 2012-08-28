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

final class SetBreakPointCommand extends DBGPDebugger.Command {
	/**
	 * 
	 */
	private final DBGPDebugger debugger;

	/**
	 * @param debugger
	 */
	SetBreakPointCommand(DBGPDebugger debugger) {
		this.debugger = debugger;
	}

	void parseAndExecute(String command, HashMap options) {
		BreakPoint p = new BreakPoint(options);
		this.debugger.stackmanager.registerBreakPoint(p);
		this.debugger.printResponse("<response command=\"breakpoint_set\"\r\n"
				+ " transaction_id=\"" + options.get("-i") + "\" " + " id=\"p"
				+ p.id + "\" state=\"enabled\" > " + "</response>\r\n" + "");
	}
}