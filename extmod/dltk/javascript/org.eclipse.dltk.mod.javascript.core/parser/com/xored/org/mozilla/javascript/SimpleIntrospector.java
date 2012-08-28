/*******************************************************************************
 * Copyright (c) 2012 eBay Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     eBay Inc. - initial API and implementation
 *******************************************************************************/
/**
 * 
 */
package com.xored.org.mozilla.javascript;

public class SimpleIntrospector extends NativeFunction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String[] getParameterNames(NativeFunction func) {
		int paramCount = func.getParamCount();
		String[] result = new String[paramCount];
		for (int a = 0; a < paramCount; a++)
			result[a] = func.getParamOrVarName(a);
		return result;
	}

	protected int getLanguageVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	protected int getParamAndVarCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	protected int getParamCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	protected String getParamOrVarName(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.xored.org.mozilla.javascript.NativeFunction#getParamOrVarConst(int)
	 */
	protected boolean getParamOrVarConst(int index) {
		// TODO Auto-generated method stub
		return false;
	}

}