/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jstojava.translator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.vjet.dsf.jst.BaseJstNode;
import org.eclipse.vjet.dsf.jst.IJstMethod;
import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.IJstRefType;
import org.eclipse.vjet.dsf.jst.JstSource;
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
import org.eclipse.vjet.dsf.jst.traversal.IJstNodeVisitor;

class JstUtilVisitor implements IJstNodeVisitor {

	private List<BaseJstNode> m_foundNodes = new ArrayList<BaseJstNode>();
	private int m_startOffset;
	private int m_endOffset;
	private boolean m_visitOverLoadedNodes = false;
	private boolean m_countIdentifierEndOffset = false;

	public JstUtilVisitor(int startOffset, int endOffset) {
		this(startOffset, endOffset, false);
	}
	
	public JstUtilVisitor(int startOffset, int endOffset, boolean visitOverLoadedNodes) {
		this(startOffset, endOffset, false, false);
	}
	
	/**
	 * @param startOffset
	 * @param endOffset
	 * @param visitOverLoadedNodes
	 * @param countIdentifierEndOffset check if the an node should be counted in if the end offset is after the JstIdentifier (the cursor is at the end of Identifer)
	 */
	public JstUtilVisitor(int startOffset, int endOffset, boolean visitOverLoadedNodes, boolean countIdentifierEndOffset) {
		this.m_startOffset = startOffset;
		this.m_endOffset = endOffset;
		this.m_visitOverLoadedNodes = visitOverLoadedNodes;
		this.m_countIdentifierEndOffset = countIdentifierEndOffset;
		if (m_countIdentifierEndOffset && m_endOffset > m_startOffset) {
			m_endOffset = m_endOffset - 1;
		}
	}
	
	private void checkNode(BaseJstNode node) {
		//TODO: we are excluding JsNaive type since the seems to be
		// a recursion happing when visiting the children nodes
		if (node instanceof JstType) {
			JstType jst = (JstType) node;
			if (jst.getAlias() != null &&
				jst.getAlias().startsWith("org.eclipse.vjet.dsf.jsnative")) {
					return;
			}
		}
//		System.out.println("JstUtilVisitor: checking " + node.getClass().getName());
		JstSource elementSource = node.getSource();
		if (elementSource != null &&
			includes(elementSource.getStartOffSet(), elementSource
					.getEndOffSet(), m_startOffset, m_endOffset)) {
//			System.out.println("JstUtilVisitor: found " + node.getClass().getName());
			m_foundNodes.add(node);
			
		}
		visitChildren(node);
	}
	
	
	static boolean includes(int elementStart, int elementEnd,
			int selectionStart, int selectionEnd) {
		return elementStart <= selectionStart && elementEnd >= selectionEnd;
	}

	private void visitChildren(IJstNode jstNode) {
		for (IJstNode child : jstNode.getChildren()) {
			child.accept(this);
		}
	}
	
	public void visit(BaseJstNode node) {
//		checkNode(node);
	}

	public void visit(JstAnnotation node) {
		checkNode(node);
	}

	public void visit(JstArg node) {
		checkNode(node);
	}

	public void visit(JstArrayInitializer node) {
		checkNode(node);

	}

	public void visit(JstBlock node) {
		checkNode(node);

	}

	public void visit(JstBlockInitializer node) {
		checkNode(node);

	}

	public void visit(JstRawBlock node) {
		checkNode(node);

	}

	public void visit(JstDoc node) {
		checkNode(node);

	}

	public void visit(JstIdentifier node) {
		checkNode(node);

	}

	public void visit(JstInitializer node) {
		checkNode(node);

	}

	public void visit(JstLiteral node) {
		checkNode(node);

	}

	public void visit(ArrayLiteral node) {
		checkNode(node);
	}

	public void visit(ObjLiteral node) {
		checkNode(node);

	}

	public void visit(RegexpLiteral node) {
		checkNode(node);

	}

	public void visit(SimpleLiteral node) {
		checkNode(node);

	}

	public void visit(JstMethod node) {
		checkNode(node);
		if (!m_visitOverLoadedNodes) {
			return;
		}
		if (node.isDispatcher()) {
			for (IJstMethod method : node.getOverloaded()) {
				visit((JstMethod)method);
			}
		}
	}

	public void visit(JstConstructor node) {
		checkNode(node);
		if (!m_visitOverLoadedNodes) {
			return;
		}
		if (node.isDispatcher()) {
			for (IJstMethod method : node.getOverloaded()) {
				visit((JstMethod)method);
			}
		}
	}

	public void visit(JstModifiers node) {
		checkNode(node);
	}

	public void visit(JstName node) {
		checkNode(node);

	}

	public void visit(JstPackage node) {
		checkNode(node);

	}

	public void visit(JstProperty node) {
		checkNode(node);

	}

	public void visit(JstType node) {
		checkNode(node);
	}

	public void visit(JstArray node) {
		checkNode(node);

	}

	public void visit(JstFunctionRefType node) {
		checkNode(node);

	}

	public void visit(JstObjectLiteralType node) {
		checkNode(node);

	}

	public void visit(JstRefType node) {
		checkNode(node);

	}

	public void visit(IJstRefType node) {
//		checkNode(node);
	}

	public void visit(JstTypeReference node) {
		checkNode(node);
	}

	public void visit(JstVar node) {
		checkNode(node);
	}

	public void visit(JstVars node) {
		checkNode(node);
	}

	public void visit(NV node) {
		checkNode(node);
	}

	public void visit(JstStmt node) {
		checkNode(node);
	}

	public void visit(BoolExpr node) {
		checkNode(node);
	}

	public void visit(InfixExpr node) {
		checkNode(node);

	}

	public void visit(ParenthesizedExpr node) {
		checkNode(node);
	}

	public void visit(PostfixExpr node) {
		checkNode(node);
	}

	public void visit(PrefixExpr node) {
		checkNode(node);
	}

	public void visit(ArrayAccessExpr node) {
		checkNode(node);
	}

	public void visit(ArrayCreationExpr node) {
		checkNode(node);
	}

	public void visit(AssignExpr node) {
		checkNode(node);
	}

	public void visit(CastExpr node) {
		checkNode(node);
	}

	public void visit(ConditionalExpr node) {
		checkNode(node);

	}

	public void visit(FieldAccessExpr node) {
		checkNode(node);

	}

	public void visit(FuncExpr node) {
		checkNode(node);

	}

	public void visit(ObjCreationExpr node) {
		checkNode(node);

	}

	public void visit(MtdInvocationExpr node) {
		checkNode(node);

	}

	public void visit(ExprStmt node) {
		checkNode(node);

	}

	public void visit(CaseStmt node) {
		checkNode(node);

	}

	public void visit(BlockStmt node) {
		checkNode(node);

	}

	public void visit(CatchStmt node) {
		checkNode(node);

	}

	public void visit(ForInStmt node) {
		checkNode(node);

	}

	public void visit(ForStmt node) {
		checkNode(node);

	}

	public void visit(IfStmt node) {
		checkNode(node);

	}

	public void visit(DispatchStmt node) {
		checkNode(node);

	}

	public void visit(SwitchStmt node) {
		checkNode(node);

	}

	public void visit(TryStmt node) {
		checkNode(node);

	}

	public void visit(WhileStmt node) {
		checkNode(node);

	}

	public void visit(DoStmt node) {
		checkNode(node);

	}

	public void visit(WithStmt node) {
		checkNode(node);

	}

	public void visit(BreakStmt node) {
		checkNode(node);

	}

	public void visit(ContinueStmt node) {
		checkNode(node);

	}

	public void visit(LabeledStmt node) {
		checkNode(node);

	}

	public void visit(RtnStmt node) {
		checkNode(node);

	}

	public void visit(TypeDeclStmt node) {
		checkNode(node);

	}

	public void visit(ListExpr node) {
		checkNode(node);

	}

	public void visit(ThisStmt node) {
		checkNode(node);

	}

	public void visit(TextExpr node) {
		checkNode(node);

	}

	public void visit(TextStmt node) {
		checkNode(node);

	}

	public void visit(ThrowStmt node) {
		checkNode(node);

	}

	public void visit(PtyGetter node) {
		checkNode(node);

	}

	public void visit(PtySetter node) {
		checkNode(node);

	}

	public void visit(JstProxyMethod node) {
//		checkNode(node);

	}

	public void visit(JstProxyProperty node) {
//		checkNode(node);

	}

	public void visit(JstParamType node) {
//		checkNode(node);

	}

	public void visit(JstWildcardType node) {
//		checkNode(node);

	}

	public void visit(JstTypeWithArgs node) {
//		checkNode(node);

	}

	public List<BaseJstNode> getFoundNodes() {
		return m_foundNodes;
	}

	@Override
	public void visit(JstGlobalVar node) {
		checkNode(node);
	}

	@Override
	public void visit(JstGlobalFunc node) {
		checkNode(node);
	}

	@Override
	public void visit(JstGlobalProp node) {
		checkNode(node);
	}

	@Override
	public void visit(JstProxyIdentifier node) {
		checkNode(node);
	}

	@Override
	public void visit(BaseJsCommentMetaNode<?> node) {
		checkNode(node);
	}
}
