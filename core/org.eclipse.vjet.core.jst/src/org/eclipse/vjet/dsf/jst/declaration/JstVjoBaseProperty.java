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
import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.dsf.jst.term.JstIdentifier;

public class JstVjoBaseProperty extends JstSynthesizedProperty {
	
	private static final long serialVersionUID = 1L;
	private IJstType m_ownerType;

	public JstVjoBaseProperty(final String name, final IJstType ownerType) {
		super(null, name, (JstIdentifier)null, new JstModifiers());
		m_ownerType = ownerType;
	}

	/**
	 * @see IJstProperty#getType()
	 */
	public IJstType getType() {
		return m_ownerType.getExtend();
	}
}
