/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jstojava.translator.robust.ast2jst;

import org.eclipse.vjet.dsf.jst.stmt.ContinueStmt;
import org.eclipse.vjet.dsf.jst.term.JstIdentifier;
import org.eclipse.vjet.dsf.jstojava.translator.TranslateHelper;
import org.eclipse.mod.wst.jsdt.internal.compiler.ast.ContinueStatement;

public class ContinueStatementTranslator extends
		BaseAst2JstTranslator<ContinueStatement, ContinueStmt> {

	@Override
	protected ContinueStmt doTranslate(ContinueStatement statement) {
		ContinueStmt continueStmt;
		if (statement.label != null && statement.label.length > 0) {
			JstIdentifier identifier = new JstIdentifier(String
					.valueOf(statement.label));
			// TODO add JSTSource to JstIdentifier
			continueStmt = new ContinueStmt(identifier);
		}
		else {
			continueStmt = new ContinueStmt();
		}			
		continueStmt.setSource(TranslateHelper.getSource(statement, m_ctx.getSourceUtil()));
		m_parent.addChild(continueStmt);
		return continueStmt;
	}
}
