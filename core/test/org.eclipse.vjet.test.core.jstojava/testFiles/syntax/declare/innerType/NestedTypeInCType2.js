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
vjo.ctype('syntax.declare.innerType.NestedTypeInCType2') //< public

.props({
  
})
.protos({
	Inner1 : vjo.ctype()
	.props({
	})
	.protos({
	})
	.endType(),
	
	//>public Inner1 invoke(Inner1 inner) 
	invoke : function(inner){
	 	return inner;
	}
})
.endType();