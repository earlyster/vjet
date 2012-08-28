/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.syntax.needs;





import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.VjoSyntaxProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.eclipse.vjet.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Before;
import org.junit.Test;




/**
 * Class/Interface description
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@ModuleInfo(value = "DsfPrebuild", subModuleId = "JsToJava")
public class InactiveNeedsTester extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
    }

    @Test
    //@Category( { P1, FAST, UNIT })
    //@Description("Inactive Needs with type which unexist in typespace")
    public void testIfstatement1() {
        expectProblems.add(createNewProblem(
                VjoSyntaxProbIds.TypeUnknownNotInTypeSpace, 1, 0));
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "syntax.needs/", "InactiveEmployee6.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
    
    @Test
    //@Category( { P1, FAST, UNIT })
    //@Description("Inactive Needs with type which exist in typespace")
    public void testIfstatement2() {
        expectProblems.clear();
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "syntax.needs/", "InactiveEmployee5.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
