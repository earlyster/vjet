/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.common.trace;

import org.eclipse.vjet.dsf.DsfTraceId;
import org.eclipse.vjet.dsf.common.trace.event.TraceId;
import org.eclipse.vjet.dsf.common.trace.event.TraceType;
import org.eclipse.vjet.dsf.common.tracer.ITracer;
import org.eclipse.vjet.kernel.stage.StageListenerAdapter;
import org.eclipse.vjet.kernel.stage.StagePreExecutionEvent;

public class TraceStageListener extends StageListenerAdapter {

	public static final TraceId TRACE_ID = DsfTraceId.LIFE_CYCLE;
	private final ITracer m_tracer;
	
	public TraceStageListener(){
		m_tracer = TraceCtx.ctx().getTracer(getClass());
	}
	
	@Override
	public void beforeStage(final StagePreExecutionEvent event) {	
		m_tracer.trace(TRACE_ID, TraceType.OBJECT_TYPE, this, event.getSource());
	}
}
