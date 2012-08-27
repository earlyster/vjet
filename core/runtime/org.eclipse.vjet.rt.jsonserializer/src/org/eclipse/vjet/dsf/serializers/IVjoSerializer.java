/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.serializers;

import org.eclipse.vjet.dsf.json.serializer.SerializationException;

public interface IVjoSerializer {
	/**
	 * null json result
	 */
	String NULL = "null";
	
	
	/**
	 * detects if the current serializer could handle the object based on the object's type etc.
	 * @param obj
	 * @return
	 */
	boolean canSerialize(Object obj);
	
	/**
	 * @param obj
	 * @return
	 * @see VjoAbstractSerializer
	 * @see VjoSerializer
	 */
	Object serialize(Object obj) throws SerializationException;
}
