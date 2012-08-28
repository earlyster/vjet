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

import java.util.List;

public interface GenericException {
	public String getMessage() ;
	
	// get the nested exception
	public Throwable getCause();

	// get the Error data
	public ErrorData getErrorData();

	// gets the Error stack by going through the chain.
	// returns a Collection of ErrorData objects.
	public List getErrorDataStack();
	
}

