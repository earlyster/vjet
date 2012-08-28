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

import org.eclipse.vjet.dsf.jsgen.shared.ids.VjoSyntaxProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.junit.Before;
import org.junit.Test;




/**
 * Js13ExtensionsTests.java
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@Category( { P3, FAST, UNIT })
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
public class Js13ExtensionsTests extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
        expectProblems.add(createNewProblem(
                VjoSyntaxProbIds.TypeUnknownMissingImport, 70, 0));
        // Bug 8433 fix;
// expectProblems.add(createNewProblem(TypeProbIds.IncompatibleTypesInEqualityOperator,
// 70, 0));
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test DSF project, To validate false positive ")
    public void testJs13ExtensionsTests() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "vjet.dsf.jslang.feature.tests.", "Js13ExtensionsTests.js", this
                        .getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
