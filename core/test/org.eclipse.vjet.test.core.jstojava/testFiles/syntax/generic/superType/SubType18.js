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
vjo.ctype('syntax.generic.superType.SubType18<K,V>') //< public
.inherits('syntax.generic.superType.SuperType1')
.props({
})
.protos({
	//>public void test(K, V) 
	test : function(k, v){
		
	},
	
	s1 : null,//<K
	
	s2: null,//<V
	
	//>public K getName() 
	getName : function(){
		this.test(this.s1,this.s2);
		this.test("","");
		return this.s1;
	}
}) 
.endType();