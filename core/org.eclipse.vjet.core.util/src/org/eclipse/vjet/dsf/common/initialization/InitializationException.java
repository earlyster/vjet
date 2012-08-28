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
package org.eclipse.vjet.dsf.common.initialization;

import org.eclipse.vjet.dsf.common.exceptions.BaseRuntimeException;

/**
 * Exception thrown if problems ocurr while an Initializable class
 * attempts to initialize itself
 * 
 * TODO: make this a checked exception???
 * 
 */

public class   InitializationException
	   extends BaseRuntimeException
{
	/**
	 * Constructor for InitializationException
	 */
	public InitializationException(Throwable th) {
		super("", th);
	}
	
	public InitializationException(String msg) {
		super(msg);
	}

	public InitializationException(String msg, Throwable th) {
		super(msg, th);
	}


}
