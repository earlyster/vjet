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

import org.eclipse.vjet.dsf.jst.IJstMethod;
import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.eclipse.codeassist.CodeassistUtils;
import org.eclipse.vjet.eclipse.core.IVjoSourceModule;
import org.eclipse.vjet.eclipse.core.VjetPlugin;
import org.eclipse.vjet.eclipse.internal.codeassist.select.JstNodeDLTKElementResolver;
import org.eclipse.dltk.mod.core.IModelElement;
import org.eclipse.dltk.mod.core.IType;
import org.eclipse.dltk.mod.core.ModelException;

/**
 * 
 * 
 */
public class JstMethodTranslator extends DefaultNodeTranslator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.vjet.eclipse.internal.codeassist.select.translator.DefaultNodeTranslator#convert(org.eclipse.vjet.dsf.jst.IJstNode)
	 */
	@Override
	public IModelElement[] convert(IVjoSourceModule module, IJstNode node) {
		IJstMethod jstMethod = (IJstMethod) node;
		IJstType ownerType = jstMethod.getOwnerType();
		IModelElement[] convert = JstNodeDLTKElementResolver.convert(module, ownerType);
		if(convert == null || convert.length==0){
			return null;
		}
		IType dltkType = (IType) convert[0];
		if (dltkType == null) {
			return null;
		}
		try {
			IModelElement[] converted = CodeassistUtils.getMethod(dltkType, jstMethod);
			if(converted == null){
				//check local method
				converted = CodeassistUtils.getLocalVar((org.eclipse.dltk.mod.compiler.env.ISourceModule) dltkType
						.getSourceModule(), jstMethod.getName().getName(), "Function", jstMethod.getSource());
			}
			
			return converted != null ?  converted
			: new IModelElement[0];
		} catch (ModelException e) {
			VjetPlugin.error(e.getLocalizedMessage(), e);
		}
		return null;
	}
}
