/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember;

import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.fatherPackage.StaticFatherAccessDefaultTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.fatherPackage.StaticFatherAccessPrivateTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.fatherPackage.StaticFatherAccessProtectedTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.fatherPackage.StaticFatherAccessPublicTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.sameLevel.StaticSLAccessDefaultTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.sameLevel.StaticSLAccessPrivateTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.sameLevel.StaticSLAccessProtectedTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.sameLevel.StaticSLAccessPublicTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.samePackage.StaticSPAccessDefaultTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.samePackage.StaticSPAccessPrivateTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.samePackage.StaticSPAccessProtectedTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.samePackage.StaticSPAccessPublicTester;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * All static member tester
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
@RunWith(Suite.class)
@SuiteClasses({
    StaticFatherAccessDefaultTester.class,
    StaticFatherAccessPrivateTester.class,
    StaticFatherAccessProtectedTester.class,
    StaticFatherAccessPublicTester.class,
    
    StaticSLAccessDefaultTester.class,
    StaticSLAccessPrivateTester.class,
    StaticSLAccessProtectedTester.class,
    StaticSLAccessPublicTester.class,
    
    StaticSPAccessDefaultTester.class,
    StaticSPAccessPrivateTester.class,
    StaticSPAccessProtectedTester.class,
    StaticSPAccessPublicTester.class
})
public class AllStaticTesters {

}
