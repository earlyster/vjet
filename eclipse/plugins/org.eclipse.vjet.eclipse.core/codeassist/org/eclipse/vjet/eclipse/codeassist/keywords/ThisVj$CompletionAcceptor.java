/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.eclipse.codeassist.keywords;

import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.expr.FieldAccessExpr;
import org.eclipse.vjet.dsf.jstojava.translator.robust.completion.JstCompletion;

/**
 * This class accept or decline {@link VjoKeywordFactory#KWD_VJ$} completion keyword.
 * 
 * 
 *
 */
public class ThisVj$CompletionAcceptor extends CompletionAcceptor {

	@Override
	boolean accept(int position, JstCompletion completion) {
		boolean isAccept = false;
		IJstNode node = completion.getRealParent();
		
		if (node != null && node instanceof FieldAccessExpr) {			
			FieldAccessExpr expr = (FieldAccessExpr) node;		
			isAccept = expr.getExpr().toString().equals(CompletionConstants.THIS);
		}
		return isAccept;
	}
}
