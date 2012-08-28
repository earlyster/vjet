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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.mtdinvocation.ParamTypeAsFunction')
.props({
	foo: function(){ //< (int function(String)) foo ()
		return null;
	},
	
	//> public void bar((int function(String)))
	bar: function(f){
		var local = this.foo();//<<
		
		//good invocation and assignment
		var i = local("1");//<int
		
		//bad invocation and assignment
		var x = local(1);//<String
	},
	
	//> public void main((int function(String)))
	main: function(f){
		//good invocation and assignment
		var i = f("1");//<int
		
		//bad invocation and assignment
		var x = f(1);//<String
	}
	
}).endType();