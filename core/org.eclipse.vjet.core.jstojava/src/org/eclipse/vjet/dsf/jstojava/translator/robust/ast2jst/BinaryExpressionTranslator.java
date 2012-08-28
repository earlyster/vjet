/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jstojava.translator.robust.ast2jst;

import org.eclipse.vjet.dsf.jst.expr.ArithExpr;
import org.eclipse.vjet.dsf.jst.expr.BoolExpr;
import org.eclipse.vjet.dsf.jst.expr.InfixExpr;
import org.eclipse.vjet.dsf.jst.token.IExpr;
import org.eclipse.mod.wst.jsdt.internal.compiler.ast.BinaryExpression;
import org.eclipse.mod.wst.jsdt.internal.compiler.ast.OR_OR_Expression;

public class BinaryExpressionTranslator extends BaseAst2JstTranslator<BinaryExpression, ArithExpr> {

	@Override
	protected ArithExpr doTranslate(BinaryExpression expr) {
		IExpr left = (IExpr) getTranslatorAndTranslate(expr.left);
		IExpr right = (IExpr) getTranslatorAndTranslate(expr.right);
		org.eclipse.vjet.dsf.jst.expr.BoolExpr.Operator bop = 
			org.eclipse.vjet.dsf.jst.expr.BoolExpr.Operator
				.toOperator(expr.operatorToString());
		if (bop != null && !(expr instanceof OR_OR_Expression)) {
			return ParenthesizedExpressionUtil.convert(
					expr, new BoolExpr(left, right, bop));
		} else {
			org.eclipse.vjet.dsf.jst.expr.InfixExpr.Operator iop = 
				org.eclipse.vjet.dsf.jst.expr.InfixExpr.Operator
					.toOperator(expr.operatorToString());
				return ParenthesizedExpressionUtil.convert(
						expr, new InfixExpr(left, right, iop));
		}
		
	}
}
