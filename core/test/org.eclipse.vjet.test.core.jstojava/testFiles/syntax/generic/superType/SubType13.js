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
vjo.ctype('syntax.generic.superType.SubType13<E>') //< public
.inherits('syntax.generic.superType.SuperType1<E>')
.props({
})
.protos({
	//>public constructs()
	constructs : function(){
		this.base();
	},
	
	 //>public void test() 
	 test : function(){
		 this.getCity(new Object());
	 },
	 
	 //>public SuperType1 getCity(SuperType1<? extends SuperType1>) 
	 getCity : function(a){
		 return null;
	 }
})
.endType();