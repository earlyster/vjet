/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.syntax.declare.innertype;




import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.FieldProbIds;
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
public class NestedClientTester extends VjoValidationBaseTester {
    @Before
    public void setUp(){
        expectProblems.clear();
        expectProblems.add(createNewProblem(FieldProbIds.UndefinedField, 8, 0));
    }

    @Test
    //@Category( { P1, FAST, UNIT })
    //@Description("Test invoking instance innertype and static innertype")
    public void testNestedTypes() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "syntax.declare.innerType.","NestedClient.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
