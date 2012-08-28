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
package org.eclipse.dltk.mod.internal.javascript.typeinference;

import java.util.Iterator;
import java.util.Set;

import org.eclipse.dltk.mod.internal.javascript.reference.resolvers.ReferenceResolverContext;

/**
 * @author jcompagner
 * 
 */
public class AutoCompleteReference extends UnknownReference {

	private final String key;
	private final ReferenceResolverContext cs;

	/**
	 * @param paramOrVarName
	 * @param cs
	 * @param childIsh
	 */
	public AutoCompleteReference(String paramOrVarName, String key,
			ReferenceResolverContext cs) {
		super(paramOrVarName, false);
		this.key = key;
		this.cs = cs;
	}

	/**
	 * @see org.eclipse.dltk.mod.internal.javascript.typeinference.UnknownReference#createChilds()
	 */
	protected void createChilds() {
		Set resolveGlobals = cs.resolveGlobals(key + ".");
		Iterator iterator = resolveGlobals.iterator();
		while (iterator.hasNext()) {
			IReference ref = (IReference) iterator.next();
			setChild(ref.getName(), ref);
		}
	}
}
