/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.html.schemas;

import org.eclipse.vjet.dsf.common.enums.BaseEnum;

public abstract class BaseSchemaEnum extends BaseEnum {
	protected BaseSchemaEnum(final int id, final String name) {
		super(id, name);
	}
	@Override
	public String toString() {
		return getName();
	}
}
