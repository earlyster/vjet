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
vjo.ctype('syntax.paramtypes.Person')
.protos({
	m_defaultDept : int, //< private int
	
	m_publicSex : boolean, //< public boolean
	
	m_publicAddress1: String, //< public String

	//> public void constructs(int dept, String address, boolean sex)
	constructs:function(dept, address, sex) {
		this.m_defaultDept = dept;
		this.m_publicSex = sex;
		this.m_publicAddress1 = address;
	},

	//>	public String getAddress1()
	getAddress1: function(){
		return this.m_publicAddress1;
	},
	
	//> public boolean getSex()
	getSex : function(){
		return this.m_publicSex;
	},
	
	//> public int getName()
	getName : function(){
		return this.m_defaultDept;
	}
	
})

.endType();