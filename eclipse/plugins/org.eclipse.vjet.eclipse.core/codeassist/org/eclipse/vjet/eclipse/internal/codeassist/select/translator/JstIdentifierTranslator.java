/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
/**
 * 
 */
package org.eclipse.vjet.eclipse.internal.codeassist.select.translator;

import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.dsf.jst.declaration.JstBlock;
import org.eclipse.vjet.dsf.jst.declaration.JstProperty;
import org.eclipse.vjet.dsf.jst.declaration.SynthOlType;
import org.eclipse.vjet.dsf.jst.term.JstIdentifier;
import org.eclipse.vjet.eclipse.codeassist.CodeassistUtils;
import org.eclipse.vjet.eclipse.internal.codeassist.select.JstNodeDLTKElementResolver;

/**
 * the ton unit jst node is JstIdentifier, this is the key translator based on
 * JstBinding.
 * 
 * 
 * 
 */
public class JstIdentifierTranslator extends DefaultNodeTranslator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.vjet.eclipse.internal.codeassist.select.translator.DefaultNodeTranslator#resolveBinding(org.eclipse.vjet.dsf.jst.IJstNode)
	 */
	@Override
	public IJstNode lookupBinding(IJstNode jstNode) {
		JstIdentifier identifier = (JstIdentifier) jstNode;
		if (identifier.getJstBinding() == null) {
			return null;
		}
		if (isKeyWord(identifier)) {
			return null;
		}
		IJstNode binding = identifier.getJstBinding();
		
		if(binding instanceof JstProperty){
			if(((JstProperty)binding).getParentNode() instanceof SynthOlType){
				binding = identifier.getParentNode();
				//CodeassistUtils.findDeclaringBlock(binding);
				
				JstBlock declaringBlock = CodeassistUtils.findDeclaringBlock(binding);
				return declaringBlock;
			
			}
			
		}
		

		//check the identifer in local variable declarion site.
		if((binding == null || binding instanceof IJstType) && CodeassistUtils.isLocalVarDeclaration(identifier)){
			binding = identifier.getParentNode().getParentNode();// JstVars
		}
		
		if(binding == null || binding == identifier){
			return null;
		}
		
		return JstNodeDLTKElementResolver.lookupBinding(binding);
	}

	private boolean isKeyWord(JstIdentifier identifier) {
		if ("this".equals(identifier.getName()))
			return true;
		if ("vj$".equals(identifier.getName()))
			return true;
		return false;
	}

}
