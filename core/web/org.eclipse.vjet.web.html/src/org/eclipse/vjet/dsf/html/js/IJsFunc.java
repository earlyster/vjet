/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.html.js;


public interface IJsFunc extends IJsContentGenerator,IHaveJsParams {
	void onClient();
	String genInvocationJs(boolean includeReturn);
	String generate(String scope);
	String getScope();
	String getName(); 
	IJsObjectRef getObj();
}
