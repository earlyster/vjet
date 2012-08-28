/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo;

import org.eclipse.vjet.dsf.jst.declaration.JstCache;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.AllAccessTesters;
import org.eclipse.vjet.dsf.jst.validation.vjo.bugs.AllBugsSyntaxTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.declare.AllDeclaredTesters;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.dowhile.AllVjoDowhileTesters;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.generic.AllGenericTesters;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.ifstatement.AllIfstatementTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.label.LabelTests;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.method.AllMethodSyntaxTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.mixin.AllMixinTypeTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.needs.AllNeedsTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.override.AllSyntaxTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.paramtypes.AllParamtypesTesters;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.typeCast.AllTypeCastTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.unique.AllUniqueSyntaxTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.array.AllArrayTesters;
import org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.compatibletypes.AllCompatibleTesters;
import org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.or.OrTypeCheckTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.returntype.AllReturnTypeTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.typeName.AllTypeNameTester;
import org.eclipse.vjet.vjo.lib.LibManager;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Temp vjo validation testers
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
@RunWith(Suite.class)
@SuiteClasses({
    
	//Added by eric 2009.10.08
	AllCompatibleTesters.class,
	AllParamtypesTesters.class,
	AllReturnTypeTester.class,
	AllArrayTesters.class,
	AllGenericTesters.class,
	AllMethodSyntaxTester.class,
	AllSyntaxTester.class,
	AllUniqueSyntaxTester.class,
	AllBugsSyntaxTester.class,
	AllNeedsTester.class,
	AllMixinTypeTester.class,
	AllIfstatementTester.class,
	AllVjoDowhileTesters.class,
	AllDeclaredTesters.class,
	AllAccessTesters.class,
	AllTypeCastTester.class,
	AllTypeNameTester.class,
	LabelTests.class,
//	DefaultJstValidationTests.class,
	OrTypeCheckTester.class
	//End added
})

public class TempVjoValidationTests {
	 @BeforeClass
     public static void beforeClass(){
//     	JstCache.getInstance().clear();
//     	LibManager.getInstance().clear();
     }
}
