/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jst.validation.vjo.mtdinvocation;





import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.MethodProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.ids.TypeProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.eclipse.vjet.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Test;




//@ModuleInfo(value = "DsfPrebuild", subModuleId = "JsToJava")
public class VjoReturnTypeAsFunctionTest extends VjoValidationBaseTester {

	List<VjoSemanticProblem> actualProblems = null;

	@Test
	//@Category( { P2, FAST, UNIT })
	//@Description("Test local method declaration and invocation")
	public void testReturnTypeAsFunction() throws Exception {
		expectProblems.clear();
		expectProblems
		 .add(createNewProblem(MethodProbIds.ParameterMismatch, 14, 0));
		expectProblems
		 .add(createNewProblem(TypeProbIds.IncompatibleTypesInEqualityOperator, 14, 0));
		expectProblems
		 .add(createNewProblem(MethodProbIds.ParameterMismatch, 23, 0));
		expectProblems
		 .add(createNewProblem(TypeProbIds.IncompatibleTypesInEqualityOperator, 23, 0));
		
		actualProblems = getVjoSemanticProblem(
				"org.eclipse.vjet.dsf.jst.validation.vjo.mtdinvocation.",
				"ReturnTypeAsFunction.js", this.getClass());
		assertProblemEquals(expectProblems, actualProblems);
	}
}
