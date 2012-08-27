/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jst.stmt;

import java.text.MessageFormat;

import org.eclipse.vjet.dsf.jst.declaration.JstVar;
import org.eclipse.vjet.dsf.jst.term.JstIdentifier;
import org.eclipse.vjet.dsf.jst.token.IExpr;
import org.eclipse.vjet.dsf.jst.token.ILHS;
import org.eclipse.vjet.dsf.jst.token.IStmt;
import org.eclipse.vjet.dsf.jst.traversal.IJstNodeVisitor;

public class ForInStmt extends BlockStmt implements IStmt {
	
	private static final long serialVersionUID = 1L;

	public static final String FOR_IN_STMT = "for ({0} in {1})";

	private ILHS m_var;
	private IExpr m_expr;
	
	//
	// Constructor
	//
	public ForInStmt(){
	}
	
	public ForInStmt(JstVar var, IExpr expr){
		this((ILHS)var, expr);
	}
	
	public ForInStmt(JstIdentifier var, IExpr expr){
		this((ILHS)var, expr);
	}
	
	private ForInStmt(ILHS var, IExpr expr){
		assert var != null : "var cannot be null";
		assert expr != null : "expr cannot be null";
		m_var = var;
		m_expr = expr;
		addChild(var);
		addChild(expr);
	}
	
	//
	// API
	//
	public ForInStmt addStmt(final IStmt stmt){
		assert stmt != null : "stmt cannot be null";
		getBody().addStmt(stmt);
		return this;
	}
	
	public ILHS getVar(){
		return m_var;
	}
	
	public IExpr getExpr(){
		return m_expr;
	}

	// 
	// Satisfy IStmt
	//
	public String toStmtText(){
		StringBuilder sb = new StringBuilder();
		sb.append(MessageFormat.format(FOR_IN_STMT, m_var.toLHSText(), m_expr.toExprText()))
		  .append(getBody().toBlockText());
		
		return sb.toString();
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