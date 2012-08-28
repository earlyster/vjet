/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.access.finalcheck;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * All final access testers
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */

@RunWith(Suite.class)
@SuiteClasses({
    FinalVar1Tester.class,
    FinalVar2Tester.class,
    FinalVarCorrect1Tester.class,
    FinalVarCorrect2Tester.class,
    FinalClass1Tester.class,
    FinalInnerClass1Tester.class,
    FinalMethod1Tester.class
})
public class AllAccessFianlTesters {

}
