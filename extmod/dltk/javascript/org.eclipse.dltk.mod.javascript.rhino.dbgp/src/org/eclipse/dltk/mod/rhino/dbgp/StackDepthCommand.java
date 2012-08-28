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

final class StackDepthCommand extends DBGPDebugger.Command {
	/**
	 * 
	 */
	private final DBGPDebugger debugger;

	/**
	 * @param debugger
	 */
	StackDepthCommand(DBGPDebugger debugger) {
		this.debugger = debugger;
	}

	void parseAndExecute(String command, final HashMap options) {
		this.debugger.printResponse("<response command=\"stack_depth\"\r\n"
				+ "          depth=\""
				+ (this.debugger.stackmanager.getStackDepth()) + "\"\r\n"
				+ "          transaction_id=\"" + options.get("-i") + "\">\r\n"
				+ "</response>\r\n" + "");

	}
}