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
vjo.ctype('syntax.generic.nested.NestedType11') //< public
.needs('syntax.generic.HashSet')
//>needs(syntax.generic.Map)
.protos({
	 InstanceInnerMethod:vjo.ctype() //< private InstanceInnerMethod<T>
  .protos({
  	//>public void getV2() 
  	getV2 : function(){
  		var set = new this.vj$.HashSet();//<HashSet<Map>
  	}
   }).endType()  
})
.endType();