/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.javatojs.parse;

import org.eclipse.vjet.dsf.javatojs.translate.TranslationMode;
import org.eclipse.vjet.dsf.jst.declaration.JstType;

public class TypeDnDVisitor extends TypeDependencyVisitor {
	
	//
	// Constructors
	//
	public TypeDnDVisitor(final JstType type) {
		super(type, new TranslationMode().addDependency().addDeclaration());
	}
}
