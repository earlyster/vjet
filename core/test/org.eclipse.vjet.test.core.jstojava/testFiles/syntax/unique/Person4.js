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
vjo.ctype('syntax.unique.Person4')
.protos({
	m_defaultDept:undefined, //< private String
	
	m_publicSex:undefined, //< public String
	
	m_publicAddress1:undefined, //< public String

	//> public void setName(String name)
	setName: function(name) {
		this.m_defaultDept = null;
	},
	
	//> public void setSex(String sex, String id)
	setSex: function(sex, id){
		var m_defaultDept //< String
		m_defaultDept = "30";
		this.m_publicSex = sex;
	},
	
	//> public void setAddress1(String address, String id)
	setAddress1: function(address, id){
		this.m_publicAddress1 = address;
		this.modAddress1(address, id);
	},
	
	//> private void modAddress1(String address, String name)
	modAddress1: function(address, name){
		var m_publicAddress1 = name + address;
		this.m_publicAddress1 = m_publicAddress1 + "!";
	}
	
})
.endType();