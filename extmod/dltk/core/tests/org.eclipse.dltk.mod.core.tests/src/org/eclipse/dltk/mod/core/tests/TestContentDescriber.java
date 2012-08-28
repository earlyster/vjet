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
package org.eclipse.dltk.mod.core.tests;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.ITextContentDescriber;

public class TestContentDescriber implements ITextContentDescriber {

	public TestContentDescriber() {
		// TODO Auto-generated constructor stub
	}

	public int describe(Reader contents, IContentDescription description)
			throws IOException {
		return INVALID;
	}

	public int describe(InputStream contents, IContentDescription description)
			throws IOException {
		return INVALID;
	}

	public QualifiedName[] getSupportedOptions() {
		return null;
	}

}
