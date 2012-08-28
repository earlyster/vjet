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
package org.eclipse.dltk.mod.javascript.core.dom.support.sample;

import org.mozilla.mod.javascript.ScriptableObject;

public class OtherHost extends ScriptableObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void jsFunction_GoodBuy() {
		System.out.println("Good buy");
	}

	public String jsGet_property0() {
		return "Property";
	}

	public String getClassName() {
		return "OtherHost";
	}
}
