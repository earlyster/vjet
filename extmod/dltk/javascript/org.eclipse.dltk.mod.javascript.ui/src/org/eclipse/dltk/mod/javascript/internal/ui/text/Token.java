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
package org.eclipse.dltk.mod.javascript.internal.ui.text;

public class Token {

	String context;
	int start;
	int textLength;
	int length;
	String tagName;
	
	public Token(String context, int start, int textLength, int length,
			String currentTagName) {
		this.context=context;
		this.start=start;
		this.tagName=currentTagName;
		this.textLength=textLength;
	}

}
