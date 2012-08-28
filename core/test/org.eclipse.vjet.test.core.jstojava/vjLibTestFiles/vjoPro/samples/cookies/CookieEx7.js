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
vjo.ctype('vjoPro.samples.cookies.CookieEx7') //< public
.needs('vjoPro.dsf.cookie.VjCookieJar')
.props({
/**
* @return boolean
* @access public
* @param {int} piDec
* @param {int} piPos
*/
//> public boolean getBitFlag(int piDec,int piPos)
getBitFlag:function(piDec, piPos){
alert(vjoPro.dsf.cookie.VjCookieJar.getBitFlag(piDec, piPos));
return false;
},

/**
* @return boolean
* @access public
* @param {int} piDec
* @param {int} piPos
* @param {int} piVal
*/
//> public boolean setBitFlag(int piDec,int piPos,int piVal)
setBitFlag:function(piDec, piPos, piVal){
alert(vjoPro.dsf.cookie.VjCookieJar.setBitFlag(piDec, piPos, piVal));
return false;
}

})
.endType();
