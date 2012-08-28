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
package org.eclipse.dltk.mod.javascript.dom.support;

import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.dltk.mod.core.ISourceModule;
import org.mozilla.mod.javascript.Scriptable;

public interface IDesignTimeDOMProvider extends IExecutableExtension {

	/**
	 * 
	 * @param module
	 * @return true if this provider works for given source module
	 */
	public boolean canResolve(ISourceModule module);

	/**
	 * 
	 * @param module
	 * @return top level DOM object for given module
	 */
	public Scriptable resolveTopLevelScope(ISourceModule module);

	/**
	 * 
	 * @param module
	 * @return set of classes wich are defined for given module
	 */
	public Class[] resolveHostObjectClasses(ISourceModule module);

	/**
	 * @param resolveTopLevelScope
	 * @param allIds
	 * @return
	 */
	public Object[] resolveIds(Scriptable scope, String key);

	/**
	 * The dom provider can resolve the proposal them selfs by returning a
	 * {@link IProposalHolder}. That object can hold the parameters for this key
	 * or extra proposal info (documentation) <br>
	 * Also if you want lazy lookup then you can return the proposal with just
	 * the name. So that there isn't a lookup in the scope if that is a heavy
	 * operation.
	 * 
	 * @param scope
	 * @param key
	 * @return
	 */
	public IProposalHolder getProposal(Scriptable scope, String key);
}
