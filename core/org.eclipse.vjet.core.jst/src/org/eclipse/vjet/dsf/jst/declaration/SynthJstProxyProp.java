/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jst.declaration;

import org.eclipse.vjet.dsf.jst.IJstProperty;
import org.eclipse.vjet.dsf.jst.ISynthesized;

public class SynthJstProxyProp extends JstProxyProperty implements ISynthesized {

	private static final long serialVersionUID = -4311349903150084555L;

	public SynthJstProxyProp(IJstProperty targetType) {
		super(targetType);
	}

}
