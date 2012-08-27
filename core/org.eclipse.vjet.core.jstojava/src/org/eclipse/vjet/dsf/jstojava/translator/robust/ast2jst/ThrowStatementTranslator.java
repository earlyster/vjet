/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jstojava.translator.robust.ast2jst;

import org.eclipse.vjet.dsf.jst.stmt.ThrowStmt;
import org.eclipse.vjet.dsf.jst.token.IExpr;
import org.eclipse.vjet.dsf.jstojava.translator.TranslateHelper;
import org.eclipse.mod.wst.jsdt.internal.compiler.ast.ThrowStatement;

public class ThrowStatementTranslator extends BaseAst2JstTranslator<ThrowStatement, ThrowStmt> {

	@Override
	protected ThrowStmt doTranslate(ThrowStatement statement) {
		IExpr expr = (IExpr) getTranslatorAndTranslate(statement.exception, m_parent);
		ThrowStmt throwStmt = new ThrowStmt(expr);
		throwStmt.setSource(TranslateHelper.getSource(statement, m_ctx.getSourceUtil()));
		if (m_parent != null){
			m_parent.addChild(throwStmt);
		}	
		return throwStmt;
	}

}
