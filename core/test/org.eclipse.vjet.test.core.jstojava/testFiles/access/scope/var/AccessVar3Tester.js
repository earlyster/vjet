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
vjo.ctype('access.scope.var.AccessVar3Tester')
.protos({
	m_defaultDept:undefined, //< String
	
	m_publicSex:undefined, //< String
	
	m_publicAddress1:undefined, //< String

	//> void setName(String name)
	setName: function(name) {
		var childName = "String"; //< String
		vjo.sysout.println(childName);
	},
	
	//> void setSex(String sex, String id)
	setSex: function(sex, id){
	vjo.sysout.println(childName);
	vjo.sysout.println(this.childName);
	vjo.sysout.println(this.ha);
	vjo.sysout.println(ha);
	}
	
})
.props({
	x : 10, //< int
	
	//> int getX()
	getX : function()
	{
		return this.x;
	}	
})
.endType();