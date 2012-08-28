/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jst.declaration;

import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.dsf.jst.ISynthesized;
import org.eclipse.vjet.dsf.jst.term.JstIdentifier;

public class JstSynthesizedProperty extends JstProperty implements ISynthesized{
	private static final long serialVersionUID = 1L;
	
	public JstSynthesizedProperty(final IJstType type, final String name, JstIdentifier identifier, JstModifiers modifier) {
		super(type, name, identifier, (modifier==null)?new JstModifiers():modifier);
	}
	
}
