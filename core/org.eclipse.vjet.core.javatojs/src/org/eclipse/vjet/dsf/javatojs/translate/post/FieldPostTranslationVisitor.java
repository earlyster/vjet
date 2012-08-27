/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.javatojs.translate.post;

import org.eclipse.vjet.dsf.javatojs.translate.TranslateCtx;
import org.eclipse.vjet.dsf.javatojs.translate.custom.CustomInfo;
import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.declaration.JstProperty;
import org.eclipse.vjet.dsf.jst.declaration.JstType;
import org.eclipse.vjet.dsf.jst.traversal.JstVisitorAdapter;

public class FieldPostTranslationVisitor extends JstVisitorAdapter {

	public boolean visit(IJstNode node){
		
		if (!(node instanceof JstProperty) || !(node.getOwnerType() instanceof JstType)){
			return true;
		}
		
		TranslateCtx ctx = TranslateCtx.ctx();
		
		JstType type = (JstType)node.getOwnerType();
		JstProperty pty = (JstProperty)node;
		String name = pty.getName().getName();
		CustomInfo cInfo = ctx.getTranslateInfo(type).getFieldCustomInfo(name);
		if (!cInfo.isNone()){
			type.removeProperty(name, pty.isStatic());
		}
		else if (cInfo.getName() != null && !cInfo.isMappedToJS() && !cInfo.isMappedToVJO()){
			pty.getName().setName(cInfo.getName());
		}
		
		return false;
	}
}
