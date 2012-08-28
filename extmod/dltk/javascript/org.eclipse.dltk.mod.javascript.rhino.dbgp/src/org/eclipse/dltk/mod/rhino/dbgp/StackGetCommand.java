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

import java.io.File;
import java.util.HashMap;

final class StackGetCommand extends DBGPDebugger.Command {
	/**
	 * 
	 */
	private final DBGPDebugger debugger;

	/**
	 * @param debugger
	 */
	StackGetCommand(DBGPDebugger debugger) {
		this.debugger = debugger;
	}

	void parseAndExecute(String command, final HashMap options) {
		String string = (String) options.get("-d");
		int level = -1;
		if (string != null) {
			level = Integer.parseInt(string);
		}
		StringBuffer stack = new StringBuffer();
		if (this.debugger.stackmanager.getStackDepth() >= level) {
			if (level == -1) {
				for (int a = 0; a < this.debugger.stackmanager.getStackDepth(); a++) {
					appendLevel(a, stack);
				}
			} else {

				appendLevel(level, stack);
			}
			this.debugger.printResponse("<response command=\"stack_get\"\r\n"
					+ "\r\n" + "          transaction_id=\""
					+ options.get("-i") + "\">\r\n" +

					stack + "</response>\r\n" + "");
		}

	}

	private void appendLevel(int level, StringBuffer stack) {
		DBGPDebugFrame stackFrame = this.debugger.stackmanager
				.getStackFrame(level);
		stack.append("<stack level=\"" + level + "\"\r\n"
				+ "           type=\"file\"\r\n" + "           filename=\""
				+ new File(stackFrame.getSourceName()).toURI().toASCIIString()
				+ "\"\r\n" + "           lineno=\""
				+ (stackFrame.getLineNumber()) + "\"\r\n"
				+ "           where=\"" + stackFrame.getWhere() + "\"\r\n"
				+ "           cmdbegin=\"1:0\"\r\n" + "           cmdend=\""
				+ "1" + ":10\"/>");
	}
}