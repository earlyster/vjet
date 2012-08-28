/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.access.needs;




import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.MethodProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.ids.VarProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.ids.VjoSyntaxProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.eclipse.vjet.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Before;
import org.junit.Test;




/**
 * Access needs 1 tester
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
//@Category( { P1, FAST, UNIT })
public class AccessNeeds2Tester extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
        //bugfix by roy, correct error id
        expectProblems.add(createNewProblem(MethodProbIds.UndefinedMethod, 7, 0));
        expectProblems.add(createNewProblem(VarProbIds.UndefinedName, 10, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.TypeUnknownNotInTypeSpace, 2, 0));
    }

    @Test
    //@Category( { P1, FAST, UNIT })
    //@Description("Test access needs type, confirm undefined method")
    public void testAccesVisible1() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "access.needs.","AccessNeedsSample2.js", this
                        .getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
