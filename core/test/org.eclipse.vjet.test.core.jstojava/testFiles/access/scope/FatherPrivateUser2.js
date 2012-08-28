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
vjo.ctype('access.scope.FatherPrivateUser2')
.needs('access.scope.privateModifier.PrivatePerson1')
.protos({
	// void fillData()
	fillData :function(){
		var dPerson1 = new this.vj$.PrivatePerson1();//<PrivatePerson1
		 vjo.sysout.println(dPerson1.m_defaultDept);
		 vjo.sysout.println(dPerson1.m_publicSex);
		 dPerson1.setName("HA");
	}
})
.endType();