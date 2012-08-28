/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.access.innerclass;




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
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
//@Category( { P1, FAST, UNIT })
public class InnerClassInMTypeTester extends VjoValidationBaseTester {
    @Before
    public void setUp() {
        expectProblems.clear();
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.MTypeWithInnerTypes, 1, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.MTypeAsInnerType, 7, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.OTypeAsInnerType, 11, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.MTypeAsInnerType, 22, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.OTypeAsInnerType, 26, 0));
    }

    @Test
    //@Category( { P1, FAST, UNIT })
    //@Description("Test all Xtype as inner type in MType")
    public void testAccesVisible1() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "access.innerClass.","InnerclassInMType.js", this
                        .getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
