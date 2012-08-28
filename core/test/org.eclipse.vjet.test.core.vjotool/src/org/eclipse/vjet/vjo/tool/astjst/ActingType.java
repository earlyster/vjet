/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.vjo.tool.astjst;

import org.eclipse.vjet.vjo.tool.astjst.TypeConstants.Types;

public class ActingType {
	public String name;
	public Types type;
	public ActingType(String name, Types type) {
		this.name = name;
		this.type = type;
	}
}
