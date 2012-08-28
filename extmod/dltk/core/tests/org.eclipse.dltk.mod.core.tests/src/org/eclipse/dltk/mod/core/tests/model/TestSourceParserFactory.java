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
package org.eclipse.dltk.mod.core.tests.model;

import org.eclipse.dltk.mod.ast.parser.ISourceParser;
import org.eclipse.dltk.mod.ast.parser.ISourceParserFactory;

public class TestSourceParserFactory implements ISourceParserFactory {

	/*
	 * @see org.eclipse.dltk.mod.ast.parser.ISourceParserFactory#createSourceParser()
	 */
	public ISourceParser createSourceParser() {
		return new TestSourceParser();
	}
}
