/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.syntax.declare.ctype;




import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.VjoSyntaxProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.eclipse.vjet.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Before;
import org.junit.Test;




/**
 * Declared ctype correct include inits
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
//@Category( { P3, FAST, UNIT })
public class DeclaredCtypeCorrect3Tester extends VjoValidationBaseTester {

    @Before
    public void setUp(){
        expectProblems.clear();
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.RedundantImport, 2, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.RedundantImport, 2, 0));
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test declared ctype ")
    public void testCTypes() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "syntax.declare.ctype.","Employee4.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
