/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.syntax.generic;





import java.util.List;

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
public class GenericImplTester extends VjoValidationBaseTester {
    @Before
    public void setUp() {
        expectProblems.clear();
    }

    @Test
    //@Category( { P1, FAST, UNIT })
    //@Description("Test parameter as generic")
    public void testImpl1() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "syntax.generic.satisfies.", "Implement1.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
    
    @Test
    //@Category( { P1, FAST, UNIT })
    //@Description("Test parameter as generic")
    public void testImpl2() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "syntax.generic.satisfies.", "Implement2.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
    
    @Test
    //@Category( { P1, FAST, UNIT })
    //@Description("Test parameter as generic")
    public void testImpl3() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "syntax.generic.satisfies.", "Implement3.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
    
    @Test
    //@Category( { P1, FAST, UNIT })
    //@Description("Test parameter as generic")
    public void testImpl4() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "syntax.generic.satisfies.", "Implement4.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
    
    @Test
    //@Category( { P1, FAST, UNIT })
    //@Description("Test parameter as generic")
    public void testImpl5() {
        expectProblems.clear();
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "syntax.generic.satisfies.", "Implement5.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
    
}
