/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.compatibletypes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({
	TypecheckCompartibleType1Tester.class,
	TypecheckCompartibleType2Tester.class,
	TypecheckCompartibleType4Tester.class,
	TypecheckCompartibleType5Tester.class,
	TypecheckCompartibleType6Tester.class,
	TypecheckCompartibleType7Tester.class,
	CorrectTypecheckTester.class,
	//enhancement by huzhou for compatibility check between 2 functions
	TypecheckCompartibleFunctionsTester.class,
	//strict comparison between object and ObjLiteral
	TypecheckObjLiteralTester.class,
	//mixed type assignments checks
	TypecheckMixedTypeTester.class
})

/**
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
public class AllCompatibleTesters {
}
