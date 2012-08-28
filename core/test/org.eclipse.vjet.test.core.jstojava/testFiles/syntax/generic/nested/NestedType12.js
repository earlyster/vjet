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
vjo.ctype('syntax.generic.nested.NestedType12') //< public
.needs('syntax.generic.HashMap')
//>needs(syntax.generic.Map)
.props({
	//>private void staticMehtod1() 
	staticMehtod1 : function(){
		
	}
})
.protos({
	 InstanceInnerMethod:vjo.ctype() //< private InstanceInnerMethod<T>
    .protos({
    	//>public void getV2() 
    	getV2 : function(){
    		this.vj$.outer.successor(new this.vj$.HashMap());
    		this.vj$.NestedType12.staticMehtod1();
    	}
     }).endType(),
     
	//> private Map<String,String> successor(Map<String,String> t)
    successor:function(t){
		return null;
    }
     
})
.endType();