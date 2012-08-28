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
 * A 'this' object resolver context.
 * 
 * @author paragraval
 * 
 */
public interface IThisScopeContext {

	/**
	 * Returns the current {@link IJstType} in which 'this' is referred
	 * 
	 * @return
	 */
	public IJstType getCurrentJstType();

	/**
	 * Returns the current {@link IJstMethod} in which 'this' is referred
	 * 
	 * @return
	 */
	public IJstMethod getCurrentMethod();

	/**
	 * Returns the 'this' type based on the scope in which its called.
	 * 
	 * @return
	 */
	public IJstType getThisType();

	/**
	 * Sets the type for 'this'
	 * 
	 * @param thisType
	 */
	public void setThisType(IJstType thisType);

}
