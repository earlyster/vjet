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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.ex.VallidationEx4') //< public
.satisfies('org.eclipse.vjet.dsf.jst.validation.vjo.ex.IValidation')
.props({
  //>public void main() 
  main : function(){
  	var z = new this.vj$.VallidationEx4(); 
  }
})
.protos({
	name:"",//<String	
	x: 1,
	
	x: 2,
	
	//>public void f() 
	f : function(){
	 
	},
	
	//>public void f() 
	f : function(){
	 
	},
	
	//>public void constructs(String name)
	//>public void constructs()
	constructs:function(name){
		this.name = name;
	}
	
	
	
})
.endType();