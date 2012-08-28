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
vjo.ctype('astjst.ECMAExpressions') //> public
.protos({

	//> public void testBitwiseOp()
	testBitwiseOp : function() {
		var num1 = 0; //< Number
		var num2 = 0; //< Number
		
		var result = 0; //< Number
		
		result = num1 & num2; 		
		result = num1 | num2;
		result = num1 ^ num2;
		
		result = ~num1;
		
		result = num1 >> 2;
		result = num1 << 4;
		result = num1 >>> 1;
	},
	
	//> public void testLogicalOp()
	testLogicalOp : function() {
		var num1 = true; //< Boolean
		var num2 = false; //< Boolean
		
		var result = false; //< Boolean
		
		result = num1 && num2; 		
		result = num1 || num2;
		
		result = !num1;
	},

	//> public void testConditionalOp()
	testConditionalOp : function() {
		var flag = true; //< Boolean
		var result = ""; //< String
		
		result = flag ? "hello" : "goodbye"
	
	}

})
.endType();