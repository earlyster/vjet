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
vjo.ctype('syntax.loseOperator.LoseOperator1')
.protos({
	m_name:undefined, //< private String

	//> private void setName(String name)
	setName: function (name) {
		this.m_name = name;
	},
	
		
	//> public void init1()
	init1 : function(){
		this.setName("HA");
	}
})
.endType();