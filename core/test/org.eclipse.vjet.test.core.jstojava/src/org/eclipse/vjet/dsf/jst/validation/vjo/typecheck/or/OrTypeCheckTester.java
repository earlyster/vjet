/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.or;




import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.TypeProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.eclipse.vjet.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Before;
import org.junit.Test;




/**
 * For test the in compatible types in Equality Operator.
 * 
 * 
 * @author <a href="mailto:huzhou@ebay.com">huzhou</a>
 * @since JDK 1.5
 */
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
//@Category( { P3, FAST, UNIT })
public class OrTypeCheckTester extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test or expression and type matching")
    public void testCompartibleType1() {
    	//assignment
    	expectProblems.add(createNewProblem(TypeProbIds.IncompatibleTypesInEqualityOperator, 14, 0));
    	//return
    	expectProblems.add(createNewProblem(TypeProbIds.IncompatibleTypesInEqualityOperator, 17, 0));
    	//method call
    	expectProblems.add(createNewProblem(TypeProbIds.IncompatibleTypesInEqualityOperator, 20, 0));
        
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "OrTypeCheck.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
