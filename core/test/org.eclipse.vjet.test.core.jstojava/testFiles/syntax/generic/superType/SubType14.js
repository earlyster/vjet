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
vjo.ctype('syntax.generic.superType.SubType14<E>') //< public
.inherits('syntax.generic.superType.SuperType1<E>')
.props({
})
.protos({
	//>public void getName(SuperType1<E>) 
	getName : function(su){
	},
	
	//>public SuperType1<E> getCity(SuperType1<E>) 
	getCity : function(w){
		return w?new this.vj$.SuperType1():new this.vj$.SubType14();
	}
})
.endType();