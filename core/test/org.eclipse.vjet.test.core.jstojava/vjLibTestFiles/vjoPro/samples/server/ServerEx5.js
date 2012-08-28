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
vjo.ctype('vjoPro.samples.server.ServerEx5') //< public
.props({
/**
* @access public
* @param {String} psGreeting
* @param {vjoPro.samples.server.ServerEx5JsModel} poConfig
*/
//> public void showGreeting(String psGreeting,vjoPro.samples.server.ServerEx5JsModel poConfig)
showGreeting:function(psGreeting, poConfig){
alert(psGreeting + " " + poConfig.firstName + " " + poConfig.lastName);
}

})
.endType();
