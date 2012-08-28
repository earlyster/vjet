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

import org.eclipse.vjet.dsf.common.enums.BaseEnum;


/**
 * @author kquacken
 */
public class InitializationState extends BaseEnum {

	private InitializationState(int id, String name) {
		super(id, name);
	}

	public static final InitializationState PRISTINE =
		new InitializationState(0, "pristine");
	public static final InitializationState INITAILIZED = 
		new InitializationState(1, "Initialized");
	public static final InitializationState INITIALIZED_CHARACTERISTIC = 
			new InitializationState(2, "InitializedCharacteristic");
	public static final InitializationState INITAILIZED_FAILED = 
		new InitializationState(3, "InitializedWithError");
	public static final InitializationState SHUTDOWN = 
		new InitializationState(4, "shutdown");
	public static final InitializationState SHUTDOWN_FAILED = 
		new InitializationState(5, "shutdownWithError");

}
