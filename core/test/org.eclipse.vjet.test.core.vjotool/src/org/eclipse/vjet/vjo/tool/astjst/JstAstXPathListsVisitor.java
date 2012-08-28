/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.vjo.tool.astjst;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.vjet.dsf.jst.BaseJstNode;
import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.IJstRefType;
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

public class JstAstXPathListsVisitor implements IJstNodeVisitor{
	
	private List<String> xpathList = new ArrayList<String>();
	private String xpathBuilder = "";
	
	private void traverse(IJstNode node) {
		String currentNode = node.getClass().getSimpleName(); 
		xpathBuilder += currentNode;
//		System.out.println(xpathBuilder);
		xpathList.add(xpathBuilder);
		visitChildren(node);
	}

	private void visitChildren(IJstNode jstNode) {
		for (IJstNode child : jstNode.getChildren()) {
			xpathBuilder += "/";
			child.accept(this);
		}
		if(xpathBuilder.lastIndexOf("/") > 0)
			xpathBuilder = xpathBuilder.substring(0, xpathBuilder.lastIndexOf("/"));
	}

//	public String getNodeName(IJstNode node) {
//		String value = null;
//		try {
//			JstAstInfoVisitor visitor = new JstAstInfoVisitor();
//			Method method = JstAstInfoVisitor.class.getMethod("visit", node
//					.getClass());
//			method.invoke(visitor, node);
//			value = visitor.getValue();
//		} catch (Exception e) {
//		}
//		return value;
//	}

	public List<String> getFoundNodes() {
		return xpathList;
	}

	@Override
	public void visit(BaseJstNode node) {
		traverse(node);
	}

	@Override
	public void visit(JstAnnotation node) {
		traverse(node);
	}

	@Override
	public void visit(JstArg node) {
		traverse(node);
	}

	@Override
	public void visit(JstArrayInitializer node) {
		traverse(node);
	}

	@Override
	public void visit(JstBlock node) {
		traverse(node);
	}

	@Override
	public void visit(JstBlockInitializer node) {
		traverse(node);
	}

	@Override
	public void visit(JstRawBlock node) {
		traverse(node);
	}

	@Override
	public void visit(JstDoc node) {
		traverse(node);
	}

	@Override
	public void visit(JstIdentifier node) {
		traverse(node);
	}

	@Override
	public void visit(JstInitializer node) {
		traverse(node);
	}

	@Override
	public void visit(JstLiteral node) {
		traverse(node);
	}

	@Override
	public void visit(ArrayLiteral node) {
		traverse(node);
	}

	@Override
	public void visit(ObjLiteral node) {
		traverse(node);
	}

	@Override
	public void visit(RegexpLiteral node) {
		traverse(node);
	}

	@Override
	public void visit(SimpleLiteral node) {
		traverse(node);
	}

	@Override
	public void visit(JstMethod node) {
		traverse(node);
	}

	@Override
	public void visit(JstConstructor node) {
		traverse(node);
	}

	@Override
	public void visit(JstModifiers node) {
		traverse(node);
	}

	@Override
	public void visit(JstName node) {
		traverse(node);
	}

	@Override
	public void visit(JstPackage node) {
		traverse(node);
	}

	@Override
	public void visit(JstProperty node) {
		traverse(node);
	}

	@Override
	public void visit(JstType node) {
		traverse(node);
	}

	@Override
	public void visit(JstArray node) {
		traverse(node);
	}

	@Override
	public void visit(JstFunctionRefType node) {
		traverse(node);
	}

	@Override
	public void visit(JstObjectLiteralType node) {
		traverse(node);
	}

	@Override
	public void visit(JstRefType node) {
		traverse(node);
	}

	@Override
	public void visit(IJstRefType node) {
	}

	@Override
	public void visit(JstTypeReference node) {
		traverse(node);
	}

	@Override
	public void visit(JstVar node) {
		traverse(node);
	}

	@Override
	public void visit(JstVars node) {
		traverse(node);
	}

	@Override
	public void visit(NV node) {
		traverse(node);
	}

	@Override
	public void visit(JstStmt node) {
		traverse(node);
	}

	@Override
	public void visit(BoolExpr node) {
		traverse(node);
	}

	@Override
	public void visit(InfixExpr node) {
		traverse(node);
	}

	@Override
	public void visit(ParenthesizedExpr node) {
		traverse(node);
	}

	@Override
	public void visit(PostfixExpr node) {
		traverse(node);
	}

	@Override
	public void visit(PrefixExpr node) {
		traverse(node);
	}

	@Override
	public void visit(ArrayAccessExpr node) {
		traverse(node);
	}

	@Override
	public void visit(ArrayCreationExpr node) {
		traverse(node);
	}

	@Override
	public void visit(AssignExpr node) {
		traverse(node);
	}

	@Override
	public void visit(CastExpr node) {
		traverse(node);
	}

	@Override
	public void visit(ConditionalExpr node) {
		traverse(node);
	}

	@Override
	public void visit(FieldAccessExpr node) {
		traverse(node);
	}

	@Override
	public void visit(FuncExpr node) {
		traverse(node);
	}

	@Override
	public void visit(ObjCreationExpr node) {
		traverse(node);
	}

	@Override
	public void visit(MtdInvocationExpr node) {
		traverse(node);
	}

	@Override
	public void visit(ExprStmt node) {
		traverse(node);
	}

	@Override
	public void visit(CaseStmt node) {
		traverse(node);
	}

	@Override
	public void visit(BlockStmt node) {
		traverse(node);
	}

	@Override
	public void visit(CatchStmt node) {
		traverse(node);
	}

	@Override
	public void visit(ForInStmt node) {
		traverse(node);
	}

	@Override
	public void visit(ForStmt node) {
		traverse(node);
	}

	@Override
	public void visit(IfStmt node) {
		traverse(node);
	}

	@Override
	public void visit(DispatchStmt node) {
		traverse(node);
	}

	@Override
	public void visit(SwitchStmt node) {
		traverse(node);
	}

	@Override
	public void visit(TryStmt node) {
		traverse(node);
	}

	@Override
	public void visit(WhileStmt node) {
		traverse(node);
	}

	@Override
	public void visit(DoStmt node) {
		traverse(node);
	}

	@Override
	public void visit(WithStmt node) {
		traverse(node);
	}

	@Override
	public void visit(BreakStmt node) {
		traverse(node);
	}

	@Override
	public void visit(ContinueStmt node) {
		traverse(node);
	}

	@Override
	public void visit(LabeledStmt node) {
		traverse(node);
	}

	@Override
	public void visit(RtnStmt node) {
		traverse(node);
	}

	@Override
	public void visit(TypeDeclStmt node) {
		traverse(node);
	}

	@Override
	public void visit(ListExpr node) {
		traverse(node);
	}

	@Override
	public void visit(ThisStmt node) {
		traverse(node);
	}

	@Override
	public void visit(TextExpr node) {
		traverse(node);
	}

	@Override
	public void visit(TextStmt node) {
		traverse(node);
	}

	@Override
	public void visit(ThrowStmt node) {
		traverse(node);
	}

	@Override
	public void visit(PtyGetter node) {
		traverse(node);
	}

	@Override
	public void visit(PtySetter node) {
		traverse(node);
	}

	@Override
	public void visit(JstProxyMethod node) {
	}

	@Override
	public void visit(JstProxyProperty node) {
	}

	@Override
	public void visit(JstParamType node) {
	}

	@Override
	public void visit(JstWildcardType node) {
	}

	@Override
	public void visit(JstTypeWithArgs node) {
	}

	@Override
	public void visit(JstGlobalVar node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(JstGlobalFunc node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(JstGlobalProp node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(JstProxyIdentifier node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(BaseJsCommentMetaNode<?> node) {
		// TODO Auto-generated method stub
		
	}

}
