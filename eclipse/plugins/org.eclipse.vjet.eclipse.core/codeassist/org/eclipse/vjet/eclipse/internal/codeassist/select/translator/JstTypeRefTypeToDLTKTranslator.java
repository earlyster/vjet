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
import org.eclipse.vjet.dsf.jst.declaration.JstTypeRefType;
import org.eclipse.vjet.eclipse.internal.codeassist.select.JstNodeDLTKElementResolver;

/**
 * JstRefType translator
 * 
 * 
 *
 */
public class JstTypeRefTypeToDLTKTranslator extends DefaultNodeTranslator {

	/* (non-Javadoc)
	 * @see org.eclipse.vjet.eclipse.internal.codeassist.select.translator.DefaultNodeTranslator#resolveBinding(org.eclipse.vjet.dsf.jst.IJstNode)
	 */
	@Override
	public IJstNode lookupBinding(IJstNode jstNode) {
		JstTypeRefType jstTypeRefType = (JstTypeRefType)jstNode;
		return JstNodeDLTKElementResolver.lookupBinding(jstTypeRefType.getType());
	}

}
