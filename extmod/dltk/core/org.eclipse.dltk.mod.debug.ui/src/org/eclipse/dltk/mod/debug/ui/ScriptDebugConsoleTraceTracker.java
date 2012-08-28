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
package org.eclipse.dltk.mod.debug.ui;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.ui.console.PatternMatchEvent;

public class ScriptDebugConsoleTraceTracker extends ScriptDebugConsoleTracker {

	public void matchFound(PatternMatchEvent event) {
		try {
			int offset = event.getOffset();
			int length = event.getLength();
			ScriptDebuggerConsoleToFileHyperlink link = new ScriptDebuggerConsoleToFileHyperlink(
					console);
			console.addHyperlink(link, link.computeOffset(offset, length,
					console), link.computeLength(offset, length, console));

		} catch (BadLocationException e) {
		}
	}

	public String getPattern() {
		return "\\t*#\\d+ +file:(.*) \\[(\\d+)\\]"; //$NON-NLS-1$
	}

}
