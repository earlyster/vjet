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
vjo.ctype('vjoPro.samples.basic.eventhandler.EventHandlerEx9') //< public
.props({
/**
* @return void
* @access public
* @param {String} psId
*/
//> public void bindEventsInJS(String psId)
bindEventsInJS : function(psId){
vjoPro.dsf.EventDispatcher.addEventListener(psId, 'click', function(event) { return vjoPro.samples.basic.eventhandler.EventHandlerEx9.helloWorldInJS();});
},

helloWorldInJS : function(){
alert("Hello World in JS");
return false;
}

})
.endType();
