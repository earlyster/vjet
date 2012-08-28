/*******************************************************************************
 * Copyright (c) 2005-2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.javatojs.tests.exclude.javaonly.inheritance;

import org.eclipse.vjet.dsf.javatojs.anno.AJavaOnly;

@AJavaOnly
public class A extends B{
	B b = new B();
	public void m_m2(){
	}
}
