/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.dap.cnr;

import org.eclipse.vjet.dsf.active.event.IDomChangeListener;
import org.eclipse.vjet.dsf.dap.rt.DapView;
import org.eclipse.vjet.dsf.dap.rt.IDapHttpClient.IDapHttpListener;
import org.eclipse.vjet.dsf.liveconnect.IDLCDispatcherInfoCollector;
import org.eclipse.vjet.dsf.liveconnect.client.DLCEvent;

public interface IDapCapture extends 
	IDomChangeListener, 
	IDLCDispatcherInfoCollector,
	IDapHttpListener {
	
	void receiveEvent(DLCEvent event);
	void receiveTask(String msg);
	
	void beginView(DapView view);
	void endView();

	void start(String name);
	void pause();
	void resume();
	void stop();
	
	void addEventFilter(IEventFilter filter);
	void addTargetFilter(ITargetFilter filter);
	
	DapCaptureData getCapturedData();
	
	CaptureState state();

	String currentCaptureName();
	
	enum CaptureState {
		off,
		started,
		paused,
		resumed,
		stoped
	}
}
