/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jst.traversal;

import org.eclipse.vjet.dsf.jst.BaseJstNode;
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
import org.eclipse.vjet.dsf.jst.stmt.TextStmt;
import org.eclipse.vjet.dsf.jst.stmt.ThisStmt;
import org.eclipse.vjet.dsf.jst.stmt.ThrowStmt;
import org.eclipse.vjet.dsf.jst.stmt.TryStmt;
import org.eclipse.vjet.dsf.jst.stmt.TypeDeclStmt;
import org.eclipse.vjet.dsf.jst.stmt.WhileStmt;
import org.eclipse.vjet.dsf.jst.stmt.WithStmt;
import org.eclipse.vjet.dsf.jst.stmt.SwitchStmt.CaseStmt;
import org.eclipse.vjet.dsf.jst.term.ArrayLiteral;
import org.eclipse.vjet.dsf.jst.term.JstIdentifier;
import org.eclipse.vjet.dsf.jst.term.JstLiteral;
import org.eclipse.vjet.dsf.jst.term.JstProxyIdentifier;
import org.eclipse.vjet.dsf.jst.term.NV;
import org.eclipse.vjet.dsf.jst.term.ObjLiteral;
import org.eclipse.vjet.dsf.jst.term.RegexpLiteral;
import org.eclipse.vjet.dsf.jst.term.SimpleLiteral;

public interface IJstNodeVisitor {

	//fundamental jst nodes
	void visit(final BaseJstNode node);
	void visit(final JstAnnotation node);
	void visit(final JstArg node);
	void visit(final JstArrayInitializer node);
	void visit(final JstBlock node);
	void visit(final JstBlockInitializer node);
	void visit(final JstRawBlock node);
	void visit(final JstDoc node);
	void visit(final JstIdentifier node);
	void visit(final JstInitializer node);
	void visit(final JstLiteral node);
	void visit(final ArrayLiteral node);
	void visit(final ObjLiteral node);
	void visit(final RegexpLiteral node);
	void visit(final SimpleLiteral node);
	void visit(final JstMethod node);
	void visit(final JstConstructor node);
	void visit(final JstModifiers node);
	void visit(final JstName node);
	void visit(final JstPackage node);
	void visit(final JstProperty node);
	void visit(final JstType node);
	void visit(final JstArray node);
	void visit(final JstFunctionRefType node);
	void visit(final JstObjectLiteralType node);
	void visit(final JstRefType node);
	void visit(final IJstRefType node);
	void visit(final JstTypeReference node);
	void visit(final JstVar node);
	void visit(final JstVars node);
	void visit(final NV node);
	void visit(final JstStmt node);
	void visit(final JstGlobalVar node);
	void visit(final JstGlobalFunc node);
	void visit(final JstGlobalProp node);
	
	
	//expressions
	void visit(final BoolExpr node);
	void visit(final InfixExpr node);
	void visit(final ParenthesizedExpr node);
	void visit(final PostfixExpr node);
	void visit(final PrefixExpr node);
	void visit(final ArrayAccessExpr node);
	void visit(final ArrayCreationExpr node);
	void visit(final AssignExpr node);
	void visit(final CastExpr node);
	void visit(final ConditionalExpr node);
	void visit(final FieldAccessExpr node);
	void visit(final FuncExpr node);
	void visit(final ObjCreationExpr node);
	void visit(final MtdInvocationExpr node);
	
	//statements
	void visit(final ExprStmt node);
	void visit(final CaseStmt node);
	void visit(final BlockStmt node);
	void visit(final CatchStmt node);
	void visit(final ForInStmt node);
	void visit(final ForStmt node);
	void visit(final IfStmt node);
	void visit(final DispatchStmt node);
	void visit(final SwitchStmt node);
	void visit(final TryStmt node);
	void visit(final WhileStmt node);
	void visit(final DoStmt node);
	void visit(final WithStmt node);
	void visit(final BreakStmt node);
	void visit(final ContinueStmt node);
	void visit(final LabeledStmt node);
	void visit(final RtnStmt node);
	void visit(final TypeDeclStmt node);
	void visit(final ListExpr node);
	void visit(final ThisStmt node);
	void visit(final TextExpr node);
	void visit(final TextStmt node);
	void visit(final ThrowStmt node);

	//others
	void visit(final PtyGetter node);
	void visit(final PtySetter node);
	void visit(final JstProxyMethod node);
	void visit(final JstProxyProperty node);
	void visit(final JstProxyIdentifier node);
	void visit(final JstParamType node);
	void visit(final JstWildcardType node);
	void visit(final JstTypeWithArgs node);
	void visit(final BaseJsCommentMetaNode<?> node);
}
