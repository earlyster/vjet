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
vjo.ctype('syntax.declare.innerType.Anonymous2')
.props({
	
	s2 : "VSF" //< public String
})
.protos({
	
	s1 : "DDSF",//<public String

	//>public void foo() 
	foo : function(){
		 var anon = vjo.make( this.vj$.Anonymous2, 'AnonymousType') // vjo.make()
		 .protos({
		 getAnonTypeProp : function () {
			 this.s1 = "VV";
		 },
		 getSourceTypeProp : function () {
		 this.vj$.Anonymous2.s2 = "SF";
		 }
		 })
		 .props({
			 //>public void anonStaticMethod() 
			 anonStaticMethod : function(){
			 }
		 })
		 .endType();
		 anon.getAnonTypeProp();
		 anon.getSourceTypeProp();
	}
})
.endType();