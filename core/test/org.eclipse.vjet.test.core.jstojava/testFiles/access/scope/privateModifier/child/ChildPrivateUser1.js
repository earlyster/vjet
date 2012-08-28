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
vjo.ctype('access.scope.privateModifier.child.ChildPrivateUser1')
.inherits('access.scope.privateModifier.PrivatePerson1')
.protos({
	
	dPerson1 : null, //< private PrivatePerson1

	// void fillData()
	fillData :function(){
		this.dPerson1 = new this.vj$.PrivatePerson1();
		 vjo.sysout.println(this.dPerson1.m_defaultDept);
		 vjo.sysout.println(this.dPerson1.m_publicSex);
		 this.dPerson1.setName("HA");
	}
})
.endType();