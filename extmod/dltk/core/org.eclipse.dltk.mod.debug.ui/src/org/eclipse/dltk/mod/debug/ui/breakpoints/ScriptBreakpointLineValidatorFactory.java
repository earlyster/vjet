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


public class ScriptBreakpointLineValidatorFactory {
	public static final IScriptBreakpointLineValidator NON_EMPTY_VALIDATOR = new IScriptBreakpointLineValidator() {
		public boolean isValid(String line, int number) {
			return line.trim().length() > 0;
		}
	};

	public static IScriptBreakpointLineValidator createNonEmptyNoCommentValidator(
			final String commentPrefix) {
		return new IScriptBreakpointLineValidator() {
			public boolean isValid(String line, int number) {
				final String trimmedLine = line.trim();
				return trimmedLine.length() > 0
						&& trimmedLine.indexOf(commentPrefix) != 0;
			}
		};
	}
}
