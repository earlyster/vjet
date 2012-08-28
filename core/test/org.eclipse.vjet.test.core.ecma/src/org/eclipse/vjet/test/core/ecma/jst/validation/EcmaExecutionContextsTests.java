/*******************************************************************************
 * Copyright (c) 2005-2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.test.core.ecma.jst.validation;




import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.VarProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.junit.Before;
import org.junit.Test;




/**
 * EcmaExecutionContextsTests.java
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@Category( { P3, FAST, UNIT })
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
public class EcmaExecutionContextsTests extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
//        expectProblems.add(createNewProblem(
//                MethodProbIds.WrongNumberOfArguments, 75, 0));
//        expectProblems.add(createNewProblem(
//                MethodProbIds.WrongNumberOfArguments, 1629, 0));
//        expectProblems.add(createNewProblem(
//                MethodProbIds.WrongNumberOfArguments, 1678, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 310, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 388, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 461, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 535, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 614, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 696, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 840, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 920, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 1189, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 1322, 0));
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test DSF project, To validate false positive ")
    public void testEcmaExecutionContextsTests() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "vjet.dsf.jslang.feature.tests.", "EcmaExecutionContextsTests.js",
                this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
