/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.semantic.rules.rulectx;

import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.IJstType;

public class MTypeShouldNotHaveInnerTypesRuleCtx extends BaseVjoSemanticRuleCtx {

	private IJstType m_mtype;
	
	public MTypeShouldNotHaveInnerTypesRuleCtx(final IJstNode node, final String groupId, final String[] arguments, final IJstType mtype){
		super(node, groupId, arguments);

		m_mtype = mtype;
	}
	
	public IJstType getMType(){
		return m_mtype;
	}
}
