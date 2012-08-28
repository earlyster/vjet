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
vjo.ctype('astjst.JstTest1') //< public
.props({
	main : function(args){ //<public void main(String... args)
        var obj = new this();
    }
})
.protos({
	//>public void func1() 
	func1 : function(){
		var doc = document.URL;//<String
		doc = doc.toLocalString();
		Object obj = eval("Test");
	},
	
	//>public void func() 
	func : function(){
		vjo.sysout.print("Hi");
		vjo.sysout.println("Hi");
		vjo.syserr.print("Hi");
		vjo.syserr.println("Hi");
		var arr = new Array(2,3,"hi");//<Array
		var i = 0;//<int
		for (i in arr){
			vjo.sysout.print("Hi");
			vjo.sysout.println("Hi");
			vjo.syserr.print("Hi");
			vjo.syserr.println("Hi");
			var obj = new this();
		}
	}
}).endType();