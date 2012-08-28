/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.javatojs.translate.policy;

public interface ITranslationPolicy {	
	
	public boolean isClassExcluded(Class<?> clsType);
	public boolean isClassExcluded(String clsName);
	
	public void addExcludeClass(Class<?> clsType);
	public void addExcludeClass(String clsName);
	
	public void addExcludePackage(Pkg pkg);
	public void addExcludePackage(String pkgStr);
}
