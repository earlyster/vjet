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
vjo.ctype('vjoPro.samples.basic.eventhandler.EventHandlerEx5') //< public
.needs('vjoPro.dsf.document.Element')
.protos({

/**
* @return void
* @access public
* @param {String} pDivId
* @param {int} pInitCount
*
*/
//> public constructs(String pDivId,int pInitCount)
constructs:function(pDivId,pInitCount){
this.count = pInitCount;
this.divId = pDivId;
},

/**
* @return int
* @access public
* @JsEventHandler
*
*/
//> public int onInterval()
onInterval:function(){
vjoPro.dsf.document.Element.get(this.divId).innerHTML = this.count++;
}

})
.endType();
