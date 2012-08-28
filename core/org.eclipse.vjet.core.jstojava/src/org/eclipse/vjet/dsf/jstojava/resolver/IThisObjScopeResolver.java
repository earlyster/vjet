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

import java.util.Set;


/**
 * Defines resolver for 'this' object based on the scope.
 * 
 * @author paragraval
 * 
 */
public interface IThisObjScopeResolver {

	/**
	 * The groupId for which this resolver will create the types
	 * 
	 * @return
	 */
	public String[] getGroupIds();
	
	// TODO add extendType here or in extension schema? 

	/**
	 * Resolves the 'this' object from {@link IThisScopeContext}.
	 * 
	 * @param constrCtx
	 *            reference to {@link IThisScopeContext} with input expressions
	 */
	public void resolve(IThisScopeContext context);
	
}
