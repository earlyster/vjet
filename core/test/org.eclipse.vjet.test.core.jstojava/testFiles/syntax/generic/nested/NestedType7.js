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
vjo.ctype('syntax.generic.nested.NestedType7') //< public
.props({ 
	
})
.protos({
	 InstanceInnerMethod:vjo.ctype() //< private InstanceInnerMethod<T>
    .protos({
    	//>public T getM2(T) 
    	getM2 : function(v){
    		return "";
    	}
     }).endType()  
})
.endType();