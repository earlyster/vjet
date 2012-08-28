/*******************************************************************************
 * Copyright (c) 2005-2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.document;




import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.MethodProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.ids.TypeProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.eclipse.vjet.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Before;
import org.junit.Test;




/**
 * Frame.java
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@Category( { P3, FAST, UNIT })
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
public class Frame extends VjoValidationBaseTester {

    @Before
    public void setUp() {
    	// removed undefined fields due to document is now dynamic type which means fields have no error/warning
        expectProblems.clear();
//        expectProblems
//                .add(createNewProblem(FieldProbIds.UndefinedField, 17, 0));
        expectProblems.add(createNewProblem(MethodProbIds.UndefinedMethod, 14,
                0));
//        expectProblems
//                .add(createNewProblem(FieldProbIds.UndefinedField, 17, 0));
//        expectProblems
//                .add(createNewProblem(FieldProbIds.UndefinedField, 17, 0));
        expectProblems
                .add(createNewProblem(TypeProbIds.UnusedActiveNeeds, 1, 0));
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test Vjo vj lib project, To validate false positive ")
    public void testFrame() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                VjoValidationBaseTester.VJLIB_FOLDER, "vjoPro.dsf.document.",
                "Frame.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
