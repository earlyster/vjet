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
vjo.ctype('vjoPro.samples.decljs.JsDoc4') //< public
.props({

/**
* @access public
* @return void
* @param {String} [arg]
* @author jearly@ebay.com
* @deprecated
* @see vjoPro.sample.XT.someOtherMethodToUse
* @since v23
*
*/
//> public void method(String? arg)
method:function(arg){
/**
* @JsArray myCarsB
* @JavaType java.lang.Enum
* @access protected
*/
var myCarsB= [];
myCarsB.cool="Mustang";
myCarsB.family="Station Wagon";
myCarsB.big="SUV";
}



})
.endType();
