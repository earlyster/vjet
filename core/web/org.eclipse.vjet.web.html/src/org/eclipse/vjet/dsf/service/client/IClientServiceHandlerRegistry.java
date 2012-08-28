/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.service.client;

import java.util.Map;

import org.eclipse.vjet.dsf.html.js.IJsContentGenerator;
import org.eclipse.vjet.dsf.service.IServiceSpec;
import org.eclipse.vjet.dsf.service.ServiceConfig;

public interface IClientServiceHandlerRegistry {

	void registerSvcReqHandler(final IServiceSpec svcSpec);
	void registerSvcReqHandler(final IServiceSpec svcSpec, final String opName);
	void registerSvcRespHandler(final String svcId, final IJsContentGenerator func);
	void registerSvcRespHandler(final String svcId, final IJsContentGenerator callback, final IJsContentGenerator errorHandler);
	
	Map<String,ServiceConfig> getServiceConfigs();
	ServiceConfig getServiceConfig(String svcName);
}
