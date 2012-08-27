/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf;

import java.io.File;
import java.net.URL;

import org.eclipse.vjet.dsf.ast.recovery.RecoveryTests;
import org.eclipse.vjet.dsf.cml.vjetv.AllHeadLessTests;
import org.eclipse.vjet.dsf.comment.parser.BootstrapCommentTest;
import org.eclipse.vjet.dsf.comment.parser.VjCommentParserTest;
import org.eclipse.vjet.dsf.jst.validation.vjo.AllVjoValidationTests;
import org.eclipse.vjet.dsf.jstdoc.AllJsDocTests;
import org.eclipse.vjet.dsf.jstojava.codegen.CodeGenJsrDiff;
import org.eclipse.vjet.dsf.jstojava.translator.AllTranslatorsTests;
import org.eclipse.vjet.dsf.tests.jsast.parser.AllJs2JstTests;
import org.eclipse.vjet.dsf.tests.jsast.parser.AllJsParsingTests;
import org.eclipse.vjet.dsf.vjolang.feature.tests.AllVjoFeatureTests;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	AllTranslatorsTests.class,
	AllJs2JstTests.class,
	CodeGenJsrDiff.class,
//	AllEcmaLangTests.class,
//	JsLangParsingTests.class,
	AllJsParsingTests.class,
	AllVjoFeatureTests.class,
	RecoveryTests.class,
    AllVjoValidationTests.class,
    BootstrapCommentTest.class,
    VjCommentParserTest.class,
    AllHeadLessTests.class,
    AllJsDocTests.class
//    JsResourceOptimizationTests.class
})
public class AllJsToJavaTests {
	@BeforeClass
	public static void appendSourcePath(){
		URL u2 = AllJsToJavaTests.class.getClassLoader().getResource(
				AllJsToJavaTests.class.getName().replace('.', '/')+".class");
		if(u2.getFile().contains(".jar")){
			String path = u2.getFile();
			if (path.startsWith("file:/")){
				path = path.substring("file:/".length());
			}
			String jarPath = path.substring(0, path.indexOf(".jar")+".jar".length());
			System.setProperty("java.source.path", System.getProperty("java.source.path")+File.pathSeparator+jarPath);
		}
	}
}
