/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.ts.event.type;

import org.eclipse.vjet.dsf.ts.event.ISourceEvent;
import org.eclipse.vjet.dsf.ts.event.ISourceEventCallback;
import org.eclipse.vjet.dsf.ts.event.ISourceEventListener;
import org.eclipse.vjet.dsf.ts.event.dispatch.IEventListenerHandle;
import org.eclipse.vjet.dsf.ts.type.TypeName;

public final class RemoveTypeEvent extends TypeEvent {

	//
	// Constructors
	//
	public RemoveTypeEvent(TypeName typeName){
		super(typeName);
		if (typeName == null){
			throw new AssertionError("typeName cannot be null");
		}
	}
	
	public RemoveTypeEvent(String groupName, String typeName){
		this(new TypeName(groupName, typeName));
		
	}

	//
	// Satisfy IJstEvent
	//
	/**
	 * @see ISourceEvent#dispatch(IJstEventListenerO)
	 */
	public void dispatch(ISourceEventListener listener){
		if (listener == null || !isAppropriateListener(listener)){
			return;
		}
		((ITypeEventListener)listener).onTypeRemoved(this, null, null);
	}
	
	/**
	 * @see ISourceEvent#dispatch(IJstEventListener,IEventListenerHandle,ISourceEventCallback)
	 */
	public void dispatch(ISourceEventListener listener, IEventListenerHandle handle, ISourceEventCallback callback){
		if (listener == null || !isAppropriateListener(listener)){
			return;
		}
		((ITypeEventListener)listener).onTypeRemoved(this, handle, callback);
	}
	
	public boolean shouldLock() { return true; }
}
