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
vjo.ctype('engine.overload.ChildInheritsABase') //< public
.inherits('engine.overload.ABase')
.props({
	
	//>public void main() 
	main : function(){
		var abase = new this.vj$.ChildInheritsABase(); //< ChildInheritsABase
		abase.abstFunc1();
	}
})
.protos({
	//>public void abstFunc1()
	//>public void abstFunc1(int i)
	//>public void abstFunc1(int i, String s)  
	//>public void abstFunc1(int i, String s, Date d)
	abstFunc1 : function(){
		return this.base.abstFunc1();
	}
})
.endType();