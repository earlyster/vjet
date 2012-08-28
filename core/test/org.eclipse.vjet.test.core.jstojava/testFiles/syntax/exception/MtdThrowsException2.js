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
vjo.ctype('syntax.exception.MtdThrowsException2')
.props({
	
})
.protos({
	//>public String foo(String) 
	foo : function(s){
		if(s == "V"){
			throw new vjo.Object();             
		}else{
			throw "";
		}  
		var v3 ;//<String
		throw this.foo1();
		throw s;
		throw 1;
		throw v3;
		throw "vv";
		throw null ;
	},
	
	//>public void foo1() 
	foo1 : function(){
		
	}
})
.endType();