/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsgen.shared.validation.common;

import org.eclipse.vjet.dsf.jsgen.shared.jstvalidator.ValidationCtx;
import org.eclipse.vjet.dsf.jst.IJstMethod;
import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.IJstProperty;
import org.eclipse.vjet.dsf.jst.IJstType;

public abstract class BaseJstValidationRule implements IJstValidationRule {

	
	public abstract IJstValidationRuleSpec getSpec();

	public void validate(ValidationCtx ctx){
		IJstNode node = ctx.getNode();
		if(node instanceof IJstType){
			IJstType type = (IJstType)node;
			validate(ctx,type);
		}
		if(node instanceof IJstMethod){
			IJstMethod m = (IJstMethod)node;
			validate(ctx,m);
		}
		
		if(node instanceof IJstProperty){
			IJstProperty p = (IJstProperty)node;
			validate(ctx,p);
		}
		
		
	}

	public void validate(ValidationCtx ctx, IJstType type){
		// default impl
	}
	public void validate(ValidationCtx ctx, IJstMethod type){
		// default impl
	}
	public void validate(ValidationCtx ctx, IJstProperty type){
		// default impl
	}

//	protected IJstProblem problem(JstProblemId id,
//			IJstNode node, ValidationCtx ctx) {
//			JstSource source = node.getSource();
//			int startOffset = source.getStartOffSet();
//			int endOffset = source.getEndOffSet();
//			
//			int line = source.getRow();
//			int col = source.getColumn();
//			IJstProblem prb =new DefaultJstProblem(null,id,null,ctx.getFilePath().toCharArray(),startOffset,endOffset,line,col,ProblemSeverity.error);
//			return prb;
//			
//	}

}
