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
vjo.ctype('syntax.generic.superType.SubType33<E>') //< public
//> needs(Error) 
.inherits('syntax.generic.superType.SuperType1<E>')
.props({
	
})
.protos({
	//>public void foo(E) 
	foo : function(s){
		this.instanceMethod1(s);
	}
})
.endType();