/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jst.stmt;

import org.eclipse.vjet.dsf.jst.IJstMethod;
import org.eclipse.vjet.dsf.jst.expr.MtdInvocationExpr;
import org.eclipse.vjet.dsf.jst.reserved.JsCoreKeywords;
import org.eclipse.vjet.dsf.jst.term.JstIdentifier;
import org.eclipse.vjet.dsf.jst.token.IExpr;
import org.eclipse.vjet.dsf.jst.token.IStmt;
import org.eclipse.vjet.dsf.jst.traversal.IJstNodeVisitor;

public class ThisStmt extends MtdInvocationExpr implements IStmt {
	
	private static final long serialVersionUID = 1L;
	
	//
	// Constructor
	//
	public ThisStmt(final String name, final IExpr...args){
		super(new JstIdentifier(name), args);
	}
	
	//
	// API
	//
	public void setConstructor(IJstMethod constructor){
		if (constructor != null){
			JstIdentifier methodName = getMethodIdentifier();
			methodName.setQualifier(new JstIdentifier(JsCoreKeywords.THIS));
			methodName.setName(constructor.getName().getName());
			methodName.setJstBinding(constructor);
		}
	}
	
	//
	// API
	//
	@Override
	public JstIdentifier getMethodIdentifier(){
		return (JstIdentifier)super.getMethodIdentifier();
	}

	@Override
	public void accept(IJstNodeVisitor visitor){
		visitor.visit(this);
	}
	
	@Override
	public String toString(){
		return toStmtText();
	}
}
