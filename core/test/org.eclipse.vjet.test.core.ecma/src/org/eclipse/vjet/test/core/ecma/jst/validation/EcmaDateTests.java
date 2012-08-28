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

import org.eclipse.vjet.dsf.jsgen.shared.ids.FieldProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.ids.MethodProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;




/**
 * EcmaDateTests.java
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@Category( { P3, FAST, UNIT })
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
public class EcmaDateTests extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
        expectProblems.add(createNewProblem(
                FieldProbIds.FieldInitializationDependsOnUnintializedTypes, 19,
                0));
        expectProblems.add(createNewProblem(
                FieldProbIds.FieldInitializationDependsOnUnintializedTypes, 20,
                0));
        expectProblems.add(createNewProblem(
                FieldProbIds.FieldInitializationDependsOnUnintializedTypes, 23,
                0));
        expectProblems.add(createNewProblem(MethodProbIds.UnreachableStmt, 408,
                0));
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test DSF project, To validate false positive ")
    @Ignore("d2 = Date.parse(Date(1969,11,31,16,0,0,1));")
    public void testEcmaDateTests() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "vjet.dsf.jslang.feature.tests.", "EcmaDateTests.js", this
                        .getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
