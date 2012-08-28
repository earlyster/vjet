/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.ts.event.property;

import org.eclipse.vjet.dsf.ts.event.ISourceEvent;
import org.eclipse.vjet.dsf.ts.event.ISourceEventCallback;
import org.eclipse.vjet.dsf.ts.event.ISourceEventListener;
import org.eclipse.vjet.dsf.ts.event.dispatch.IEventListenerHandle;
import org.eclipse.vjet.dsf.ts.property.PropertyName;


public final class RenamePropertyEvent extends PropertyEvent {
	
	private String m_newPtyName;

	//
	// Constructors
	//
	public RenamePropertyEvent(PropertyName oldPtyName, String newPtyName, boolean isStatic){
		super(oldPtyName, isStatic);
		assert newPtyName != null : "newPtyName cannot be null";
		m_newPtyName = newPtyName;
	}

	//
	// Satisfy IJstEvent
	//
	/**
	 * @see ISourceEvent#dispatch(ISourceEventListener)
	 */
	public void dispatch(ISourceEventListener listener){
		if (listener == null){
			return;
		}
		((IPropertyEventListener)listener).onPropertyRenamed(this);
	}
	
	/**
	 * @see ISourceEvent#dispatch(ISourceEventListener,IEventListenerHandle,ISourceEventCallback)
	 */
	public void dispatch(ISourceEventListener listener, IEventListenerHandle handle, ISourceEventCallback callback){
		if (listener == null){
			return;
		}
		((IPropertyEventListener)listener).onPropertyRenamed(this);
	}
	
	//
	// API
	//
	public String getNewPropertyName(){
		return m_newPtyName;
	}
	
	public boolean shouldLock() { return true; }
}
