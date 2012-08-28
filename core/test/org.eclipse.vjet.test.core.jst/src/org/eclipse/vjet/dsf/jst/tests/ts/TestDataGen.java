/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jst.tests.ts;

import java.io.File;

import org.eclipse.vjet.dsf.javatojs.control.DefaultTranslationInitializer;
import org.eclipse.vjet.dsf.javatojs.control.TranslationController;
import org.eclipse.vjet.prebuild.JstLibBuildMain;

public class TestDataGen extends JstLibBuildMain{
	
	public TestDataGen(final String srcFolder, final String outputFolder, final String libName,
			final Class<?> filterClass) {
		super(srcFolder, outputFolder, libName, filterClass);
	}

	public static void main(String[] args) {

		
		String srcDir  = new File("src/org/eclipse/vjet/dsf/jst/tests/ts/data/").getAbsolutePath();
		String outDir  = new File("src/org/eclipse/vjet/dsf/jst/tests/ts/").getAbsolutePath();
		System.out.println("src dir = " + srcDir);
		System.out.println("out dir = " + outDir);
		String libName = "TestData";

		TestDataGen libBuildCmd = new TestDataGen(srcDir, outDir,
				libName, null);
		libBuildCmd.setJarIf(false);

		long startTime = System.currentTimeMillis();
		libBuildCmd.buildLibrary();
		long endTime = System.currentTimeMillis();

		System.out.println("Total time is " + (float) (endTime - startTime)
				/ 1000.00 + " seconds.");
	}
	
	@Override
	protected TranslationController getController() {
		TranslationController controller = super.getController();
		controller.setInitializer(new DefaultTranslationInitializer());
		return controller;
	}
}
