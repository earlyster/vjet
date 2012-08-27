/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.javatojs.tests.data.structure.overloading;

public class OverloadingWithIType {
	public void test(IOverloadingWithIType a) {
		
	}
	public void test(OverloadingWithIType a) {
		
	}
	public void test(int a) {
		
	}
	public void test(Object a) {
		
	}

	public void test(IOverloadingWithIType a, int i) {
		
	}
	public void test(OverloadingWithIType a, int i) {
		
	}
}
