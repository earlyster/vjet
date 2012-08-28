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
vjo.itype('vjoPro.dsf.common.IJsReqHandler')
.protos({
/**
* Callback function used by service engine to process a service message at
* the request phase
*
* @param {com.ebay.dsf.resource.html.event.handler.JsHandlerObjectEnum} type
*        a message object to be processed by the handler.
*/
//> public void handleRequest(Object);
handleRequest : vjo.NEEDS_IMPL
})
.endType();
