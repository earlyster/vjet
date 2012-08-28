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
package org.eclipse.vjet.dsf.common.exceptions;

import java.io.Serializable;


/**
 * The ErrorData class is used by Exception classes to hold a message and its
 * origin.
 */
public class ErrorData implements Serializable {
	
	private String  m_origin;
	private String m_message;


	// Make the default constructor private
	// Error data cannot be constructed without associating it
	// with severity, origin and Message Data
	private ErrorData() {
		// empty on purpose
	}
	
	public ErrorData(String origin, String message) {
		m_origin = origin;
		m_message = message;
	}
	
	//
	// API
	//
	public String getOrigin() {
		return m_origin;
	}

	public void setOrigin(String origin) {
		m_origin = origin;
	}

	public String getMessage() {
		return m_message;
	}

	public void setMessage(String message) {
		m_message = message;
	}
	
	//
	// Overrides from Object
	//
	public String toString() {
		return m_origin + ":" + m_message;
	}

	private static final long serialVersionUID = -7996961604199502990L;
}


