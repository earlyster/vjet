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
vjo.ctype('engine.overload.ABase') //< public abstract
.props({
	
})
.protos({
	//>public void abstFunc1(int i, String s, Date d)
	//>public void abstFunc1(int i, String s)
	//>public void abstFunc1(int i)
	//>public void abstFunc1()
	abstFunc1 : vjo.NEEDS_IMPL,
	
	
	//>public void nonAbstFunc1(int i, String s, Date d)
	//>public void nonAbstFunc1(int i, String s)
	//>public void nonAbstFunc1(int i)
	//>public void nonAbstFunc1() 
	nonAbstFunc1 : function(){
		
	},
	
	//>public void foo() 
	foo : function(){
		this.nonAbstFunc1();
	}
})
.endType();