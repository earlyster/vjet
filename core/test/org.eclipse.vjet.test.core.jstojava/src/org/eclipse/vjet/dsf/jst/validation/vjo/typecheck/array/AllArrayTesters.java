/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.array;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({
    CorrectArray1Tester.class,
    CorrectArray2Tester.class,
    CorrectArray3Tester.class,
    CorrectArray4Tester.class,
    ArrayType1Tester.class,
    ArrayType2Tester.class,
    ArrayType3Tester.class,
    ArrayCorrectIDType1Tester.class,
    ArrayIDType1Tester.class,
    MulArray1Tester.class,
    MulArray2Tester.class,
    MulArray3Tester.class
})

/**
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
public class AllArrayTesters {
}
