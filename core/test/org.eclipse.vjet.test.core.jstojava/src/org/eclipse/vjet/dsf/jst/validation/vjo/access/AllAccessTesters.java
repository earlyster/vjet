/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.access;

import org.eclipse.vjet.dsf.jst.validation.vjo.access.finalcheck.AllAccessFianlTesters;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.inherits.Inherits1Tester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.inherits.InheritsCorrect1Tester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.innerclass.AccessInnerCLassCorrect1Tester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.innerclass.AccessStaticInnerCLassCorrect1Tester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.innerclass.InnerClassInATypeTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.innerclass.InnerClassInCTypeTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.innerclass.InnerClassInETypeTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.innerclass.InnerClassInITypeTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.innerclass.InnerClassInMTypeTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.innerclass.InnerClassInOTypeTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.AllScopeTesters;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.scope.var.AllVarAccessTester;
import org.eclipse.vjet.dsf.jst.validation.vjo.access.staticMember.AllStaticTesters;
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
    AllStaticTesters.class,
    AllScopeTesters.class,
    AllAccessFianlTesters.class,
    
    //inner class
    AccessInnerCLassCorrect1Tester.class,
    AccessStaticInnerCLassCorrect1Tester.class,
    InnerClassInATypeTester.class,
    InnerClassInCTypeTester.class,
    InnerClassInETypeTester.class,
    InnerClassInOTypeTester.class,
    InnerClassInMTypeTester.class,
    InnerClassInITypeTester.class,
    
    //inherits class
    Inherits1Tester.class,
    InheritsCorrect1Tester.class,
    AllVarAccessTester.class
    
})
public class AllAccessTesters {

}

