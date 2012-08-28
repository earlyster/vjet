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
vjo.ctype('syntax.paramtypes.Employee4')
.protos({
	m_name:undefined, //< private String
	
	//> private void setName(String name)
	setName: function(name) {this.m_name = name;
	},
	
	//> private void setSex(boolean sex)
	setSex: function(sex){
	},
	
	//> int setAddress1(String address)
	setAddress1: function(address){
		return address;
	},
	
	//> public void filldata()
	filldata: function(){
		this.setSex("HA");
		this.setSex(true);
		this.setName("HA");
	},
	
	//> public void filldata1()
	filldata1: function(){
		this.setSex("HA");
	}
	
})
.endType();