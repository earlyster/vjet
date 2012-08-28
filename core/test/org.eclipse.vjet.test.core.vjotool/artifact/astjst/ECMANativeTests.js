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
vjo.ctype('astjst.ECMANativeTests')
.protos({
	//>public void func1() 
	func1 : function(){
		var e = eval("1+2"); //<Number
		var pi = parseInt("10"); //<<
		
		var uri = encodeURI("astjst/ECMANativeTests"); //<String
		
		var obj = new Object(); //<Object
		
		var func = new Function(); //<Function
		
		var arr = new Array(6); //<Array
		
		arr.push(1);
		
		var obj1 = obj.constructor; //<Object
		
		var str = "ABC"; //<String
		var str1 = str.charAt(1); //<String
		
		var bool = new Boolean(true); //<Boolean
		var bool1 = bool.valueOf(); //<boolean
		
		var max = Number.MAX_VALUE; //<Number
		
		var err = new Error(); //<Error
		var errNum = err.number; //<double

	}
})
.props({
})
.endType();