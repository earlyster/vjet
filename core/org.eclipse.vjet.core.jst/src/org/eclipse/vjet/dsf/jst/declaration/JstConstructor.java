/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jst.declaration;

import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.dsf.jst.traversal.IJstNodeVisitor;


public class JstConstructor extends JstMethod {

	private static final long serialVersionUID = 1L;
	
	public static final String CONSTRUCTS = "constructs";

	//
	// Constructors
	//
	public JstConstructor(final JstArg...args){
		super(CONSTRUCTS, args);
		setIsConstructor(true);
	}
	
	public JstConstructor(JstModifiers modifiers, final JstArg...args){
		super(CONSTRUCTS, modifiers, null, args);
		setIsConstructor(true);
	}
	
	@Override
	public IJstType getRtnType() {
		return null;
	}

	@Override
	public void accept(IJstNodeVisitor visitor){
		visitor.visit(this);
	}
}
