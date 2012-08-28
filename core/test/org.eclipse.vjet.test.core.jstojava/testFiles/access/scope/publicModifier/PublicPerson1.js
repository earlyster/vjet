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
vjo.ctype('access.scope.publicModifier.PublicPerson1')
.protos({
	m_defaultDept:undefined, //< public String
	
	m_publicSex:undefined, //< public String
	
	m_publicAddress1:undefined, //< public String

	//>public void constructs()
	constructs:function(){
	},

	//> public void setName(String name)
	setName: function(name) {
		//Do Nothing
	},
	
	//> public void setSex(String sex, String id)
	setSex: function(sex, id){
		this.m_publicSex = sex;
	},
	
	//> public void setAddress1(String address, String id)
	setAddress1: function(address, id){
		this.m_publicAddress1 = address;
	},
	
	//> public void modAddress1(String address, String name)
	modAddress1: function(address, name){
		this.m_publicAddress1 = address + "!";
	}
	
})
.props({
	x : 10, //< public int
	
	//> public int getX()
	getX : function()
	{
		return this.x;
	}	
})
.endType();