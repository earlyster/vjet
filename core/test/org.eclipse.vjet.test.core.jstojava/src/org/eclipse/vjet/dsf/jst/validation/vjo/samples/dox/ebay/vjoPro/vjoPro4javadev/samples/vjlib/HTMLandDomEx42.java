/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
/* 
 * $Id: HTMLandDomEx42.java.java, July 27, 2009, 12:20:41 AM, liama. Exp$:
 * Copyright (c) 2006-2009 Ebay Technologies. All Rights Reserved.
 * This software program and documentation are copyrighted by Ebay
 * Technologies.
 */
package org.ebayopensource.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib;




import java.util.List;

import org.ebayopensource.dsf.jsgen.shared.ids.FieldProbIds;
import org.ebayopensource.dsf.jsgen.shared.ids.MethodProbIds;
import org.ebayopensource.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.ebayopensource.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Before;
import org.junit.Test;




/**
 * HTMLandDomEx42.java
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@Category( { P3, FAST, UNIT })
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
public class HTMLandDomEx42 extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
        expectProblems
                .add(createNewProblem(FieldProbIds.UndefinedField, 17, 0));
        expectProblems.add(createNewProblem(MethodProbIds.ShouldReturnValue,
                13, 0));
        expectProblems
                .add(createNewProblem(FieldProbIds.UndefinedField, 22, 0));
        expectProblems.add(createNewProblem(MethodProbIds.UndefinedMethod, 16,
                0));
        expectProblems.add(createNewProblem(
                MethodProbIds.WrongNumberOfArguments, 19, 0));
        expectProblems
                .add(createNewProblem(FieldProbIds.UndefinedField, 21, 0));
        expectProblems
                .add(createNewProblem(FieldProbIds.UndefinedField, 16, 0));
        expectProblems.add(createNewProblem(FieldProbIds.UndefinedField, 9, 0));
        expectProblems
                .add(createNewProblem(FieldProbIds.UndefinedField, 18, 0));
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test VJO Sample project, To validate false positive ")
    public void testHTMLandDomEx42() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                VjoValidationBaseTester.VJLIB_FOLDER,
                "dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.",
                "HTMLandDomEx42.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
}