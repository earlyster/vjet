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
/**
 * 
 */
package org.eclipse.vjet.dsf.jstojava.resolver;

import org.eclipse.vjet.dsf.jst.IJstMethod;
import org.eclipse.vjet.dsf.jst.IJstType;

/**
 * Default implementation of {@link IThisScopeContext}
 * 
 * @author paragraval
 * 
 */
public class ThisScopeContext implements IThisScopeContext {

	private final IJstType currentType;
	private final IJstMethod currentMethod;
	private IJstType thisType;

	/**
	 * Default constructor
	 */
	public ThisScopeContext(IJstType currentType, IJstMethod currentMethod) {
		this.currentType = currentType;
		this.currentMethod = currentMethod;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.vjet.dsf.jstojava.resolver.IThisScopeContext#getCurrentJstType
	 * ()
	 */
	@Override
	public IJstType getCurrentJstType() {
		return currentType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.vjet.dsf.jstojava.resolver.IThisScopeContext#getCurrentMethod
	 * ()
	 */
	@Override
	public IJstMethod getCurrentMethod() {
		return currentMethod;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.vjet.dsf.jstojava.resolver.IThisScopeContext#getThisType()
	 */
	@Override
	public IJstType getThisType() {
		return thisType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.vjet.dsf.jstojava.resolver.IThisScopeContext#setThisType
	 * (org.eclipse.vjet.dsf.jst.IJstType)
	 */
	@Override
	public void setThisType(IJstType thisType) {
		this.thisType = thisType;
	}

}
