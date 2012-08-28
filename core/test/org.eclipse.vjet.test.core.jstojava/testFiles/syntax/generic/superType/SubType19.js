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
vjo.ctype('syntax.generic.superType.SubType19<K,V>') //< public
.needs('syntax.generic.superType.SubType18')
.inherits('syntax.generic.superType.SuperType1<E>')
.props({
})
.protos({
	//>public void test(K, V) 
	test : function(ik, iv){
		var swr = new this.vj$.SubType18();//<SubType18<K,V>;
		swr.test(this.s1,this.s2);
	},
	
	s1 : null,//<K
	
	s2: null,//<V
	
	//>public K getName() 
	getName : function(){
		this.test(this.s1,this.s2);
		return this.s1;
	}
}) 
.endType();