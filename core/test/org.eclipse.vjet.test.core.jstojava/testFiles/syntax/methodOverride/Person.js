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
vjo.ctype('syntax.methodOverride.Person')
.protos({
	m_defaultDept:undefined, //< private String
	
	m_publicSex:undefined, //< public String
	
	m_publicAddress1:undefined, //< public String

	//> public void constructs(String dept)
	constructs:function(dept) {
		this.m_defaultDept = dept;
	},

	//> public void setName(String name)
	setName: function(name) {
		//Do Nothing
	},
	
	//> public void setSex(String sex)
	setSex: function(sex){
		this.m_publicSex = sex;
	},
	
	//> public void setAddress1(String address)
	setAddress1: function(address){
		this.m_publicAddress1 = address;
	},
	
	//> private void modAddress1(String address)
	modAddress1: function(address){
		this.m_publicAddress1 = address + "!";
	}
	
})
.endType();