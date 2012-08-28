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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.mtdinvocation.ParamTypeAsFunctionInference')
.props({
	
	
	//> public void bar((int function(int)))
	bar: function(f){
		
	},
	
	//> public void foo(int, (int function(Date))?, boolean?)
	foo: function(i, f, b){
		
	},
	
	//> public void main()
	main: function(){
		this.bar(function(x){
			var i = x;//<int
			return i;
		});
		
		this.bar(function(s){
			var i = s;//<String
			return i;
		});
		
		this.foo(100, function(x){
			var i = x;//<Date
			return i;
		});
		
		this.foo(100, function(s){
			var i = s;//<String
			return i;
		});
		
		this.bar(function(fff){//<String function(String)
			
		});
		
		this.foo(1, function(d){//<int function(Date)
			return d.getDay();
		});
	}
	
}).endType();