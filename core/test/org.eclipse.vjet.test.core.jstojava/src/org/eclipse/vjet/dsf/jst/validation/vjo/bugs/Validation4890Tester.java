/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.bugs;





import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.FieldProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.ids.MethodProbIds;
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
//@Category( { P3, FAST, UNIT })
public class Validation4890Tester extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
        expectProblems
                .add(createNewProblem(MethodProbIds.UndefinedMethod, 9, 0));
        expectProblems
                .add(createNewProblem(FieldProbIds.UndefinedField, 11, 0));
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test undefiend field and method")
    public void testBugfix() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "bugs.b4890/", "B4890.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
