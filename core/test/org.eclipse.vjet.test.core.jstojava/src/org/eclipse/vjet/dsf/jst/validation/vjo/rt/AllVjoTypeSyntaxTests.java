/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jst.validation.vjo.rt;

import org.eclipse.vjet.dsf.jst.declaration.JstCache;
import org.eclipse.vjet.dsf.jst.validation.vjo.rt.atype.VjoATypeTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.rt.ctype.VjoCTypeTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.rt.etype.VjoETypeTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.rt.ftype.VjoFTypeTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.rt.itype.VjoITypeTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.rt.mtype.VjoMTypeTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.rt.otype.VjoOTypeTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.VjoSyntaxTest;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
//@Ignore //till all the following test cases were moved to type space version
@SuiteClasses({
	VjoATypeTest.class,
	VjoCTypeTest.class,
	VjoMTypeTest.class,
	VjoETypeTest.class,
	VjoOTypeTest.class,
	VjoITypeTest.class,
	VjoFTypeTest.class,
	VjoSyntaxTest.class
})

public class AllVjoTypeSyntaxTests {

	@BeforeClass
	public static void setup() {
		JstCache.getInstance().clear();

	}
	
	
}
