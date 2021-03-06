/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
/* 
 * $Id: Ecma2extensionsTests.java.java, Jun 21, 2009, 12:20:41 AM, liama. Exp$:
 * Copyright (c) 2006-2009 Ebay Technologies. All Rights Reserved.
 * This software program and documentation are copyrighted by Ebay
 * Technologies.
 */
package org.ebayopensource.vjet.test.core.ecma.jst.validation;




import java.util.List;

import org.ebayopensource.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;




/**
 * Ecma2extensionsTests.java
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@Category( { P3, FAST, UNIT })
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
public class Ecma2extensionsTests extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
    }

    @Test
    @Ignore("Line 105. Functino's name" + "function's property")
    //@Category( { P3, FAST, UNIT })
    //@Description("Test DSF project, To validate false positive ")
    public void testEcma2extensionsTests() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "dsf.jslang.feature.tests.", "Ecma2extensionsTests.js", this
                        .getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
