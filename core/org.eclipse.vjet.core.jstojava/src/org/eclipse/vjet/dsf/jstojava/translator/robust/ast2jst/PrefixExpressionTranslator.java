/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jstojava.translator.robust.ast2jst;

import org.eclipse.vjet.dsf.jst.expr.PrefixExpr;
import org.eclipse.vjet.dsf.jst.token.IExpr;
import org.eclipse.mod.wst.jsdt.internal.compiler.ast.PrefixExpression;

public class PrefixExpressionTranslator extends BaseAst2JstTranslator<PrefixExpression, PrefixExpr> {

	@Override
	protected PrefixExpr doTranslate(PrefixExpression statement) {
		
		IExpr m_term = (IExpr) getTranslatorAndTranslate(statement.lhs, m_parent);
		org.eclipse.vjet.dsf.jst.expr.PrefixExpr.Operator m_op = org.eclipse.vjet.dsf.jst.expr.PrefixExpr.Operator
				.toOperator(statement.operatorToString());
		return new PrefixExpr(m_term, m_op);
	}
}
