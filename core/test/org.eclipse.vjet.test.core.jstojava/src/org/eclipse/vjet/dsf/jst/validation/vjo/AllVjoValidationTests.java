/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jst.validation.vjo;

import org.eclipse.vjet.dsf.jst.declaration.JstCache;
import org.eclipse.vjet.dsf.jst.validation.bugfixes.AllVjoBugFixes;
import org.eclipse.vjet.dsf.jst.validation.vjo.vjet.dsf.AllDsfTestCases;
import org.eclipse.vjet.dsf.jst.validation.vjo.rt.AllVjoTypeSyntaxTests;
import org.eclipse.vjet.dsf.jst.validation.vjo.samples.AllVjoSamplesTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.AllSyntaxTests;
import org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.AllVjoVjLibTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.AllVjoProTestCases;
import org.eclipse.vjet.vjo.lib.LibManager;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({
	AllVjoTypeSyntaxTests.class,
	AllVjoProTestCases.class,
	AllDsfTestCases.class,
	AllVjoVjLibTester.class,
	AllVjoSamplesTest.class,
	AllVjoEarlyTests.class,
	AllVjoBugFixes.class,
	AllSyntaxTests.class
})

/**
 * All vjo validation test 
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */

public class AllVjoValidationTests{
    
    @BeforeClass
    public static void beforeClass(){
//    	JstCache.getInstance().clear();
//    	LibManager.getInstance().clear();
    }
}
