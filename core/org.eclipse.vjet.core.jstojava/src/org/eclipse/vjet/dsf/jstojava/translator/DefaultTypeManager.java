/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
///**
// * 
// */
//package org.eclipse.vjet.dsf.jstojava.translator;
//
//import org.eclipse.vjet.dsf.jst.JstCache;
//import org.eclipse.vjet.dsf.jst.declaration.JstFactory;
//import org.eclipse.vjet.dsf.jst.declaration.JstType;
//
///**
// * 
// * 
// */
//class DefaultTypeManager implements ITypeManager {
//	private JstCache m_cache = JstCache.getInstance();
//
//	public JstType findType(String group, String name,
//			boolean searchDependentGroups) {
//		JstType type = m_cache.getType(name);
//		if (type == null) {
//			type = JstFactory.getInstance().createJstType(name, true);
//		}
//		return type;
//	}
//}
