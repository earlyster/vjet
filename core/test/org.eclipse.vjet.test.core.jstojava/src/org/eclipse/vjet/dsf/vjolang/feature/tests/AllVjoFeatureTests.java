/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.vjolang.feature.tests;

import org.eclipse.vjet.dsf.vjolang.feature.tests.comments.VjoCommentTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	BuildControllerTests.class,
	ParsingTests.class,
	VjoSyntaxParsingTests.class,
	VjoAsJstTests.class,
	VjoCommentTest.class,
	VjoNSTests.class
})

public class AllVjoFeatureTests {

	
}
