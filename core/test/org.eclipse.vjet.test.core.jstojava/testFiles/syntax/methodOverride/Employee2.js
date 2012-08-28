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
vjo.ctype('syntax.methodOverride.Employee2')
.inherits('syntax.methodOverride.Person1')
.protos({
	m_name:undefined, //< private String

	//> public void constructs(String dept)
	constructs:function(dept) {
		this.base(dept);
	},
	
	// Declared mehtod name is different
	//> public void setName1(String name)
	setName: function(name) {
		this.base.setName(name);
		this.m_name = name;
	},
	
	//> public void setSex(String sex)
	setSex: function(sex){
		sex = "Sex is"+sex;
	},
	
	// Declared mehtod name is different
	//> public void setAddress2(String address)
	setAddress1: function(address){
		address = "address is"+address;
	}
})
.endType();