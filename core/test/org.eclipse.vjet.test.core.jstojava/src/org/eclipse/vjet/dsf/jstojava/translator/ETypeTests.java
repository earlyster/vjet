/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jstojava.translator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.net.URL;

import org.eclipse.vjet.dsf.jst.IScriptUnit;
import org.eclipse.vjet.dsf.jstojava.parser.VjoParser;
import org.junit.Test;

public class ETypeTests extends BaseTest{

	@Test
	public void testValues() throws Exception {
//		CompilationUnitDeclaration ast = prepareAst(
//				"etypetest1.txt", null);
		URL testFile = ETypeTests.class.getResource("etypetest1.txt");
		IScriptUnit isu = new VjoParser().parse("test", testFile);
		assertNotNull(isu);
		assertTrue(isu.getType().isEnum());
	}
	
	@Test
	public void testIncomplete() throws Exception {
//		CompilationUnitDeclaration ast = prepareAst(
//				"etypetest1.txt", null);
		URL testFile = ETypeTests.class.getResource("etypetest2.txt");
		IScriptUnit isu = new VjoParser().parse("test", testFile);
		assertNotNull(isu);
		assertTrue(isu.getType().isEnum());
	}
	
}
