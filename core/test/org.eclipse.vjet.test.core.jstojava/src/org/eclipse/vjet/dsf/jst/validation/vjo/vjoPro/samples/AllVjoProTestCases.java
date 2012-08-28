/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples;

import org.eclipse.vjet.dsf.jst.declaration.JstCache;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * All vjo program vjo sample test cases
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */

@RunWith(Suite.class)
@SuiteClasses({
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.anon.AnonExample1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.anon.AnonExample2.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.anon.Util.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.enums.eTypeDefStyle1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.enums.eTypeDefStyle1Client.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.enums.eTypeDefStyle2.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.enums.eTypeDefStyle2Client.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.enums.eTypeSample.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.foundations.CommentDeclarationSample.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.foundations.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.foundations.HelloWorld.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.foundations.InheritanceTest.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.foundations.Manager.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.etc.MyTest.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.A.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.AbstractCTypeClient.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.AbstractCTypeExample.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.AbstractExample1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.B.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.CodeSnippetConstructors1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.CodeSnippetNeeds1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.CTypeExample.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.CTypeExample1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.CTypeExampleClient.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.CTypeSample1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.CTypeSample3.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.HelloWorld.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.HelloWorldClient.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.IBase.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.IEmployer.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ImplementationTest.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.InheritanceSample.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.InstanceInner.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.InterfaceWithSubType.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ITypeExample.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ITypeInstanceMembers1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ITypeMethodsExamples1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ITypeStaticMembers1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ITypeStaticSample.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.NeedsSample1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.NeedsSample2.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.NeedsSample3.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.NeedsSample4.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.NeedsSample5.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.NeedsSample6.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.NestedTypesInCType.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.OverloadedConstructor.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.OverloadedConstructorTest1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.OverloadedConstructorTest2.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.OverloadedConstructorTest3.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.SatisfiesExample.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.StaticInner.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.SubordinateTypeNeed.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.SubordinateTypeUsages1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ThisKeywordSample1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ThisKeywordSample10.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ThisKeywordSample2.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ThisKeywordSample3.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ThisKeywordSample4.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ThisKeywordSample5.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ThisKeywordSample6.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ThisKeywordSample7.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ThisKeywordSample8.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.ThisKeywordSample9.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.VjOAbstractClass.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.VjOClass.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.VjOInterface.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.fundamentals.VjOStaticSample.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.js.Developer.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.js.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.js.Manager.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.generics.GenericsExample1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.mtype.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.mtype.Employee1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.mtype.Employee2.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.mtype.Employee3.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.mtype.Employee4.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.mtype.Employee5.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.mtype.Employee6.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.mtype.Employer.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.mtype.Person1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.mtype.Person2.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.mtype.Person3.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.mtype.Person4.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.mtype.Person6.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.otype.ConstructShape.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.otype.MShape.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.otype.Sample1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample1.base.Person.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample1.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample1.Employer.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample10.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample11.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample12.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample12.Person.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample14.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample15.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample2.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample3.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample4.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample4.Person.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample5.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample6.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample6.Employer.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample7.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample8.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.sample9.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjoPro.samples.EqualsSample1.class


})
public class AllVjoProTestCases {
    @BeforeClass
    public static void beforeClass(){
    	JstCache.getInstance().clear();
    }
}
