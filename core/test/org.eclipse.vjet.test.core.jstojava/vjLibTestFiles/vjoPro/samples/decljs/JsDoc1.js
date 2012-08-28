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
vjo.ctype('vjoPro.samples.decljs.JsDoc1') //< public
.props({

/**
* @access public
* @return void
* @param {String} [arg]
*/
//> public void method(String? arg)
method:function(arg){

},

/**
* @access public
* @return void
* @param {String} harg
* @param {String} [oarg]
*/
//> public void method2(String harg,String? oarg)
method2:function(harg,oarg){

},

/**
* @access public
* @return void
* @param {String} ...
*/
//> public void method4(String... lastArg)
method4:function(lastArg){

},

/**
* @access public
* @return void
* @param {char} arg1
*/
//> public void method5(char arg1)
method5:function(arg1){

}


})
.endType();
