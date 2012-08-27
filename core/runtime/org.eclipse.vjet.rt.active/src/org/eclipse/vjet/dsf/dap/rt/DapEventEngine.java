/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.dap.rt;

import org.eclipse.vjet.dsf.active.event.IDomEventPublisher;
import org.eclipse.vjet.dsf.dap.event.listener.IDapEventListener;
import org.eclipse.vjet.dsf.html.events.EventType;
import org.eclipse.vjet.dsf.jsnative.events.Event;
import org.eclipse.vjet.dsf.jsnative.events.EventTarget;

public class DapEventEngine implements IDomEventPublisher {
	
	//
	// Singleton
	//
	private static DapEventEngine s_instance = new DapEventEngine();
	private DapEventEngine(){};
	public static DapEventEngine getInstance(){
		return s_instance;
	}
	
	//
	// Satisfy IDomEventPublisher
	//
	public boolean publish(String evtType, EventTarget src){
		return publish(src, evtType);
	}
	
	//
	// API
	//
	public Event createEvent(String eventType){
		return DapEventCreator.getInstance().createEvent(null, eventType, null);
	}
	
	public boolean publish(EventTarget src, String evt){
		if (evt == null){
			return false;
		}
		DapCtx ctx = DapCtx.ctx();
		return ctx.getEventDispatcher().dispatchEvent(DapEventCreator.getInstance().createEvent(src, evt, null));
	}
	
	public void subscribe(
			final String elemId, 
			final IDapEventListener listener) {
		DapCtx.ctx().getEventListenerRegistry().addListener(elemId, listener);
	}
	
	public void subscribe(
			final String elemId, 
			final EventType eventType,
			final IDapEventListener listener) {
		DapCtx.ctx().getEventListenerRegistry().addListener(elemId, eventType, listener);
	}
}
