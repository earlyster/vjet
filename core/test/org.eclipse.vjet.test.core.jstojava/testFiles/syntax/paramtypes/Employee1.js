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
vjo.ctype('syntax.paramtypes.Employee1')
.needs('syntax.paramtypes.Person')
.protos({
	m_name:undefined, //< private String

	//> private void setName(String name)
	setName: function(name) {
		this.m_name = name;
	},
	
	//> private void setSex(boolean sex)
	setSex: function(sex){
	},
	
	//> int setAddress1(int address)
	setAddress1: function(address){
		return address;
	},
	
	//> public void filldata()
	filldata: function(){
		this.setName("HA");
		this.setSex(true);
		this.setAddress1(390);
	},
	
	//> public void filldata1(Person person)
	filldata1: function(person){
		this.setName(person.getName());
		this.setSex(person.getSex());
		this.setAddress1(person.getAddress1());
	},
	
	//> public void initMetaData()
	initMetaData : function(){
		this.filldata1(new this.vj$.Person(30, "HA", true));
	}
	
})
.endType();