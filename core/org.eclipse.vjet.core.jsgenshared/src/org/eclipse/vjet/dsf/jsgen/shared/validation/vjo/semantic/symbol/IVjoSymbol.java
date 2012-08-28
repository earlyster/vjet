/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.semantic.symbol;

import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.IJstType;

public interface IVjoSymbol {

	String getName();
	
	IVjoSymbol setName(String name);

	boolean isStaticReference();
	
	IVjoSymbol setStaticReference(boolean staticReference);
	
	IJstType getDeclareType();
	
	IVjoSymbol setDeclareType(IJstType type);

	IJstType getAssignedType();
	
	boolean isAssigned();
	
	IVjoSymbol setAssignedType(IJstType type);

	IJstNode getDeclareNode();
	
	IVjoSymbol setDeclareNode(IJstNode node);

	EVjoSymbolType getSymbolType();
	
	IVjoSymbol setSymbolType(EVjoSymbolType type);

	boolean isVisible();
	
	IVjoSymbol setVisible(boolean visible);

}