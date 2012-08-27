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

public class JstAstGetTypeVisitor implements IJstNodeVisitor {
	private List<String> type = new ArrayList<String>();
	
	public List<String> getType(){
		return type;
	}

	@Override
	public void visit(BaseJstNode node) {
		type.add(node.getRootType().getSimpleName());
	}

	@Override
	public void visit(JstAnnotation node) {
		// type.add(null);
	}

	@Override
	public void visit(JstArg node) {
		List<IJstTypeReference> actualTypeRef = node.getTypesRef();
		for (IJstTypeReference jstTypeReference : actualTypeRef) {
			type.add(jstTypeReference.getReferencedType().getSimpleName());	
		}
	}

	@Override
	public void visit(JstArrayInitializer node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(JstBlock node) {
		// type.add(null);
	}

	@Override
	public void visit(JstBlockInitializer node) {
		// type.add(null);
	}

	@Override
	public void visit(JstRawBlock node) {
		// type.add(null);
	}

	@Override
	public void visit(JstDoc node) {
		// type.add(null);
	}

	@Override
	public void visit(JstIdentifier node) {
		// type.add(null);
	}

	@Override
	public void visit(JstInitializer node) {
		type.add(node.getType().getSimpleName());
	}

	@Override
	public void visit(JstLiteral node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ArrayLiteral node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ObjLiteral node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(RegexpLiteral node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(SimpleLiteral node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(JstMethod node) {
		// type.add(null);
	}

	@Override
	public void visit(JstConstructor node) {
		type.add(node.getOType().getName());
	}

	@Override
	public void visit(JstModifiers node) {
		// type.add(null);
	}

	@Override
	public void visit(JstName node) {
		// type.add(null);
	}

	@Override
	public void visit(JstPackage node) {
		// type.add(null);
	}

	@Override
	public void visit(JstProperty node) {
		type.add(node.getType().getSimpleName());
	}

	@Override
	public void visit(JstType node) {
		type.add(node.getSimpleName());
	}

	@Override
	public void visit(JstArray node) {
		type.add(node.getElementType().getSimpleName());
	}

	@Override
	public void visit(JstFunctionRefType node) {
	//	type.add(null);
	}

	@Override
	public void visit(JstObjectLiteralType node) {
//		type.add(null);
	}

	@Override
	public void visit(JstRefType node) {
		type.add(node.getRefType().getSimpleName());
	}

	@Override
	public void visit(IJstRefType node) {
		type.add(node.getReferencedNode().getSimpleName());
	}

	@Override
	public void visit(JstTypeReference node) {
		type.add(node.getReferencedType().getSimpleName());
	}

	@Override
	public void visit(JstVar node) {
		type.add(node.getType().getSimpleName());
	}

	@Override
	public void visit(JstVars node) {
		type.add(node.getType().getSimpleName());
	}

	@Override
	public void visit(NV node) {
//		type.add(null);
	}

	@Override
	public void visit(JstStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(BoolExpr node) {
//		type.add(null);
	}

	@Override
	public void visit(InfixExpr node) {
//		type.add(null);
	}

	@Override
	public void visit(ParenthesizedExpr node) {
//		type.add(null);
	}

	@Override
	public void visit(PostfixExpr node) {
//		type.add(null);
	}

	@Override
	public void visit(PrefixExpr node) {
//		type.add(null);
	}

	@Override
	public void visit(ArrayAccessExpr node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ArrayCreationExpr node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(AssignExpr node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(CastExpr node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ConditionalExpr node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(FieldAccessExpr node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(FuncExpr node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ObjCreationExpr node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(MtdInvocationExpr node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ExprStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(CaseStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(BlockStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(CatchStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(ForInStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(ForStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(IfStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(DispatchStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(SwitchStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(TryStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(WhileStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(DoStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(WithStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(BreakStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(ContinueStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(LabeledStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(RtnStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(TypeDeclStmt node) {
		type.add(node.getType().getSimpleName());
	}

	@Override
	public void visit(ListExpr node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(ThisStmt node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(TextExpr node) {
		type.add(node.getResultType().getSimpleName());
	}

	@Override
	public void visit(TextStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(ThrowStmt node) {
//		type.add(null);
	}

	@Override
	public void visit(PtyGetter node) {
//		type.add(null);
	}

	@Override
	public void visit(PtySetter node) {
//		type.add(null);
	}

	@Override
	public void visit(JstProxyMethod node) {
//		type.add(null);
	}

	@Override
	public void visit(JstProxyProperty node) {
		type.add(node.getType().getSimpleName());
	}

	@Override
	public void visit(JstParamType node) {
		type.add(node.getType().getSimpleName());
	}

	@Override
	public void visit(JstWildcardType node) {
		type.add(node.getType().getSimpleName());
	}

	@Override
	public void visit(JstTypeWithArgs node) {
		type.add(node.getArgType().getSimpleName());
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
