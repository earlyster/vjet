/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.dom;

import java.util.Iterator;
import java.util.LinkedHashMap;

import org.eclipse.vjet.dsf.common.exceptions.DsfRuntimeException;
import org.eclipse.vjet.dsf.common.node.IDsfStrategies;
import org.eclipse.vjet.dsf.common.node.visitor.IDNodeHandlingStrategy;
import org.eclipse.vjet.dsf.common.phase.PhaseId;

class DsfStrategies 
	extends LinkedHashMap<PhaseId, IDNodeHandlingStrategy> 
	implements IDsfStrategies
{
	private static final long serialVersionUID = -6232199145532374780L;

	//
	// Constructor(s)
	//
	DsfStrategies(final int initialSize) {
		super(initialSize) ;
	}
	
	//
	// API
	//
	public IDNodeHandlingStrategy put(
		final PhaseId key, final IDNodeHandlingStrategy value)
	{
		if (key == null) chuck("phaseId must not be null.") ;
		if (value == null) chuck("strategy must not be null.") ;
		return super.put(key, value) ;
	}
	
	//
	// Satisfy Iterable<T> via IDsfStrategies
	//
	public Iterator<IDNodeHandlingStrategy> iterator() {
		return this.values().iterator();
	}
	
	//
	// Private
	//
	private void chuck(final String message) {
		throw new DsfRuntimeException(message) ;
	}
}
