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
vjo.itype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug490_2') //< public
.protos({
	//>public void foo()
	foo : function() {},
	
	 //>public void foo(String para1)
	foo : function(para1) {},
	
	 //>public void foo(String para1, String para2)
	foo : function(para1, para2) {},
	
	 //>public void foo(int para1, int para2)
	foo : function(para1, para2) {}
})
.endType();