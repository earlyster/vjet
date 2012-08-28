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
vjo.ctype('syntax.generic.nested.NestedType15') //< public NestedType15<T>
.protos({
	 InstanceInnerType:vjo.ctype() //< private
    .protos({
    	
    	name : undefined,//<T
    	
    	name2 : undefined,//<T
    	
    	//>public T getName(T v) 
    	getName : function(v){
    		return this.name;
    	},
    	
    	//>public <T>String getCity(T ) 
    	getCity : function(v){
    		return v;
    	},
    	
    	//>public <T>String getCity1(T ) 
    	getCity1 : function(v){
    		return "";
    	},
    	
    	//>public void test1() 
    	test1 : function(){
    		this.name2 = this.getName(this.name);
    	}
    	
     }).endType()
})
.endType();