/*******************************************************************************
 * Copyright (c) 2005-2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib;




import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.MethodProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.eclipse.vjet.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Before;
import org.junit.Test;




/**
 * FormDropdownAddOptions.java
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@Category( { P3, FAST, UNIT })
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
public class FormDropdownAddOptions extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
        // expectProblems.add(createNewProblem(FieldProbIds.UndefinedField, 8,
        // 0));
        expectProblems
                .add(createNewProblem(MethodProbIds.UndefinedMethod, 7, 0));
        expectProblems
                .add(createNewProblem(MethodProbIds.UndefinedMethod, 8, 0));
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test VJO Sample project, To validate false positive ")
    public void testFormDropdownAddOptions() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                VjoValidationBaseTester.VJLIB_FOLDER,
                "dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.",
                "FormDropdownAddOptions.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
