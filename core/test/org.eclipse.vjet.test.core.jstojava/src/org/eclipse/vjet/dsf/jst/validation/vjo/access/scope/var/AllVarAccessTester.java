/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.var;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * All var access tester
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
@RunWith(Suite.class)
@SuiteClasses({
    AccessVar1Tester.class,
    AccessVar2Tester.class,
    AccessVar3Tester.class,
    AccessVarCorrect1Tester.class,
    AccessVarCorrect2Tester.class,
    VarAndArgTest.class
})
public class AllVarAccessTester {

}
