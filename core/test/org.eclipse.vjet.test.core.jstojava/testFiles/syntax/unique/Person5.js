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
vjo.ctype('syntax.unique.Person5')
.protos({
	
	m_publicAddress1:undefined, //< public String
	
	address:undefined, //< public String

	//> public void setAddress1(String address, String id)
	setAddress1: function(address, id){
		this.m_publicAddress1 = address;
		this.address = address;
	},
	
	//> public void modAddress1(String address, String name)
	modAddress1: function(address, name){
		// same field name
		var address = new Date() //< Date
		this.m_publicAddress1 = address + "!";
	},
	
	//> public void modAddress2(String address, String name)
	modAddress2: function(address, name){
		// Same field name
		var address1 = "Streat" //< String
		var address1 = new Date() //< Date
		this.m_publicAddress1 = address + "!";
	}
})
.props({
})
.endType();