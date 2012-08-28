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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.mtdinvocation.ReturnTypeAsFunction')
.props({
	foo: function(){ //< (int function(String)) foo()
		return function(s){
			return 0;
		};
	},
	
	main: function(){
		//good assignment and invocation
		var i = this.foo()("str");//<int
		
		//bad assignment and invocation
		var str = this.foo()(1); //<String
		
		//assign to local variable
		var f = this.foo();//<<
		
		//good assignment and invocation
		var i = f("str"); //<int
		
		//bad assignment and invocation
		var str = f(1); //<String
		
		var fn = new Function("return null;");//<<
		fn();
		
	}
}).endType();