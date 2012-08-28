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
vjo.ctype("dox.ebay.vjoPro.vjoPro4javadev.samples.Person")
//snippet.vjoProtype.end
.protos({
m_name:null,
m_age:0,
/**
* @access public
* @param {String} name
*/
constructs:function(name){
this.setName(name);
},
/**
* @access public
* @param {String} name
*/
setName:function(name){
this.m_name=name;
},
/**
* @access public
* @return String
*/
getName:function (){
return this.m_name;
}
})
.endType();
//snippet.vjoProprotos.end
