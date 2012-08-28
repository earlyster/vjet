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
 * EcmaStringTests.java
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@Category( { P3, FAST, UNIT })
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
public class EcmaStringTests extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 538, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 861, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 6119, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 6602, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 7086, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 11226, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 11226, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 11578, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 11578, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 11732, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 11914, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 11914, 0));
//        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 12011, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 12129, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 12205, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 12209, 0));
//        expectProblems.add(createNewProblem(
//                MethodProbIds.WrongNumberOfArguments, 12097, 0));
//        expectProblems.add(createNewProblem(
//                MethodProbIds.WrongNumberOfArguments, 12099, 0));
//        expectProblems.add(createNewProblem(
//                MethodProbIds.WrongNumberOfArguments, 12101, 0));
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test DSF project, To validate false positive ")
    public void testEcmaStringTests() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "vjet.dsf.jslang.feature.tests.", "EcmaStringTests.js", this
                        .getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
