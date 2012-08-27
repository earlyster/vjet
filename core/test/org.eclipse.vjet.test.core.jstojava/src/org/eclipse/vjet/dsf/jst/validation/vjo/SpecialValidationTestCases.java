/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
///* 
// * $Id: SpecialValidationTestCases.java, Jun 15, 2009, 3:35:29 AM, liama. Exp$
// *
// * Copyright (c) 2006-2009 Ebay Technologies. All Rights Reserved.
// * This software program and documentation are copyrighted by Ebay 
// * Technologies.
// */
//package org.eclipse.vjet.dsf.jst.validation.vjo;
//
//import org.junit.runner.RunWith;
//import org.junit.runners.Suite;
//import org.junit.runners.Suite.SuiteClasses;
//
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.finalcheck.FinalMethod1Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.needs.AccessNeeds1Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.needs.AccessNeeds2Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.needs.AccessNeeds3Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.needs.AccessNeedsCorrect1Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.childPackage.ChildPackageAccessDefaultTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.childPackage.ChildPackageAccessPrivateTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.childPackage.ChildPackageAccessProtectedTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.childPackage.ChildPackageAccessPublicTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.fatherPackage.FatherPackageAccessDefaultTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.fatherPackage.FatherPackageAccessPrivateTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.fatherPackage.FatherPackageAccessProtectedTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.fatherPackage.FatherPackageAccessPublicTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.sameLevel.SamePackageAccessDefaultTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.sameLevel.SamePackageAccessPrivateTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.sameLevel.SamePackageAccessProtectedTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.sameLevel.SamePackageAccessPublicTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.samePackage.SameLevelPackageAccessDefaultTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.samePackage.SameLevelPackageAccessPrivateTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.samePackage.SameLevelPackageAccessProtectedTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.samePackage.SameLevelPackageAccessPublicTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.thisKeyWord.CorrectThisWord10Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.thisKeyWord.CorrectThisWord2Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.thisKeyWord.CorrectThisWord3Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.thisKeyWord.CorrectThisWord5Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.thisKeyWord.CorrectThisWord8Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.thisKeyWord.CorrectThisWord9Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.thisKeyWord.ThisWord1Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.thisKeyWord.ThisWord2Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.fatherPackage.StaticFatherAccessDefaultTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.fatherPackage.StaticFatherAccessPrivateTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.fatherPackage.StaticFatherAccessProtectedTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.fatherPackage.StaticFatherAccessPublicTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.sameLevel.StaticSLAccessDefaultTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.sameLevel.StaticSLAccessPrivateTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.sameLevel.StaticSLAccessProtectedTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.sameLevel.StaticSLAccessPublicTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.samePackage.StaticSPAccessDefaultTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.samePackage.StaticSPAccessPrivateTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.samePackage.StaticSPAccessProtectedTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.samePackage.StaticSPAccessPublicTester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.method.impl.SyntaxInterface1Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.method.impl.SyntaxInterface3Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.method.impl.SyntaxInterfaceCorrect1Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.paramtypes.Paramtype1Tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.paramtypes.ParamtypeCorrect1tester;
//import org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.array.CorrectArray2Tester;
//
///**
// * Class/Interface description
// *
// * @author <a href="mailto:liama@ebay.com">liama</a>
// * @since JDK 1.5
// */
//
//@RunWith(Suite.class)
//@SuiteClasses({
//    SyntaxInterfaceCorrect1Tester.class,
//    CorrectArray2Tester.class,
//    SyntaxInterface1Tester.class,
//    SyntaxInterface3Tester.class,
//    ParamtypeCorrect1tester.class,
//    Paramtype1Tester.class,
//    FinalMethod1Tester.class,
//    CorrectThisWord2Tester.class,
//    CorrectThisWord3Tester.class,
//    CorrectThisWord5Tester.class,
//    CorrectThisWord8Tester.class,
//    CorrectThisWord9Tester.class,
//    CorrectThisWord10Tester.class,
//    ThisWord1Tester.class,
//    ThisWord2Tester.class,
//    
//   //Access Scope
//    ChildPackageAccessDefaultTester.class,
//    ChildPackageAccessPrivateTester.class,
//    ChildPackageAccessProtectedTester.class,
//    ChildPackageAccessPublicTester.class,
//    
//    FatherPackageAccessDefaultTester.class,
//    FatherPackageAccessPrivateTester.class,
//    FatherPackageAccessProtectedTester.class,
//    FatherPackageAccessPublicTester.class,
//    
//    SamePackageAccessDefaultTester.class,
//    SamePackageAccessPrivateTester.class,
//    SamePackageAccessProtectedTester.class,
//    SamePackageAccessPublicTester.class,
//    
//    SameLevelPackageAccessDefaultTester.class,
//    SameLevelPackageAccessPrivateTester.class,
//    SameLevelPackageAccessProtectedTester.class,
//    SameLevelPackageAccessPublicTester.class,
//    
//    //Access needs
//    AccessNeeds1Tester.class,
//    AccessNeeds2Tester.class,
//    AccessNeeds3Tester.class,
//    AccessNeedsCorrect1Tester.class,
//    
//    //Access Static access
//    StaticFatherAccessDefaultTester.class,
//    StaticFatherAccessPrivateTester.class,
//    StaticFatherAccessProtectedTester.class,
//    StaticFatherAccessPublicTester.class,
//    
//    StaticSLAccessDefaultTester.class,
//    StaticSLAccessPrivateTester.class,
//    StaticSLAccessProtectedTester.class,
//    StaticSLAccessPublicTester.class,
//    
//    
//    StaticSPAccessDefaultTester.class,
//    StaticSPAccessPrivateTester.class,
//    StaticSPAccessProtectedTester.class,
//    StaticSPAccessPublicTester.class,
//    
//    CorrectValidatonTesters.class
//})
//
//public class SpecialValidationTestCases {
//
//}
