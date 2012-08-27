/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
/* 
 * $Id: ValidationB7929Tester.java, Oct 21, 2009, 11:47:54 PM, liama. Exp$
 *
 * Copyright (c) 2006-2009 Ebay Technologies. All Rights Reserved.
 * This software program and documentation are copyrighted by Ebay 
 * Technologies.
 */
package org.eclipse.vjet.dsf.jst.validation.vjo.bugs;




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
//@Category( { P3, FAST, UNIT })
public class ValidationB7748Tester extends VjoValidationBaseTester {
    @Before
    public void setUp() {
        expectProblems.clear();
        expectProblems.add(createNewProblem(VjoSyntaxProbIds.RedundantImport, 3, 0));
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test redunant import")
    public void testBugfix() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem("bugs.b7748.","B7748.js", this.getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
