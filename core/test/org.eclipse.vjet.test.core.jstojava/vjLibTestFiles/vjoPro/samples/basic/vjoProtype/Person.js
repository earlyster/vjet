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
vjo.ctype('vjoPro.samples.basic.vjoProtype.Person') //< public
.protos({
m_name:null,
m_age:0,
/**
* @access public
* @param {String} name
*/
//> public constructs(String name)
constructs:function(name){
this.setName(name);
},
/**
* @access public
* @param {String} name
*/
//> public void setName(String name)
setName:function(name){
this.m_name=name;
},
/**
* @access public
* @return String
*/
//> public String getName()
getName:function (){
return this.m_name;
}
})
.endType();
