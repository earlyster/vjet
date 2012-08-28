/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.semantic.validator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticValidator;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoValidationCtx;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.semantic.rules.VjoSemanticRuleRepo;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.semantic.rules.rulectx.BaseVjoSemanticRuleCtx;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.semantic.rules.rulectx.InvalidIdentifierNameRuleCtx;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.visitor.IVjoValidationPostAllChildrenListener;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.visitor.IVjoValidationPreAllChildrenListener;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.visitor.IVjoValidationVisitorEvent;
import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.declaration.JstVar;
import org.eclipse.vjet.dsf.jst.declaration.JstVars;
import org.eclipse.vjet.dsf.jst.expr.AssignExpr;
import org.eclipse.vjet.dsf.jst.expr.CastExpr;
import org.eclipse.vjet.dsf.jst.expr.FieldAccessExpr;
import org.eclipse.vjet.dsf.jst.expr.MtdInvocationExpr;
import org.eclipse.vjet.dsf.jst.expr.ObjCreationExpr;
import org.eclipse.vjet.dsf.jst.expr.PrefixExpr;
import org.eclipse.vjet.dsf.jst.stmt.BreakStmt;
import org.eclipse.vjet.dsf.jst.stmt.ContinueStmt;
import org.eclipse.vjet.dsf.jst.stmt.ForInStmt;
import org.eclipse.vjet.dsf.jst.stmt.LabeledStmt;
import org.eclipse.vjet.dsf.jst.term.JstIdentifier;
import org.eclipse.vjet.dsf.jst.term.NV;

public class VjoJstIdentifierValidator 
	extends VjoSemanticValidator
	implements
		IVjoValidationPreAllChildrenListener,
		IVjoValidationPostAllChildrenListener {

	private static List<Class<? extends IJstNode>> s_targetTypes;
	
	static{
		s_targetTypes = new ArrayList<Class<? extends IJstNode>>();
		s_targetTypes.add(JstIdentifier.class);
	}
	
	@Override
	public List<Class<? extends IJstNode>> getTargetNodeTypes() {
		return s_targetTypes;
	}

	@Override
	public void onPreAllChildrenEvent(final IVjoValidationVisitorEvent event){
		final VjoValidationCtx ctx = event.getValidationCtx();
		final IJstNode jstNode = event.getVisitNode();
		
		
		if(jstNode instanceof JstIdentifier){
			if(jstNode.getParentNode() instanceof NV){
				// DO NOT VALIDATE IDENTIFIERS in OL
				return;
			}
			final JstIdentifier jstIdentifier = (JstIdentifier)jstNode;
			final String jstIdentifierName = jstIdentifier.getName();
			final InvalidIdentifierNameRuleCtx ruleCtx = new InvalidIdentifierNameRuleCtx(jstIdentifier, ctx.getGroupId(), new String[]{jstIdentifierName}, jstIdentifierName);
			
			satisfyRule(ctx, VjoSemanticRuleRepo.getInstance().INVALID_IDENTIFIER, ruleCtx);
		}
	}
	
	@Override
	public void onPostAllChildrenEvent(final IVjoValidationVisitorEvent event){
		final VjoValidationCtx ctx = event.getValidationCtx();
		final IJstNode jstNode = event.getVisitNode();
		if(jstNode instanceof JstIdentifier){
			//to validate jst identifier as a standalone expression
			//report problem
			final JstIdentifier jstIdentifier = (JstIdentifier)jstNode;
			//skip FieldAccessExpr/MtdInvocationExpr/ObjCreationExpr
			final IJstNode parentNode = jstIdentifier.getParentNode();
			if(parentNode != null){
				if((parentNode instanceof FieldAccessExpr 
						&& ((FieldAccessExpr)parentNode).getName() == jstIdentifier)
						|| parentNode instanceof LabeledStmt
						|| parentNode instanceof BreakStmt
						|| parentNode instanceof ContinueStmt
					//	|| (parentNode instanceof AssignExpr && parentNode.getParentNode() != null && parentNode.getParentNode() instanceof JstInitializer)
						|| (parentNode instanceof MtdInvocationExpr 
								&& ((MtdInvocationExpr)parentNode).getMethodIdentifier() == jstIdentifier
								&& !(parentNode.getParentNode() != null && parentNode.getParentNode() instanceof ObjCreationExpr && ((MtdInvocationExpr)parentNode).getQualifyExpr() == null))
						|| parentNode instanceof PrefixExpr && PrefixExpr.Operator.TYPEOF.equals(((PrefixExpr)parentNode).getOperator())){
					return;
				}
				if(parentNode instanceof NV){
					if (((NV)parentNode).getIdentifier() == jstNode) {
						// DO NOT VALIDATE IDENTIFIERS in name field
						return;
					}
				}
			}
			
			if(jstIdentifier.getJstBinding() == null){
				if(parentNode instanceof AssignExpr && (((AssignExpr)parentNode).getLHS() == jstIdentifier) ||
				   parentNode instanceof ForInStmt && (((ForInStmt)parentNode).getVar() == jstIdentifier)) {
					//report a different problem
				    //Added by Eric.Ma on 20100629 for cast statement type is empty; such ://<<
				    if(parentNode instanceof AssignExpr && ((AssignExpr) parentNode).getExpr() != null){
				        if(((AssignExpr) parentNode).getExpr() instanceof CastExpr){
				            return;
				        }
				    }
				    
				    if(parentNode.getParentNode() instanceof JstVar
				    		|| parentNode.getParentNode() instanceof JstVars){
				    	return;
				    }
				    //End of added.
					final BaseVjoSemanticRuleCtx ruleCtx = new BaseVjoSemanticRuleCtx(jstIdentifier, ctx.getGroupId(), new String[]{jstIdentifier.getName(), jstIdentifier.toExprText()});
					satisfyRule(ctx, VjoSemanticRuleRepo.getInstance().IMPLICIT_GLOBAL_VARIABLE_DECLARED, ruleCtx);
				}
				else{
					final BaseVjoSemanticRuleCtx ruleCtx = new BaseVjoSemanticRuleCtx(jstIdentifier, ctx.getGroupId(), new String[]{jstIdentifier.getName(), jstIdentifier.toExprText()});
					satisfyRule(ctx, VjoSemanticRuleRepo.getInstance().VARIABLE_SHOULD_BE_DEFINED, ruleCtx);
				}
			}
		}
	}
}
