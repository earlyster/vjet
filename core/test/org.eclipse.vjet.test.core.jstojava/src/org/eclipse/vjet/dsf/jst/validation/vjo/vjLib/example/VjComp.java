/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
/* 
 * $Id: VjComp.java.java, Jun 21, 2009, 12:20:41 AM, liama. Exp$:
 * Copyright (c) 2006-2009 Ebay Technologies. All Rights Reserved.
 * This software program and documentation are copyrighted by Ebay
 * Technologies.
 */
package org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.example;




import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.FieldProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.ids.TypeProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.eclipse.vjet.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Before;
import org.junit.Test;




/**
 * VjComp.java
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@Category( { P3, FAST, UNIT })
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
public class VjComp extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
        expectProblems
                .add(createNewProblem(FieldProbIds.UndefinedField, 66, 0));
        expectProblems
                .add(createNewProblem(FieldProbIds.UndefinedField, 65, 0));
        expectProblems
                .add(createNewProblem(FieldProbIds.UndefinedField, 68, 0));
        expectProblems
                .add(createNewProblem(FieldProbIds.UndefinedField, 28, 0));
        expectProblems
                .add(createNewProblem(FieldProbIds.UndefinedField, 67, 0));
        expectProblems
                .add(createNewProblem(TypeProbIds.UnusedActiveNeeds, 1, 0));
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test Vjo vj lib project, To validate false positive ")
    public void testVjComp() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                VjoValidationBaseTester.VJLIB_FOLDER, "vjoPro.example.",
                "VjComp.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
