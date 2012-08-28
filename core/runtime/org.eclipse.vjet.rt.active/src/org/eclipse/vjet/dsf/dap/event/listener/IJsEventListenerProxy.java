/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.dap.event.listener;

import java.util.Map;

import org.eclipse.vjet.dsf.html.events.EventType;
import org.eclipse.vjet.dsf.html.js.IJsFunc;

/**
 * Interface for DAP event listener proxies.
 * 
 * 
 */
public interface IJsEventListenerProxy {
	
	/**
	 * Answer a map of <code>IJsFunc</code> keyed by <code>EventType</code>
	 * @return Map<EventType,IJsFunc>
	 */
	Map<EventType,IJsFunc> getProxyEventHandlers();
}
