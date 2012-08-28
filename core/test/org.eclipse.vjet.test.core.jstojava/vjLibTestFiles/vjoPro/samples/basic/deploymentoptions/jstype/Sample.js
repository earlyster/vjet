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
vjo.ctype('vjoPro.samples.basic.deploymentoptions.jstype.Sample') //< public
.protos({

/**
* @return void
* @access public
* @param {String} pHello
*/
//> public constructs(String pHello)
constructs:function(pHello){

alert("constructed with " + pHello);
/**
* @return void
* @access protected
*/
this.innerFuncOne = function(){
alert("innerFunctionOne");

};

/**
* @return void
* @access protected
*/
this.innerFuncTwo = function(){
alert("innerFunctiontwo");

};

x:{function(){alert("test");}},
innerFuncOne : function(){

},
/**
* @return void
* @access public
* @JsEventHandler
*/
//> public void hello()
hello : function(){
this.printArgs(arguments);
}

}).inits(
function(){
document.write("calling init from built file");
}
)
.endType();
