/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
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
import org.eclipse.vjet.eclipse.core.IVjoSourceModule;
import org.eclipse.dltk.mod.core.IModelElement;

/**
 * list common methods for sub classes
 * 
 * 
 * 
 */
public abstract class DefaultNodeTranslator implements IJstNodeTranslator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.vjet.eclipse.internal.codeassist.select.translator.IJstNodeTranslator#convert(org.eclipse.vjet.dsf.jst.IJstNode)
	 */
	@Override
	public IModelElement[] convert(IJstNode node) {
		return convert(null, node);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.vjet.eclipse.internal.codeassist.select.translator.IJstNodeTranslator#resolveBinding(org.eclipse.vjet.dsf.jst.IJstNode)
	 */
	@Override
	public IJstNode lookupBinding(IJstNode jstNode) {
		// default implementation
		return jstNode;
	}
	
	
	/* 
	 * Ignore IVjoSourceModule by default
	 * @see org.eclipse.vjet.eclipse.internal.codeassist.select.translator.IJstNodeTranslator#convert(org.eclipse.vjet.eclipse.core.IVjoSourceModule, org.eclipse.vjet.dsf.jst.IJstNode)
	 */
	public IModelElement[] convert(IVjoSourceModule module, IJstNode node) {
		return null;
	}

}
