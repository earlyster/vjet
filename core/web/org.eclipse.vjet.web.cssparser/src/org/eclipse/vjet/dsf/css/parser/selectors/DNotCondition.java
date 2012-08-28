/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.css.parser.selectors;

import java.io.Serializable;

import org.eclipse.vjet.dsf.css.sac.ICondition;
import org.eclipse.vjet.dsf.css.sac.INotCondition;

/** E:not(simpleSelector) {color:red} */
public class DNotCondition implements INotCondition, Serializable {
	private static final long serialVersionUID = 1L;
	
	private String m_selector;

	//
	// Constructor(s)
	//
	public DNotCondition(final String selector) {
		m_selector = selector;
	}

	//
	// Satisfy ICondition
	//
	public short getConditionType() {
		return ICondition.SAC_NOT_CONDITION;
	}

	//
	// Satisfy INotCondition
	//
	public String getSelector() {
		return m_selector;
	}
	
	//
	// Override(s) from Object
	//
	@Override
	public String toString() {
		return ":not(" + getSelector() + ")";
	}
}

