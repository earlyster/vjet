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
import org.eclipse.vjet.eclipse.codeassist.CodeassistUtils;
import org.eclipse.vjet.eclipse.core.IVjoSourceModule;
import org.eclipse.vjet.eclipse.internal.codeassist.select.JstNodeDLTKElementResolver;
import org.eclipse.dltk.mod.core.IModelElement;
import org.eclipse.dltk.mod.core.IType;

/**
 * 
 * 
 */
public class JstBlockTranslator extends DefaultNodeTranslator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.vjet.eclipse.internal.codeassist.select.translator
	 * .DefaultNodeTranslator#convert(org.eclipse.vjet.dsf.jst.IJstNode)
	 */
	@Override
	public IModelElement[] convert(IVjoSourceModule module, IJstNode node) {
		JstBlock jstBlock = (JstBlock) node;
		
			
		// jstBlock.getVarTable().
		IJstType ownerType = jstBlock.getOwnerType();
		IModelElement[] elements = JstNodeDLTKElementResolver.convert(module,
				ownerType);
		if (elements.length == 0 || !(elements[0] instanceof IType)) {
			return null;
		}
		IType dltkType = (IType) elements[0];
		
		// find element by offset
		if(module==null){
			return null;
		}
		
		IModelElement element = CodeassistUtils.findLocalElement(
				(org.eclipse.dltk.mod.core.ISourceModule) module, jstBlock
						.getSource().getStartOffSet());

		return element == null ? null : new IModelElement[] { element };

	}
}
