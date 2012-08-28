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
package org.eclipse.vjet.dsf.common.enums;

import java.io.Serializable;
import java.util.Iterator;


/**
 * This is a base interface for all EnumHolder implementation.
 */
public interface EnumHolder extends Serializable {
	
	/**
	 * Return the iterator over all constants inside the holder.
	 */
	Iterator iterator();
	
	/**
	 * Return the number of constants inside the holder.
	 */
	int size();
	
	/**
	 * Clear all the constants from the holder.
	 */	
	void clear();

}
