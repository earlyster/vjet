/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.javatojs.translate.custom.dap;

import org.eclipse.vjet.dsf.javatojs.translate.custom.meta.MetaDrivenCustomTranslator;

public class DapCustomTranslator extends MetaDrivenCustomTranslator {
	
	//
	// Constructor
	//
	/**
	 * Constructor.
	 * @param customTypeMetaProvider ICustomTypeMetaProvider required
	 */
	public DapCustomTranslator(){
		super(DapMeta.getInstance());
	}
}
