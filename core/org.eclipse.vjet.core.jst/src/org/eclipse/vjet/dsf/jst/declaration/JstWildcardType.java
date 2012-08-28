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
import org.eclipse.vjet.dsf.jst.traversal.IJstNodeVisitor;

public class JstWildcardType extends JstProxyType {
	
	private static final long serialVersionUID = 1L;
	
	public static final String DEFAULT_NAME = "?";
	
	private boolean m_isUpperBound = true;

	//
	// Constructor
	//
	public JstWildcardType(IJstType boundType){
		super(boundType == null ? new JstType(DEFAULT_NAME) : boundType);
	}
	
	public JstWildcardType(IJstType boundType, boolean isUpperBound){
		super(boundType == null ? new JstType(DEFAULT_NAME) : boundType);
		m_isUpperBound = isUpperBound;
	}
	
	//
	// API
	//
	public boolean isUpperBound(){
		return /*!DEFAULT_NAME.equals(this.getType().getName()) &&*/ m_isUpperBound;
	}
	
	public boolean isLowerBound(){
		return !DEFAULT_NAME.equals(this.getType().getName()) && !m_isUpperBound;
	}
	
	public void accept(IJstNodeVisitor visitor){
		visitor.visit(this);
	}
}
