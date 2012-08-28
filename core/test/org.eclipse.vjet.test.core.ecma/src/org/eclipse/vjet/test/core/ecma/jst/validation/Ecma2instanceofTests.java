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

import org.eclipse.vjet.dsf.jsgen.shared.ids.MethodProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.ids.VarProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.junit.Before;
import org.junit.Test;




/**
 * Ecma2instanceofTests.java
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@Category( { P3, FAST, UNIT })
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
public class Ecma2instanceofTests extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 119, 0));
        expectProblems.add(createNewProblem(
                MethodProbIds.WrongNumberOfArguments, 123, 0));
        expectProblems.add(createNewProblem(
                MethodProbIds.WrongNumberOfArguments, 135, 0));
        expectProblems.add(createNewProblem(
                MethodProbIds.WrongNumberOfArguments, 142, 0));
        expectProblems.add(createNewProblem(VarProbIds.LooseVarDecl, 184, 0));
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test DSF project, To validate false positive ")
    public void testEcma2instanceofTests() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "vjet.dsf.jslang.feature.tests.", "Ecma2instanceofTests.js", this
                        .getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
