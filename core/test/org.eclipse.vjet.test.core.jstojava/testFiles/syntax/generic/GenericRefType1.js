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
vjo.ctype('syntax.generic.GenericRefType1<E>') //< public

.props({
  
})
.protos({
	//>public E foo(E refE) 
	foo : function(refE){
	 	return refE;
	},
	
	//>public void refFoo(int i, E ref, boolean flag) 
	refFoo : function(i, ref, flag){
	 
	}
})
.endType();