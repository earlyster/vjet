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
vjo.ctype("vjoPro.dsf.service.DefaultDedupComparable")
.needs("vjoPro.dsf.common.IDedupComparable")
.satisfies("vjoPro.dsf.common.IDedupComparable")
.protos({

//> public void constructs();
constructs : function () {
},
//> public boolean shouldTrack(Object);
shouldTrack : function (pMessage) {
return true;
},

//> public boolean isDedup(Object,Object);
isDedup : function (pCurrentMessage, pMessage) {
var currentServiceId = pCurrentMessage.svcId;
var serviceId = pMessage.svcId;
if (currentServiceId === serviceId)
return true;
else
return false;
}
})
.endType();
