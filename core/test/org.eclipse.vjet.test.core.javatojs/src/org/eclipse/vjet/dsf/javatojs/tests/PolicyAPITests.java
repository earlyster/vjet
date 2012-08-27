/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
//package org.eclipse.vjet.dsf.javatojs.tests;
//
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//
//import java.util.HashMap;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import org.eclipse.vjet.dsf.javatojs.tests.basic.CallInnerMethods;
//import org.eclipse.vjet.dsf.javatojs.tests.operators.arithmetic.special.Scenario4;
//import org.eclipse.vjet.dsf.javatojs.translate.TranslateCtx;
//import org.eclipse.vjet.dsf.javatojs.translate.TranslateInfo;
//import org.eclipse.vjet.dsf.javatojs.translate.policy.ITranslationPolicy;
//import org.eclipse.vjet.dsf.javatojs.translate.policy.Pkg;
//import org.eclipse.vjet.dsf.jst.declaration.JstCache;
//import org.eclipse.vjet.dsf.jst.declaration.JstType;
//
//public class PolicyAPITests {
//
//	private TranslateCtx s_ctx;
//
//	@Before
//	public void setUp() {
//		s_ctx = TranslateCtx.createCtx();
//		s_ctx.enableParallel(true);
//		s_ctx.enableTrace(true);
//	}
//	
//	@Test	
//	
//	public void testPolicyAPI(){		
//		reset();
//		ITranslationPolicy policy = s_ctx.getConfig().getPolicy();
//		
//		// add class to excluded list
//		policy.addExcludeClass(PolicyAPITests.class);		
//		assertTrue(policy.isClassExcluded(PolicyAPITests.class));
//		assertTrue(policy.isClassExcluded(PolicyAPITests.class.getName()));
//		//assertFalse(policy.isPackageExcluded(PolicyAPITests.class));
//		
//		System.err.println("policy.isClassExcluded(CallInnerMethods.class)="+policy.isClassExcluded(CallInnerMethods.class));
//		
//		
//		// exclude package
//		
//		
//		assertTrue(policy.isClassExcluded(PolicyAPITests.class));
//		assertTrue(policy.isClassExcluded(PolicyAPITests.class.getName()));
//		//assertTrue(policy.isPackageExcluded(PolicyAPITests.class));
//		
//		// nested class and package
//		
//		assertFalse(policy.isClassExcluded(org.eclipse.vjet.dsf.javatojs.tests.nestedTypes.JavaToJsNestedTypesTests.class));
//		assertFalse(policy.isClassExcluded(org.eclipse.vjet.dsf.javatojs.tests.nestedTypes.anonymous.AnonymousNestedTypeTests.class));
//		
//		policy.addExcludeClass("org.eclipse.vjet.dsf.javatojs.tests.nested*");
//		assertTrue(policy.isClassExcluded(org.eclipse.vjet.dsf.javatojs.tests.nestedTypes.JavaToJsNestedTypesTests.class));
//		assertTrue(policy.isClassExcluded(org.eclipse.vjet.dsf.javatojs.tests.nestedTypes.anonymous.AnonymousNestedTypeTests.class));
//		
//		
//		//assertTrue(policy.isPackageExcluded(DynImpVar.class));
//		//assertTrue(policy.isPackageExcluded("org.eclipse.vjet.dsf.javatojs.tests.imports"));
//
//		// exclude package with exceptional class and package
//		Pkg policyModel = 
//			new Pkg("org.eclipse.vjet.dsf.javatojs.tests.operators.arithmetic.special.*")
//			.addExemptedClass(Scenario4.class);		
//		policy.addExcludePackage(policyModel);
//		
//		assertFalse(policy.isClassExcluded(Scenario4.class));		
//		//assertTrue(policy.isPackageExcluded("org.eclipse.vjet.dsf.javatojs.tests.operators.arithmetic.special"));
//		//assertTrue(policy.isPackageExcluded("org.eclipse.vjet.dsf.javatojs.tests.operators.arithmetic.special.one"));
//		assertTrue(policy.isClassExcluded("org.eclipse.vjet.dsf.javatojs.tests.operators.arithmetic.special.Scenario5"));
//		
//	}
//	
//	private void reset() {
//
//		JstCache.getInstance().clear();
//		s_ctx.setTranslateInfo(new HashMap<JstType, TranslateInfo>());
//	}
//
//	
//
//}
