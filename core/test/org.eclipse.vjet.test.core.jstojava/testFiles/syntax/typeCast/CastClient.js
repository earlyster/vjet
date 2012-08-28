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
vjo.ctype('syntax.typeCase.CastClient') //< public
.needs('syntax.typeCase.BaseCType')
.needs('syntax.typeCase.SubCType')
.props({
  
})
.protos({

s : new this, //<Number

//>public void foo() 
foo : function(){
var s1 = new this.vj$.C3();//<C2
var s2 = new this.vj$.C2();//<C3
}
})
.endType();