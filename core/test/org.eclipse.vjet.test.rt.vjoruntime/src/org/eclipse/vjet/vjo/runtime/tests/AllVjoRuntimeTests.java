/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.vjo.runtime.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import org.eclipse.vjet.vjo.runtime.tests.metatype.BootstrappingTests;
import org.eclipse.vjet.vjo.runtime.tests.metatype.ConstructorTests;
import org.eclipse.vjet.vjo.runtime.tests.metatype.FieldsTests;
import org.eclipse.vjet.vjo.runtime.tests.metatype.MethodsTests;
import org.eclipse.vjet.vjo.runtime.tests.metatype.NativeTypesTests;
import org.eclipse.vjet.vjo.runtime.tests.section.globals.GlobalsTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		ConstructorTests.class, MethodsTests.class, FieldsTests.class,
		NativeTypesTests.class, BootstrappingTests.class, GlobalsTests.class })
public class AllVjoRuntimeTests {

}

