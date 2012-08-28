/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.compatibletypes;




import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.TypeProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.eclipse.vjet.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Before;
import org.junit.Test;




/**
 * For test the in compatible types in Equality Operator.
 * 
 * Should validate 1. var x = 10; x="String"; 2. var x; //< Public int X =
 * "String"; 3. var x; //< Pulic int x = 'String'; 4. var x2 = 10; x2 = 20.323;
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@Category( { P3, FAST, UNIT })
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
public class TypecheckObjLiteralTester extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
        expectProblems.add(createNewProblem(
                TypeProbIds.IncompatibleTypesInEqualityOperator, 10, 0));
        expectProblems.add(createNewProblem(
                TypeProbIds.IncompatibleTypesInEqualityOperator, 17, 0));
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test incomatible situation between functions assignment")
    public void testCompartibleType1() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "typecheck.compartible.", "TypecheckObjLiteral.js", this
                        .getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
