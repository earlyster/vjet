/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsgen.shared.util;

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

public class PrintJstBindingTree implements IJstNodeVisitor {

	private static final String TAB = "\t";
	private int m_indentLevel;

	public void visit(BaseJstNode node) {
//		printNode(node);

	}

	public void visit(JstAnnotation node) {
	}

	public void visit(JstArg node) {
		
	}

	public void visit(JstArrayInitializer node) {

	}

	public void visit(JstBlock node) {
//		printNode(node);
		m_indentLevel++;
		visitChildren(node);
		m_indentLevel--;
	}

	public void visit(JstBlockInitializer node) {
		

	}

	public void visit(JstRawBlock node) {
		
	}

	public void visit(JstDoc node) {
		

	}

	public void visit(JstIdentifier node) {
		printBinding(node.getJstBinding());
	}

	private void printBinding(IJstNode jstBinding) {
		if(jstBinding!=null)
		System.out.println("BINDING:" + jstBinding.toString()); //KEEPME
		
	}

	public void visit(JstInitializer node) {
		

	}

	public void visit(JstLiteral node) {
		

	}

	public void visit(ArrayLiteral node) {
		

	}

	public void visit(ObjLiteral node) {
		
		m_indentLevel++;
		visitChildren(node);
		m_indentLevel--;

	}

	public void visit(RegexpLiteral node) {
		

	}

	public void visit(SimpleLiteral node) {
		
		m_indentLevel++;
		visitChildren(node);
		m_indentLevel--;

	}

	public void visit(JstMethod node) {
		
		m_indentLevel++;
		visitChildren(node);
		m_indentLevel--;

	}

	public void visit(JstConstructor node) {
	

	}

	public void visit(JstModifiers node) {
		

	}

	public void visit(JstName node) {
		

	}

	public void visit(JstPackage node) {
		

	}

	public void visit(JstProperty node) {
		
	}

	public void visit(JstType node) {
			
			
			m_indentLevel++;
			visitChildren(node);
			m_indentLevel--;
			

	}

	public void visit(JstArray node) {
			

	}

	public void visit(JstFunctionRefType node) {
		

	}

	public void visit(JstObjectLiteralType node) {
			

	}

	public void visit(JstRefType node) {
			

	}

	public void visit(IJstRefType node) {
			

	}

	public void visit(JstTypeReference node) {
			

	}

	public void visit(JstVar node) {
			

	}

	public void visit(JstVars node) {
		
			System.out.println(printIndent() +"["+node.getClass().getSimpleName()+":"+node.toString().replaceAll("\\s+", " ") +" vars type:"+ node.getType().getName() +" ]"); //KEEPME 
		
			m_indentLevel++;
			visitChildren(node);
			m_indentLevel--;

	}

	public void visit(NV node) {
			printNode(node);
			m_indentLevel++;
			visitChildren(node);
			m_indentLevel--;

	}

	public void visit(JstStmt node) {
			

	}

	public void visit(BoolExpr node) {
			

	}

	public void visit(InfixExpr node) {
			

	}

	public void visit(ParenthesizedExpr node) {
			

	}

	public void visit(PostfixExpr node) {
			

	}

	public void visit(PrefixExpr node) {
			

	}

	public void visit(ArrayAccessExpr node) {
			

	}

	public void visit(ArrayCreationExpr node) {
			

	}

	public void visit(AssignExpr node) {
			

	}

	public void visit(CastExpr node) {
			

	}

	public void visit(ConditionalExpr node) {
			

	}

	public void visit(FieldAccessExpr node) {
		System.out.print(printIndent() +"["+node.getClass().getSimpleName()+":"+node.toString().replaceAll("\\s+", " ") ); //KEEPME 
		if(node.getType()!=null){
		System.out.print(",Type = " +node.getType().getName()); //KEEPME 
		}
		System.out.println(" ]"); //KEEPME 

	}

	public void visit(FuncExpr node) {
			printNode(node);

	}

	public void visit(ObjCreationExpr node) {
			printNode(node);

	}

	public void visit(MtdInvocationExpr node) {
			printNode(node);
			m_indentLevel++;
			visitChildren(node);
			m_indentLevel--;

	}

	public void visit(ExprStmt node) {
		

	}

	public void visit(CaseStmt node) {
		

	}

	public void visit(BlockStmt node) {
		

	}

	public void visit(CatchStmt node) {
		

	}

	public void visit(ForInStmt node) {
		

	}

	public void visit(ForStmt node) {
		
	}

	public void visit(IfStmt node) {
		
	}

	public void visit(DispatchStmt node) {
		

	}

	public void visit(SwitchStmt node) {
		

	}

	public void visit(TryStmt node) {
		

	}

	public void visit(WhileStmt node) {
		

	}

	public void visit(DoStmt node) {
		

	}

	public void visit(WithStmt node) {
		

	}

	public void visit(BreakStmt node) {
		

	}

	public void visit(ContinueStmt node) {
		

	}

	public void visit(LabeledStmt node) {
		

	}

	public void visit(RtnStmt node) {
		

	}

	public void visit(TypeDeclStmt node) {
		

	}

	public void visit(ListExpr node) {
		

	}

	public void visit(ThisStmt node) {
		

	}

	public void visit(TextExpr node) {
		

	}

	public void visit(TextStmt node) {
		

	}

	public void visit(ThrowStmt node) {
		

	}

	public void visit(PtyGetter node) {
		

	}

	public void visit(PtySetter node) {
		

	}

	public void visit(JstProxyMethod node) {
		

	}

	public void visit(JstProxyProperty node) {
		

	}

	public void visit(JstParamType node) {
		

	}

	public void visit(JstWildcardType node) {
		

	}

	public void visit(JstTypeWithArgs node) {
			

	}
	
//	public void visit(JstPrototypeType node) {
//		printNode(node);
//	
//	}
	
	private void printNode(IJstNode node){
		String space = printIndent();
		
		
	
		System.out.print(space +"["+node.getClass().getSimpleName()+":"+node.toString().replaceAll("\\s+", " ") ); //KEEPME 
		
		
		System.out.println(" ]"); //KEEPME 
		
	
		
		
	}

	private String printIndent() {
		String space = "";
		for(int i=0;i<m_indentLevel;i++){
			space += TAB;
		}
		return space;
	}
	
	private void visitChildren(IJstNode node){
		for(IJstNode child : node.getChildren()){
			child.accept(this);
		}
	}

	@Override
	public void visit(JstGlobalVar node) {
		// TODO Auto-generated method stub
		printNode(node);

	}

	@Override
	public void visit(JstGlobalFunc node) {
		// TODO Auto-generated method stub
		printNode(node);

	}

	@Override
	public void visit(JstGlobalProp node) {
		// TODO Auto-generated method stub
		printNode(node);

	}

	@Override
	public void visit(JstProxyIdentifier node) {
		printNode(node);
	}

	@Override
	public void visit(BaseJsCommentMetaNode<?> node) {
		printNode(node);
	}

}
