/*******************************************************************************
 * Copyright (c) 2005-2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.javatojs.tests.exclude.anno.derivedclz;

import org.eclipse.vjet.dsf.javatojs.anno.AJavaOnly;
import org.eclipse.vjet.dsf.javatojs.tests.exclude.TestTranslator;
/*
 * Type Error is thrown by Class as when accessing static setFlag() method
 * 
 */
@AJavaOnly
public class Translator{

	public static void main(String[] args) {			
		new TestTranslator().translate(TestClass.class).printErrors();	
		}	

}
