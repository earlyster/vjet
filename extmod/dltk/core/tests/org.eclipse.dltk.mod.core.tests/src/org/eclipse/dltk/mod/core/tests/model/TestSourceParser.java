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

import org.eclipse.dltk.mod.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.mod.ast.parser.AbstractSourceParser;
import org.eclipse.dltk.mod.compiler.problem.IProblemReporter;

public class TestSourceParser extends AbstractSourceParser {

	public ModuleDeclaration parse(char[] fileName, char[] source,
			IProblemReporter reporter) {
		return new ModuleDeclaration(source.length);
	}

}
