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
vjo.ctype('BugJsFiles.Bug3226')
.props({
	prop1 : 10,
	prop11 : "",
	//>public Number func1(String str1, Date date) 
	func1 : function(){
		var prop1 = 20;//<Number
		
		prop1 = 50;
		this.prop1 = 50;
		this.prop1 = 90;
		var a = new this.vj$.Bug3226();//<Bug3226
		BugJsFiles.Bug3226.func1("", null);
		return prop1;
	}
})
.protos({
	//>public constructs()
	constructs : function(){
		
	}
})
.endType();