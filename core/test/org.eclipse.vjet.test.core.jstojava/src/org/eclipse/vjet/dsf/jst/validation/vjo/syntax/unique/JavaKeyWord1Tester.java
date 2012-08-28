/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.syntax.unique;




import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.VjoSyntaxProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.eclipse.vjet.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;




/**
 * Java key word testers in vjo syntax
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
//@Category( { P3, FAST, UNIT })
public class JavaKeyWord1Tester extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
        // ML should change the var problem id
        for (int i = 0; i < GenerateJavaKeyWordHelper.javaKeyWord.length; i++) {
            expectProblems.add(createNewProblem(
                    VjoSyntaxProbIds.IncorrectVjoSyntax, 3 + i, 0));
        }
    }

    @Test
    @Ignore
    //@Category( { P3, FAST, UNIT })
    //@Description("Test java key word")
    // quick bug 5880
    public void testOverrideType1() {

        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "syntax.unique/", "javaKeyWord1.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
