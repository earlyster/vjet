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
vjo.ctype('syntax.generic.nested.NestedType1') //< public
.needs('syntax.generic.superType.SuperType1')
.props({
	 StaticInnerMethod:vjo.ctype() //< private StaticInnerMethod<K,V>
    .inherits('syntax.generic.superType.SuperType1')    
    .protos({
     }).endType()
})
.protos({
	
})
.endType();