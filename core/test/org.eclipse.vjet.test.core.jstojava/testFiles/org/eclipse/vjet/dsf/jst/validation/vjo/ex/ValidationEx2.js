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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.ex.ValidationEx2') //< public
.inherits("org.eclipse.vjet.dsf.jst.validation.vjo.ex.ValidationEx1")
.props({
	A: "MYA", //<public static final
	
	//>public void main() 
	main : function(){
		this.A = "test"; 
	}
})
.protos({
	//>public void c() 
	c1 : function(){
		this.base.b(); 
		this.b();
	},
	
	//>public void c2() 
	c2 : function(){
		this.base.c();
		this.c();
	}
	
})
.endType();