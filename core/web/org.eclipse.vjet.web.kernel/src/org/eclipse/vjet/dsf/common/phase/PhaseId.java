/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.common.phase;

import org.eclipse.vjet.dsf.common.Id;

public class PhaseId extends Id {
	
	private static final long serialVersionUID = 1L;

	/**
	 * This id means that any handler matches it.
	 */
	public static final PhaseId ANY_PHASE = new PhaseId(0, "ANY_PHASE");
	
	public static final PhaseId TERMINAL = new PhaseId(Integer.MAX_VALUE, "TERMINAL");
	
	//
	// Constructor(s)
	//
	public PhaseId() {
		super() ;
	}
	
	public PhaseId(final String name) {
		super(name);
	}
	
	public PhaseId(final int id, final String name) {
		super(id, name);
	}
	
	public PhaseId(final int id, final String name, final boolean register) {
		super(id, name, register) ;
	}
}
