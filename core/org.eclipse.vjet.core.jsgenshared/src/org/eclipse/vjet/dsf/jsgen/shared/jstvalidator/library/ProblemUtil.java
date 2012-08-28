/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsgen.shared.jstvalidator.library;

import org.eclipse.vjet.dsf.jsgen.shared.jstvalidator.DefaultJstProblem;
import org.eclipse.vjet.dsf.jsgen.shared.jstvalidator.ValidationCtx;
import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.IScriptProblem;
import org.eclipse.vjet.dsf.jst.JstProblemId;
import org.eclipse.vjet.dsf.jst.JstSource;
import org.eclipse.vjet.dsf.jst.ProblemSeverity;

public class ProblemUtil {

	public static IScriptProblem problem(JstProblemId id,
			IJstNode node, ValidationCtx ctx) {
			JstSource source = node.getSource();
			int startOffset = source.getStartOffSet();
			int endOffset = source.getEndOffSet();
			
			int line = source.getRow();
			int col = source.getColumn();
			IScriptProblem prb =new DefaultJstProblem(null,id,null,ctx.getFilePath().toCharArray(),startOffset,endOffset,line,col,ProblemSeverity.error);
			return prb;
			
	}
	
}
