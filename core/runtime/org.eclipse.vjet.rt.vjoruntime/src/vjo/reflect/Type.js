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
vjo.ctype('vjo.reflect.Type')
.protos({
	m_name : undefined, //< String 
	m_modifiers : undefined, //< int

	//> public constructs(String name, int modifiers)
	constructs : function (name, 
		modifiers) {
		
		this.m_name = name;
		this.m_modifiers = modifiers;
	},

	//>public String getName() 
	getName : function () {
		return this.m_name;
	},
	
	//> public int getModifiers()
	getModifiers : function () {
		return this.m_modifiers;
	}

})
.endType();