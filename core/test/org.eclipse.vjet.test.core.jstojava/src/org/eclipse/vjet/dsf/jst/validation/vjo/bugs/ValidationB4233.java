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
import org.eclipse.vjet.dsf.jsgen.shared.ids.TypeProbIds;
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
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
//@Category( { P1, FAST, UNIT })
public class ValidationB4233 extends VjoValidationBaseTester{
    @Before
    public void setUp() {
        expectProblems.clear();
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.InvalidIdentifier, 6, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.InvalidIdentifier, 31, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.InvalidIdentifier, 3, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.InvalidIdentifier, 19, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.InvalidIdentifier, 7, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.InvalidIdentifier, 35, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.InvalidIdentifier, 5, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.InvalidIdentifier, 27, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.InvalidIdentifier, 11, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.InvalidIdentifier, 4, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.InvalidIdentifier, 23, 0));
        expectProblems.add(createNewProblem(FieldProbIds.AmbiguousField, 3, 0));
        expectProblems.add(createNewProblem(FieldProbIds.AmbiguousField, 4, 0));
        expectProblems.add(createNewProblem(FieldProbIds.AmbiguousField, 5, 0));
        expectProblems.add(createNewProblem(FieldProbIds.AmbiguousField, 6, 0));
        expectProblems.add(createNewProblem(FieldProbIds.AmbiguousField, 7, 0));
        expectProblems.add(createNewProblem(MethodProbIds.OverlyVisibleMethod, 1, 0));
        expectProblems.add(createNewProblem(TypeProbIds.ClassBetterStartsWithCapitalLetter, 1, 0));
    }

    @Test
    //@Category( { P1, FAST, UNIT })
    //@Description("Test invalid identifier for field")
    public void testBugfix() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem("bugs.b4233/",
                "b4233A.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
