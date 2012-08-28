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
vjo.ctype('syntax.generic.nested.NestedType10') //< public
.props({ 
		//>public void getM2(Object o) 
    	getM2 : function(v){
    	}
})
.protos({
	 InstanceInnerMethod:vjo.ctype() //< private InstanceInnerMethod<T>
    .protos({
    	//>public void getM2(Object o) 
    	getM2 : function(v){
    	},
    	
    	//>public void getV2() 
    	getV2 : function(){
    		var s ;//<T
    		this.vj$.NestedType10.getM2(s);
    		this.getM2(s);
    	}
     }).endType()  
})
.endType();