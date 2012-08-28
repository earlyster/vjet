/*******************************************************************************
 * Copyright (c) 2005-2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.docx;




import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.MethodProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.eclipse.vjet.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Before;
import org.junit.Test;




/**
 * Shim.java
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@Category( { P3, FAST, UNIT })
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
public class Shim extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
        expectProblems.add(createNewProblem(MethodProbIds.ShouldReturnValue,
                16, 0));
//        expectProblems.add(createNewProblem(
//                TypeProbIds.IncompatibleTypesInEqualityOperator, 27, 0));
//        expectProblems.add(createNewProblem(
//                TypeProbIds.IncompatibleTypesInEqualityOperator, 32, 0));
//        expectProblems
//                .add(createNewProblem(FieldProbIds.UndefinedField, 25, 0));
//        expectProblems
//                .add(createNewProblem(FieldProbIds.UndefinedField, 24, 0));

    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test Vjo vj lib project, To validate false positive ")
    public void testShim() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                VjoValidationBaseTester.VJLIB_FOLDER, "vjoPro.dsf.docx.",
                "Shim.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
