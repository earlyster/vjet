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
vjo.ctype('vjoPro.samples.server.ServerEx3') //< public
.props({
/**
* @return String
* @access public
*/
//> public String getGreeting()
getGreeting:function(){
var greeting = "Hello VJO";
return greeting;
},

/**
* @access public
* @param {String} psGreeting
*/
//> public void showGreeting(String psGreeting)
showGreeting:function(psGreeting){
alert(psGreeting);
}

})
.endType();
