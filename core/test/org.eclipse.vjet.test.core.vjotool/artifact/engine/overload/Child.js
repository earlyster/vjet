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
vjo.ctype('engine.overload.Child') //< public
.inherits('engine.overload.CBase')
.satisfies('engine.overload.IBase')
.mixin('engine.overload.MBase')
.props({
	
	//>public void main() 
	main : function(){
		var base = new this.vj$.CBase(); //< CBase
		var pubVar = base.pubCompute();
		var pubStatVar = this.pubStaticCompute();		
		
		var ichild = new this.vj$.Child(); //< Child
		ichild.func();
		
		var mchild = new this.vj$.Child(); //< Child
		mchild.mpubCompute();
	}
	
})
.protos({
	//>public String func(int i, String s, Date d)
	//>public String func(int i, String s)
	//>public String func(int i)
	//>public String func() 
	func : function(){
		return null;
	}
})
.endType();