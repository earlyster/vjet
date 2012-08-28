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

final class EvalCommand extends DBGPDebugger.Command {
	/**
	 * 
	 */
	private final DBGPDebugger debugger;

	/**
	 * @param debugger
	 */
	EvalCommand(DBGPDebugger debugger) {
		this.debugger = debugger;
	}

	void parseAndExecute(String command, HashMap options) {
		String value = Base64Helper.decodeString((String) options.get("--"));
		if (value.length() == 0)
			value = "this";
		StringBuffer valueBuffer = new StringBuffer();
		if (this.debugger.stackmanager.getStackDepth() == 0 || value == null) {
			this.debugger.printProperty(value, value, "", valueBuffer, 0, true);
			this.debugger.printResponse("<response command=\"eval\"\r\n"
					+ " transaction_id=\"" + options.get("-i")
					+ "\" success=\"1\" " + ">\r\n" + valueBuffer
					+ "</response>\r\n" + "");
			return;
		}
		DBGPDebugFrame fr = this.debugger.stackmanager.getStackFrame(0);
		Object evaluated = fr.eval(value);
		String shName = value;
		int k = shName.lastIndexOf('.');
		if (k != -1) {
			shName = shName.substring(k + 1);
		}
		this.debugger.printProperty(shName, value, evaluated, valueBuffer, 0,
				true);
		this.debugger.printResponse("<response command=\"eval\"\r\n"
				+ " transaction_id=\"" + options.get("-i")
				+ "\" success=\"1\" " + ">\r\n" + valueBuffer
				+ "</response>\r\n" + "");
	}
}