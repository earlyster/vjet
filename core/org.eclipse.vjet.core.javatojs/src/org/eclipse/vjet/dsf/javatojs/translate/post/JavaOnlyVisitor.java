/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.javatojs.translate.post;

import org.eclipse.vjet.dsf.javatojs.translate.TranslateCtx;
import org.eclipse.vjet.dsf.javatojs.translate.TranslateInfo;
import org.eclipse.vjet.dsf.javatojs.translate.config.MethodKey;
import org.eclipse.vjet.dsf.javatojs.translate.custom.CustomInfo;
import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.declaration.JstMethod;
import org.eclipse.vjet.dsf.jst.declaration.JstProperty;
import org.eclipse.vjet.dsf.jst.declaration.JstType;
import org.eclipse.vjet.dsf.jst.term.JstIdentifier;
import org.eclipse.vjet.dsf.jst.traversal.JstVisitorAdapter;

public class JavaOnlyVisitor extends JstVisitorAdapter {
	
	//
	// Satisfy IJstVisitor
	//
	public boolean visit(IJstNode node){
		
		TranslateCtx ctx = TranslateCtx.ctx();
		
		if (node instanceof JstIdentifier){
			JstIdentifier jstIdentifier = (JstIdentifier)node;
			IJstNode jstBinding = jstIdentifier.getJstBinding();
			if (jstBinding instanceof JstType){
				JstType jstType = (JstType)jstBinding;
				if (jstType != null){
					if(ctx.isJavaOnly(jstType)){
						jstIdentifier.setName(null);
						jstIdentifier.setQualifier(null);
					}
				}
			}
			else if (jstBinding instanceof JstProperty){
				JstProperty jstPty = (JstProperty)jstBinding;
				if (jstPty != null && jstPty.getOwnerType() instanceof JstType){
					TranslateInfo tI = ctx.getTranslateInfo((JstType)jstPty.getOwnerType());
					CustomInfo cI = tI.getFieldCustomInfo(jstPty.getName().getName());
					if(cI.isJavaOnly()){
						jstIdentifier.setName(null);
					}
				}
			}
			else if (jstBinding instanceof JstMethod){
				JstMethod jstMtd = (JstMethod)jstBinding;
				if (jstMtd != null && jstMtd.getOwnerType() instanceof JstType){
					TranslateInfo tI = ctx.getTranslateInfo((JstType)jstMtd.getOwnerType());
					CustomInfo cI = tI.getMethodCustomInfo(MethodKey.genMethodKey(jstMtd));
					if(cI.isJavaOnly()){
						jstIdentifier.setName(null);
					}
				}
			}
		}
		
		return true;
	}
}
