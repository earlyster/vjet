/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.vjolang.feature.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.vjet.dsf.jst.BaseJstNode;
import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.IJstRefType;
import org.eclipse.vjet.dsf.jst.ISynthesized;
import org.eclipse.vjet.dsf.jst.declaration.JstAnnotation;
import org.eclipse.vjet.dsf.jst.declaration.JstArg;
import org.eclipse.vjet.dsf.jst.declaration.JstArray;
import org.eclipse.vjet.dsf.jst.declaration.JstBlock;
import org.eclipse.vjet.dsf.jst.declaration.JstConstructor;
import org.eclipse.vjet.dsf.jst.declaration.JstDoc;
import org.eclipse.vjet.dsf.jst.declaration.JstFunctionRefType;
import org.eclipse.vjet.dsf.jst.declaration.JstGlobalFunc;
import org.eclipse.vjet.dsf.jst.declaration.JstGlobalProp;
import org.eclipse.vjet.dsf.jst.declaration.JstGlobalVar;
import org.eclipse.vjet.dsf.jst.declaration.JstMethod;
import org.eclipse.vjet.dsf.jst.declaration.JstModifiers;
import org.eclipse.vjet.dsf.jst.declaration.JstName;
import org.eclipse.vjet.dsf.jst.declaration.JstObjectLiteralType;
import org.eclipse.vjet.dsf.jst.declaration.JstPackage;
import org.eclipse.vjet.dsf.jst.declaration.JstParamType;
import org.eclipse.vjet.dsf.jst.declaration.JstProperty;
import org.eclipse.vjet.dsf.jst.declaration.JstProxyMethod;
import org.eclipse.vjet.dsf.jst.declaration.JstProxyProperty;
import org.eclipse.vjet.dsf.jst.declaration.JstRawBlock;
import org.eclipse.vjet.dsf.jst.declaration.JstRefType;
import org.eclipse.vjet.dsf.jst.declaration.JstType;
import org.eclipse.vjet.dsf.jst.declaration.JstTypeReference;
import org.eclipse.vjet.dsf.jst.declaration.JstTypeWithArgs;
import org.eclipse.vjet.dsf.jst.declaration.JstVar;
import org.eclipse.vjet.dsf.jst.declaration.JstVars;
import org.eclipse.vjet.dsf.jst.declaration.JstWildcardType;
import org.eclipse.vjet.dsf.jst.expr.ArrayAccessExpr;
import org.eclipse.vjet.dsf.jst.expr.ArrayCreationExpr;
import org.eclipse.vjet.dsf.jst.expr.AssignExpr;
import org.eclipse.vjet.dsf.jst.expr.BoolExpr;
import org.eclipse.vjet.dsf.jst.expr.CastExpr;
import org.eclipse.vjet.dsf.jst.expr.ConditionalExpr;
import org.eclipse.vjet.dsf.jst.expr.FieldAccessExpr;
import org.eclipse.vjet.dsf.jst.expr.FuncExpr;
import org.eclipse.vjet.dsf.jst.expr.InfixExpr;
import org.eclipse.vjet.dsf.jst.expr.JstArrayInitializer;
import org.eclipse.vjet.dsf.jst.expr.JstInitializer;
import org.eclipse.vjet.dsf.jst.expr.ListExpr;
import org.eclipse.vjet.dsf.jst.expr.MtdInvocationExpr;
import org.eclipse.vjet.dsf.jst.expr.ObjCreationExpr;
import org.eclipse.vjet.dsf.jst.expr.ParenthesizedExpr;
import org.eclipse.vjet.dsf.jst.expr.PostfixExpr;
import org.eclipse.vjet.dsf.jst.expr.PrefixExpr;
import org.eclipse.vjet.dsf.jst.expr.PtyGetter;
import org.eclipse.vjet.dsf.jst.expr.TextExpr;
import org.eclipse.vjet.dsf.jst.meta.BaseJsCommentMetaNode;
import org.eclipse.vjet.dsf.jst.stmt.BlockStmt;
import org.eclipse.vjet.dsf.jst.stmt.BreakStmt;
import org.eclipse.vjet.dsf.jst.stmt.CatchStmt;
import org.eclipse.vjet.dsf.jst.stmt.ContinueStmt;
import org.eclipse.vjet.dsf.jst.stmt.DispatchStmt;
import org.eclipse.vjet.dsf.jst.stmt.DoStmt;
import org.eclipse.vjet.dsf.jst.stmt.ExprStmt;
import org.eclipse.vjet.dsf.jst.stmt.ForInStmt;
import org.eclipse.vjet.dsf.jst.stmt.ForStmt;
import org.eclipse.vjet.dsf.jst.stmt.IfStmt;
import org.eclipse.vjet.dsf.jst.stmt.JstBlockInitializer;
import org.eclipse.vjet.dsf.jst.stmt.JstStmt;
import org.eclipse.vjet.dsf.jst.stmt.LabeledStmt;
import org.eclipse.vjet.dsf.jst.stmt.PtySetter;
import org.eclipse.vjet.dsf.jst.stmt.RtnStmt;
import org.eclipse.vjet.dsf.jst.stmt.SwitchStmt;
import org.eclipse.vjet.dsf.jst.stmt.SwitchStmt.CaseStmt;
import org.eclipse.vjet.dsf.jst.stmt.TextStmt;
import org.eclipse.vjet.dsf.jst.stmt.ThisStmt;
import org.eclipse.vjet.dsf.jst.stmt.ThrowStmt;
import org.eclipse.vjet.dsf.jst.stmt.TryStmt;
import org.eclipse.vjet.dsf.jst.stmt.TypeDeclStmt;
import org.eclipse.vjet.dsf.jst.stmt.WhileStmt;
import org.eclipse.vjet.dsf.jst.stmt.WithStmt;
import org.eclipse.vjet.dsf.jst.term.ArrayLiteral;
import org.eclipse.vjet.dsf.jst.term.JstIdentifier;
import org.eclipse.vjet.dsf.jst.term.JstLiteral;
import org.eclipse.vjet.dsf.jst.term.JstProxyIdentifier;
import org.eclipse.vjet.dsf.jst.term.NV;
import org.eclipse.vjet.dsf.jst.term.ObjLiteral;
import org.eclipse.vjet.dsf.jst.term.RegexpLiteral;
import org.eclipse.vjet.dsf.jst.term.SimpleLiteral;
import org.eclipse.vjet.dsf.jst.traversal.IJstNodeVisitor;

public class JstSourceVisitor implements IJstNodeVisitor {

	public List<String> m_failures = new ArrayList<String>();
	
	public void visit(BaseJstNode node) {
		validateJstSource(node, "");
	}

	private void validateJstSource(IJstNode node){
		validateJstSource(node, "");
	}
	
	
	private void validateJstSource(IJstNode node, String message) {
		if (node instanceof ISynthesized) {
			return;
		}
		if(node.getSource()==null){
			m_failures.add(node.getClass().getName() + "\t" + message );
		}
		visitChildren(node);
	}
	
	
	private void visitChildren(IJstNode jstNode) {
		for (IJstNode child : jstNode.getChildren()) {
			visitChild(child);
		}
	}
	
	private void visitChild(IJstNode child) {
		child.accept(this);
	}
	

	public void visit(JstAnnotation node) {
		validateJstSource(node);
	}

	public void visit(JstArg node) {
		validateJstSource(node);
	}

	public void visit(JstArrayInitializer node) {
		validateJstSource(node);

	}

	public void visit(JstBlock node) {
		validateJstSource(node);

	}

	public void visit(JstBlockInitializer node) {
		validateJstSource(node);

	}

	public void visit(JstRawBlock node) {
		validateJstSource(node);

	}

	public void visit(JstDoc node) {
		validateJstSource(node);

	}

	public void visit(JstIdentifier node) {
		if("arguments".equals(node.toExprText())){
			visitChildren(node);
			return;
		}
		validateJstSource(node, node.toExprText());

	}

	public void visit(JstInitializer node) {
		if(node.toText().contains("arguments")){
			visitChildren(node);
			return;
		}
		validateJstSource(node, node.toText());

	}

	public void visit(JstLiteral node) {
		validateJstSource(node);

	}

	public void visit(ArrayLiteral node) {
		validateJstSource(node);
	}

	public void visit(ObjLiteral node) {
		validateJstSource(node);

	}

	public void visit(RegexpLiteral node) {
		validateJstSource(node);

	}

	public void visit(SimpleLiteral node) {
		validateJstSource(node);

	}

	public void visit(JstMethod node) {
		validateJstSource(node);

	}

	public void visit(JstConstructor node) {
		validateJstSource(node);

	}

	public void visit(JstModifiers node) {
		validateJstSource(node);
	}

	public void visit(JstName node) {
		validateJstSource(node);

	}

	public void visit(JstPackage node) {
		validateJstSource(node);

	}

	public void visit(JstProperty node) {
		validateJstSource(node);

	}

	public void visit(JstType node) {
		validateJstSource(node);

	}

	public void visit(JstArray node) {
		validateJstSource(node);

	}

	public void visit(JstFunctionRefType node) {
		validateJstSource(node);

	}

	public void visit(JstObjectLiteralType node) {
		validateJstSource(node);

	}

	public void visit(JstRefType node) {
		validateJstSource(node);

	}

	public void visit(IJstRefType node) {
		validateJstSource(node);

	}
	
//	public void visit(JstPrototypeType node) {
//		validateJstSource(node);
//
//	}

	public void visit(JstTypeReference node) {
//		validateJstSource(node);
	}

	public void visit(JstVar node) {
		validateJstSource(node);

	}

	public void visit(JstVars node) {
		if(node.toText().contains("arguments")){
			visitChildren(node);
			return;
			
		}
		validateJstSource(node);
	}

	public void visit(NV node) {
		validateJstSource(node);

	}

	public void visit(JstStmt node) {
		validateJstSource(node);

	}

	public void visit(BoolExpr node) {
		validateJstSource(node);

	}

	public void visit(InfixExpr node) {
		validateJstSource(node);

	}

	public void visit(ParenthesizedExpr node) {
		validateJstSource(node);

	}

	public void visit(PostfixExpr node) {
		validateJstSource(node);

	}

	public void visit(PrefixExpr node) {
		validateJstSource(node);

	}

	public void visit(ArrayAccessExpr node) {
		validateJstSource(node);

	}

	public void visit(ArrayCreationExpr node) {
		validateJstSource(node);

	}

	public void visit(AssignExpr node) {
		if(node.toExprText().equals("arguments=")){
			visitChildren(node);
			return;
		}
		validateJstSource(node, node.toExprText());

	}

	public void visit(CastExpr node) {
		validateJstSource(node);

	}

	public void visit(ConditionalExpr node) {
		validateJstSource(node);

	}

	public void visit(FieldAccessExpr node) {
		validateJstSource(node);

	}

	public void visit(FuncExpr node) {
		validateJstSource(node);

	}

	public void visit(ObjCreationExpr node) {
		validateJstSource(node);

	}

	public void visit(MtdInvocationExpr node) {
		validateJstSource(node);

	}

	public void visit(ExprStmt node) {
		validateJstSource(node);

	}

	public void visit(CaseStmt node) {
		validateJstSource(node);

	}

	public void visit(BlockStmt node) {
		validateJstSource(node);

	}

	public void visit(CatchStmt node) {
		validateJstSource(node);

	}

	public void visit(ForInStmt node) {
		validateJstSource(node);

	}

	public void visit(ForStmt node) {
		validateJstSource(node);

	}

	public void visit(IfStmt node) {
		validateJstSource(node);

	}

	public void visit(DispatchStmt node) {
		validateJstSource(node);

	}

	public void visit(SwitchStmt node) {
		validateJstSource(node);

	}

	public void visit(TryStmt node) {
		validateJstSource(node);

	}

	public void visit(WhileStmt node) {
		validateJstSource(node);

	}

	public void visit(DoStmt node) {
		validateJstSource(node);

	}

	public void visit(WithStmt node) {
		validateJstSource(node);

	}

	public void visit(BreakStmt node) {
		validateJstSource(node);

	}

	public void visit(ContinueStmt node) {
		validateJstSource(node);

	}

	public void visit(LabeledStmt node) {
		validateJstSource(node);

	}

	public void visit(RtnStmt node) {
		validateJstSource(node);

	}

	public void visit(TypeDeclStmt node) {
		validateJstSource(node);

	}

	public void visit(ListExpr node) {
		validateJstSource(node);

	}

	public void visit(ThisStmt node) {
		validateJstSource(node);

	}

	public void visit(TextExpr node) {
		validateJstSource(node);

	}

	public void visit(TextStmt node) {
		validateJstSource(node);

	}

	public void visit(ThrowStmt node) {
		validateJstSource(node);

	}

	public void visit(PtyGetter node) {
		validateJstSource(node);

	}

	public void visit(PtySetter node) {
		validateJstSource(node);

	}

	public void visit(JstProxyMethod node) {
//		validateJstSource(node);

	}

	public void visit(JstProxyProperty node) {
//		validateJstSource(node);

	}

	public void visit(JstParamType node) {
//		validateJstSource(node);

	}

	public void visit(JstWildcardType node) {
//		validateJstSource(node);

	}

	public void visit(JstTypeWithArgs node) {
//		validateJstSource(node);

	}

	@Override
	public void visit(JstGlobalVar node) {
		validateJstSource(node);
	}

	@Override
	public void visit(JstGlobalFunc node) {
		validateJstSource(node);
	}

	@Override
	public void visit(JstGlobalProp node) {
		validateJstSource(node);
	}

	@Override
	public void visit(JstProxyIdentifier node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(BaseJsCommentMetaNode<?> node) {
		validateJstSource(node);
	}
}
