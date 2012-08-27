/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
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
import org.eclipse.vjet.dsf.jst.IJstRefType;
import org.eclipse.vjet.dsf.jst.IJstTypeReference;
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
import org.eclipse.vjet.dsf.jst.declaration.JstInferredType;
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

public class JstAstInfoVisitor implements IJstNodeVisitor {
	private String value = "";
	
	private List<String> type = new ArrayList<String>();
	
	public List<String> getType(){
		return type;
	}
	
	public String getValue(){
		return value;
	}

	@Override
	public void visit(BaseJstNode node) {
		value = node.toString();
		type.add(node.getRootType().getSimpleName());
	}

	@Override
	public void visit(JstAnnotation node) {
		value = node.getName().getName();
	}

	@Override
	public void visit(JstArg node) {
		value = node.getName();
		List<IJstTypeReference> actualTypeRef = node.getTypesRef();
		for (IJstTypeReference jstTypeReference : actualTypeRef) {
			type.add(jstTypeReference.getReferencedType().getSimpleName());	
		}
	}

	@Override
	public void visit(JstArrayInitializer node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(JstBlock node) {
		value = node.toBlockText();
		type.add(node.getClass().getSimpleName());
	}

	@Override
	public void visit(JstBlockInitializer node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(JstRawBlock node) {
		value = node.toBlockText();
	}

	@Override
	public void visit(JstDoc node) {
		value = node.getComment();
	}

	@Override
	public void visit(JstIdentifier node) {
		value = node.getName();
	}
	
	@Override
	public void visit(JstProxyIdentifier node) {
		value = node.getName();
	}

	@Override
	public void visit(JstInitializer node) {
		value = node.toText();
		type.add(node.getType().getSimpleName());
	}

	@Override
	public void visit(JstLiteral node) {
		value = node.toSimpleTermText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ArrayLiteral node) {
		value = node.toValueText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ObjLiteral node) {
		value = node.toValueText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(RegexpLiteral node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(SimpleLiteral node) {
		value = node.getValue();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(JstMethod node) {
		value = node.getName().getName();
	}

	@Override
	public void visit(JstConstructor node) {
		value = node.getName().getName();
	}

	@Override
	public void visit(JstModifiers node) {
		value = node.getAccessScope();
	}

	@Override
	public void visit(JstName node) {
		value = node.getName();
	}

	@Override
	public void visit(JstPackage node) {
		value = node.getName();
	}

	@Override
	public void visit(JstProperty node) {
		value = node.getName().getName();
		type.add(node.getType().getSimpleName());
	}

	@Override
	public void visit(JstType node) {
		value = node.getSimpleName();
		type.add(node.getSimpleName());
	}

	@Override
	public void visit(JstArray node) {
		value = node.getSimpleName();
		type.add(node.getElementType().getSimpleName());
	}

	@Override
	public void visit(JstFunctionRefType node) {
		value = node.getSimpleName();
	}

	@Override
	public void visit(JstObjectLiteralType node) {
		value = node.getSimpleName();
	}

	@Override
	public void visit(JstRefType node) {
		value = node.getName();
		try{
			type.add(node.getRefType().getSimpleName());
		}catch(Exception e){}
	}

	@Override
	public void visit(IJstRefType node) {
		value = node.getSimpleName();
		type.add(node.getReferencedNode().getSimpleName());
	}

	@Override
	public void visit(JstTypeReference node) {
		value = node.toString();
		type.add(node.getReferencedType().getSimpleName());
	}

	@Override
	public void visit(JstVar node) {
		value = node.getName();
		type.add(node.getType().getSimpleName());
	}

	@Override
	public void visit(JstVars node) {
		value = node.getAssignments().get(0).getLHS().toLHSText();
		type.add(node.getType().getSimpleName());
	}

	@Override
	public void visit(NV node) {
		value = node.getName();
	}

	@Override
	public void visit(JstStmt node) {
		value = node.toString();
	}

	@Override
	public void visit(BoolExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(InfixExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ParenthesizedExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(PostfixExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(PrefixExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ArrayAccessExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ArrayCreationExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(AssignExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(CastExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ConditionalExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(FieldAccessExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(FuncExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ObjCreationExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(MtdInvocationExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ExprStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(CaseStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(BlockStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(CatchStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(ForInStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(ForStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(IfStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(DispatchStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(SwitchStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(TryStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(WhileStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(DoStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(WithStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(BreakStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(ContinueStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(LabeledStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(RtnStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(TypeDeclStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(ListExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ThisStmt node) {
		value = node.toExprText();
	}

	@Override
	public void visit(TextExpr node) {
		value = node.toExprText();
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(TextStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(ThrowStmt node) {
		value = node.toStmtText();
	}

	@Override
	public void visit(PtyGetter node) {
		value = node.toExprText();
	}

	@Override
	public void visit(PtySetter node) {
		value = node.getPtyValue();
	}

	@Override
	public void visit(JstProxyMethod node) {
		value = node.getName().getName();
	}

	@Override
	public void visit(JstProxyProperty node) {
		value = node.getName().getName();
		type.add(node.getType().getSimpleName());
	}

	@Override
	public void visit(JstParamType node) {
		value = node.getName();
		type.add(node.getType().getSimpleName());
	}

	@Override
	public void visit(JstWildcardType node) {
		value = node.getName();
		type.add(node.getType().getSimpleName());
	}

	@Override
	public void visit(JstTypeWithArgs node) {
		value = node.getName();
		type.add(node.getArgType().getSimpleName());
	}

	@Override
	public void visit(JstGlobalVar node) {
		
	}

	@Override
	public void visit(JstGlobalFunc node) {
		value = node.getName().getName();
		
	}

	@Override
	public void visit(JstGlobalProp node) {
		value = node.getName().getName();
	}

	@Override
	public void visit(BaseJsCommentMetaNode<?> node) {
		// TODO Auto-generated method stub
		
	}
	
	public void visit(JstInferredType node) {
		// TODO Auto-generated method stub
		
	}
}
