/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jst.declaration;

import org.eclipse.vjet.dsf.jst.IJstMethod;
import org.eclipse.vjet.dsf.jst.IJstProperty;
import org.eclipse.vjet.dsf.jst.IJstRefType;
import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.dsf.jst.traversal.IJstNodeVisitor;


public class JstTypeRefType extends JstProxyType implements IJstRefType {
	private static final long serialVersionUID = 1L;
	public static final String TYPE = "type::";
	public static final String TYPE_DEPRECATED = "Type::";
	
	private boolean m_fullyQualifiedRef;
	
	public JstTypeRefType(final IJstType type) {
		super(type);
	}
	
	public IJstType getReferencedNode() {
		return getType();
	}
	
	public String getSimpleName(){
		return TYPE + getType().getSimpleName();
	}
	
	public String getName(){
		return TYPE + getType().getName();
	}
	
	public void accept(IJstNodeVisitor visitor){
		visitor.visit(this);
	}
	
	/**
	 * @see IJstType#getMethod(String)
	 */
	public IJstMethod getMethod(final String name) {
		return getMethod(name, true); // only get static method
	}
	
	public IJstProperty getProperty(final String name) {
		return getProperty(name, true); // only get static property
	}

//	@Override
//	public boolean isFullyQualifiedReference() {
//		return m_fullyQualifiedRef;
//	}
//	
//	public void setFullyQualifiedReference(final boolean fullyQualifiedRef){
//		m_fullyQualifiedRef = fullyQualifiedRef;
//	}
//	
}
