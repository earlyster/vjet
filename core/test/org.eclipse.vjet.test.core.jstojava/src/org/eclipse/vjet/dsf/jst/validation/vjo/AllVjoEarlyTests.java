/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jst.validation.vjo;

import org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.VjoValidationBugFixMoreTests;
import org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.VjoValidationBugFixTests;
import org.eclipse.vjet.dsf.jst.validation.vjo.accessbility.VjoAccessbilityTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.arrayaccess.VjoArrayAccessTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.arraycreation.VjoArrayCreationTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.attributed.AttributedTypeAsFunctionParamTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.attributed.GlobalVarAsAttributedTypeTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.attributed.LocalVarAsAttributedTypeTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.boolexpr.VjoBoolExprTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.clz.VjoClassTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.ex.VjoExTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.globals.extension.GlobalsExtensionTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.inherits.VjoInheritsTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.jsnative.VjoJsNativeTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.jstarrayinitializer.VjoJstArrayInitializerTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.jstinitializer.VjoJstInitializerTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.mtdinvocation.VjoChainOfFunctionInvocationTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.mtdinvocation.VjoMtdInvocationTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.mtdinvocation.VjoParamTypeAsFunctionInferenceTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.mtdinvocation.VjoParamTypeAsFunctionTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.mtdinvocation.VjoReturnTypeAsFunctionTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.needs.VjoNeedsTests;
import org.eclipse.vjet.dsf.jst.validation.vjo.objcreation.VjoObjCreationTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.objliteral.VjoObjLiteralTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.overloaded.VjoOverloadedTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.overriden.VjoOverrideTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.rtnflow.VjoRtnFlowTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.global.GlobalTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.VjoTypeCheckTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.unsupported.VjoUnsupportedTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.vjNS.VjoVjNsTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.with.VjoWithTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	VjoValidationTest.class,
	GlobalTester.class,
	VjoAccessbilityTest.class,
	VjoTypeCheckTest.class,
	VjoMtdInvocationTest.class,
	VjoArrayAccessTest.class,
	VjoArrayCreationTest.class,
	VjoJstArrayInitializerTest.class,
	VjoJstInitializerTest.class,
	VjoObjCreationTest.class,
	VjoJsNativeTest.class,
	VjoVjNsTest.class,
	VjoInheritsTest.class,
	VjoWithTest.class,
	VjoOverloadedTest.class,
	VjoBoolExprTest.class,
	VjoExTest.class,
	VjoRtnFlowTest.class,
	VjoOverrideTest.class,
	VjoClassTest.class,
	VjoUnsupportedTest.class,
	VjoValidationBugFixMoreTests.class,
	VjoValidationBugFixTests.class,
	TempVjoValidationTests.class,
	LocalVarAsAttributedTypeTest.class,
	GlobalVarAsAttributedTypeTest.class,
	AttributedTypeAsFunctionParamTest.class,
	GlobalsExtensionTest.class,
	VjoChainOfFunctionInvocationTest.class,
	VjoReturnTypeAsFunctionTest.class,
	VjoParamTypeAsFunctionTest.class,
	VjoParamTypeAsFunctionInferenceTest.class,
	VjoObjLiteralTest.class,
	VjoNeedsTests.class
})


public class AllVjoEarlyTests {

}
