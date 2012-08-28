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

final class ContextNamesCommand extends DBGPDebugger.Command {
	/**
	 * 
	 */
	private final DBGPDebugger debugger;

	/**
	 * @param debugger
	 */
	ContextNamesCommand(DBGPDebugger debugger) {
		this.debugger = debugger;
	}

	void parseAndExecute(String command, HashMap options) {
		String object = (String) options.get("-i");
		this.debugger.runTransctionId = object;

		this.debugger.printResponse("<response command=\"context_names\"\r\n"
				+ "          transaction_id=\"" + options.get("-i") + "\">"
				+ "    <context name=\"Local\" id=\"0\"/>\r\n"
				+ "    <context name=\"Global\" id=\"1\"/>\r\n"
				+ "    <context name=\"Class\" id=\"2\"/>\r\n" + ""
				+ "</response>\r\n" + "");
	}
}