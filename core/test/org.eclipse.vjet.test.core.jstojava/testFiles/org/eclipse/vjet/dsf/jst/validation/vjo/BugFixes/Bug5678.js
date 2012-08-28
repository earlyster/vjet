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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5678")
.props({
	staticProp1: "test",//< public String
	staticProp2: "test"//< public final String
})
.protos({

	//> public constructs()
	constructs: function(){
		this.vj$.Bug5678.staticProp1 = "";
		this.vj$.Bug5678.staticProp2 = "";
	},
	
	//> public void fun()
	fun: function(){
		this.vj$.Bug5678.staticProp1 = "";
		this.vj$.Bug5678.staticProp2 = "";
	}
})
.endType();