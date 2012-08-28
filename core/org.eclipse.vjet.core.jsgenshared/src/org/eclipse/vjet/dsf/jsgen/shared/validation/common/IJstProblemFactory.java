/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsgen.shared.validation.common;

import java.util.Locale;

import org.eclipse.vjet.dsf.jst.IScriptProblem;
import org.eclipse.vjet.dsf.jst.JstProblemId;
import org.eclipse.vjet.dsf.jst.ProblemSeverity;

/**
 * API for creating problems used to be used by 
 * Jst validators
 * 
 * 
 *
 */

public interface IJstProblemFactory {
	IScriptProblem createProblem(
			char[] originatingFileName,
			JstProblemId problemId,
			String[] problemArguments,
			String[] messageArguments, // shorter versions of the problemArguments
			ProblemSeverity severity,
			int startPosition,
			int endPosition,
			int lineNumber,
			int columnNumber);

		Locale getLocale();

		String getLocalizedMessage(JstProblemId id, String[] messageArguments);

}
