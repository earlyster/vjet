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

final class RunCommand extends DBGPDebugger.Command {
	/**
	 * 
	 */
	private final DBGPDebugger debugger;

	/**
	 * @param debugger
	 */
	RunCommand(DBGPDebugger debugger) {
		this.debugger = debugger;
	}

	void parseAndExecute(String command, HashMap options) {
		String object = (String) options.get("-i");
		this.debugger.runTransctionId = object;
		while (!this.debugger.isInited) {
			Thread.yield();
		}
		synchronized (this.debugger) {
			this.debugger.notify();
		}
		this.debugger.stackmanager.resume();
		// printResponse("<response command=\"run\"\r\n"
		// + "status=\"starting\"" + " reason=\"ok\""
		// + " transaction_id=\"" + object + "\">\r\n"
		// + "</response>\r\n" + "");
	}
}