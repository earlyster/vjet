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
vjo.ctype('access.scope.thiskeyword.ProtosThis1')
.protos({
	m_publicAddress1:undefined, //< private String

	//> public void setAddress1(String address, String id)
	setAddress1: function(address, id){
		this.m_publicAddress1 = address;
		this.modAddress1(address, id);
	},
	
	//> private void modAddress1(String address, String name)
	modAddress1: function(address, name){
		var s1 = "String"; //String
		vjo.sysout.println(s1); 
	}
})
.endType();