/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.javatojs.util;

import java.net.URL;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Type;

import org.eclipse.vjet.dsf.javatojs.translate.AstBinding;
import org.eclipse.vjet.dsf.javatojs.translate.TranslateHelper;
import org.eclipse.vjet.dsf.jst.IJstMethod;
import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.dsf.jst.IJstTypeReference;
import org.eclipse.vjet.dsf.jst.declaration.JstArg;
import org.eclipse.vjet.dsf.jst.declaration.JstType;

public class AstBindingHelper {

	public static AstBinding getAstSrcBinding(IJstNode jstNode){
		try {
			return (AstBinding)jstNode.getOwnerType().getSource().getBinding();
		}
		catch(Exception e){
			return null;
		}
	}
	
	public static ASTNode getAstNode(IJstNode jstNode){
		try {
			return ((AstBinding)jstNode.getSource().getBinding()).getAstNode();
		}
		catch(Exception e){
			return null;
		}
	}
	
	public static CompilationUnit getCompilationUnit(JstType type){
		try {
			return (CompilationUnit)getAstSrcBinding(type).getAstNode();
		}
		catch(Exception e){
			return null;
		}
	}
	
	public static AbstractTypeDeclaration getAstType(IJstType jstType){
		ASTNode astNode = getAstNode(jstType);
		if (astNode instanceof AbstractTypeDeclaration){
			return (AbstractTypeDeclaration)astNode;
		}
		else if (astNode instanceof CompilationUnit){
			CompilationUnit cu = (CompilationUnit)astNode;
			AbstractTypeDeclaration astType;
			for (Object obj: cu.types()){
				astType = (AbstractTypeDeclaration)obj;
				if (TranslateHelper.isPublic(astType.modifiers())){
					return astType;
				}
			}	
		}
		return null;
	}
	
	public static Type getAstType(final JstArg jstArg){
		ASTNode astNode = getAstNode(jstArg);
		if (astNode instanceof Type){
			return (Type)astNode;
		}
		return null;
	}
	
	public static Type getAstType(final IJstTypeReference jstTypeRef){
		ASTNode astNode = getAstNode(jstTypeRef);
		if (astNode instanceof Type){
			return (Type)astNode;
		}
		return null;
	}
	
	public static MethodDeclaration getAstMethod(IJstMethod jstMtd){
		return (MethodDeclaration)getAstNode(jstMtd);
	}
	
	public static String getSourceName(IJstNode jstNode){
		try {
			IJstType jstType = jstNode.getOwnerType();
				
			while (jstType.getOuterType() != null){
				jstType = jstType.getOuterType();
			}
			AstBinding binding = getAstSrcBinding(jstType);
			
			if (binding == null) return null;
			
			return binding.getPkgName() == null ? 
					binding.getClassName() :
					binding.getPkgName() + "." + binding.getClassName();

		}
		catch(Exception e){
			return null;
		}
	}
	
	public static URL getPackagePath(JstType type){
		try {
			return getAstSrcBinding(type).getPkgPath();
		}
		catch(Exception e){
			return null;
		}
	}
}
