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

/**
 * 
 * This exception class is defined for use across different projects.
 * 
 */

public class NotFoundException 
       extends BaseException
{

	public NotFoundException (String message) {
		super(message);
	}	

	public NotFoundException (String message, Throwable t) {
		super(message, t);
	}
	

}

