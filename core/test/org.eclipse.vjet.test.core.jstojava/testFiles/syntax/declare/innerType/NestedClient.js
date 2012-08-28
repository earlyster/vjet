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
vjo.ctype('syntax.declare.innerType.NestedClient') //< public
.needs('syntax.declare.innerType.NestedType1')
.props({
  //>public void main(String... args) 
  main : function(args){
	  var staticInnerType = new this.vj$.NestedType1.StaticInnerTypeName();
	  var outerType = new this.vj$.NestedType1() ; //< NestedType1
	  var innerType = new outerType.InstanceInnerType() ; // 
  }
})
.protos({

})
.endType();