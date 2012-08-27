/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.javatojs.tests.data.control.initializers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.vjet.dsf.javatojs.control.ITranslationInitializer;
import org.eclipse.vjet.dsf.javatojs.tests.data.control.InitializationTests.BaseInitializer;

public class InitializerD extends BaseInitializer implements ITranslationInitializer {
	
	public List<ITranslationInitializer> getDependents(){
		List<ITranslationInitializer> list = new ArrayList<ITranslationInitializer>();
		return list;
	}
	
	public void initialize(){
		System.out.println("D is DONE");
		m_list.add("D");
	}
}
