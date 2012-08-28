/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.syntax.label;




import java.util.ArrayList;
import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.VarProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.ids.VjoSyntaxProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.eclipse.vjet.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Test;




/**
 * For vjo init block
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
//@Category( { P1, FAST, UNIT })
public class LabelTests extends VjoValidationBaseTester {

    @Test
    //@Category( { P1, FAST, UNIT })
    //@Description("Test pulicate label in while statments")
    public void testDuplicateLabels() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "syntax.label.", "DuplicateLabel.js", this.getClass());
        
        final List<VjoSemanticProblem> expectedProblems = new ArrayList<VjoSemanticProblem>(1);
        expectedProblems.add(createNewProblem(VarProbIds.LocalVariableHidingLocalVariable, 10, 0));
        
        assertProblemEquals(expectedProblems, problems);
    }
    
    @Test
    //@Category( { P1, FAST, UNIT })
    //@Description("Test no exist label situation")
    public void testNoneExistLabels() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "syntax.label.", "NoneExistLabel.js", this.getClass());
        
        final List<VjoSemanticProblem> expectedProblems = new ArrayList<VjoSemanticProblem>(2);
        expectedProblems.add(createNewProblem(VjoSyntaxProbIds.BreakNoneExistLabel, 20, 0));
        expectedProblems.add(createNewProblem(VjoSyntaxProbIds.ContinueNoneExistLabel, 36, 0));
        
        assertProblemEquals(expectedProblems, problems);
    }
}
