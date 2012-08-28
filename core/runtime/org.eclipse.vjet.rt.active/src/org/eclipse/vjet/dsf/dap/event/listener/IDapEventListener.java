/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.dap.event.listener;

import org.eclipse.vjet.dsf.html.events.ISimpleJsEventHandler;
import org.eclipse.vjet.dsf.html.js.IJsFunc;
import org.eclipse.vjet.dsf.jsnative.events.EventListener;

/**
 * Interface for all DAP event listeners
 * 
 * 
 */
public interface IDapEventListener extends EventListener, IJsEventListenerProxy {
	
	/**
	 * Answer the adapted event handler for element with given id.
	 * @param elemId String 
	 * @param index int 
	 * @return ISimpleJsEventHandler
	 */
	ISimpleJsEventHandler getEventHandlerAdapter(String elemId, int index);
	
	/**
	 * Answer the adapted event handler with given js function.
	 * @param func IJsFunc 
	 * @return ISimpleJsEventHandler
	 */
	ISimpleJsEventHandler getEventHandlerAdapter(IJsFunc func);
	
	/**
	 * Answer the host event handler
	 * @return IDapHostEventHandler
	 */
	IDapHostEventHandler getHostEventHandler();
}
