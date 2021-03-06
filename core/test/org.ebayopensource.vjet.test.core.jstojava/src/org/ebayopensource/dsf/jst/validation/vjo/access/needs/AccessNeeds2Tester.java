/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
/* 
 * $Id: AccessNeeds1Tester.java, May 26, 2009, 7:27:28 PM, liama. Exp$
 *
 * Copyright (c) 2006-2009 Ebay Technologies. All Rights Reserved.
 * This software program and documentation are copyrighted by Ebay 
 * Technologies.
 */
package org.ebayopensource.dsf.jst.validation.vjo.access.needs;




import java.util.List;

import org.ebayopensource.dsf.jsgen.shared.ids.MethodProbIds;
import org.ebayopensource.dsf.jsgen.shared.ids.VarProbIds;
import org.ebayopensource.dsf.jsgen.shared.ids.VjoSyntaxProbIds;
import org.ebayopensource.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.ebayopensource.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Before;
import org.junit.Test;




/**
 * Access needs 1 tester
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
//@Category( { P1, FAST, UNIT })
public class AccessNeeds2Tester extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
        //bugfix by roy, correct error id
        expectProblems.add(createNewProblem(MethodProbIds.UndefinedMethod, 7, 0));
        expectProblems.add(createNewProblem(VarProbIds.UndefinedName, 10, 0));
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.TypeUnknownNotInTypeSpace, 2, 0));
    }

    @Test
    //@Category( { P1, FAST, UNIT })
    //@Description("Test access needs type, confirm undefined method")
    public void testAccesVisible1() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "access.needs.","AccessNeedsSample2.js", this
                        .getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
