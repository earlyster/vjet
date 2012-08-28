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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6555CType")
.satisfies("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6555IType")
.protos({

	foo: function(){ //< void foo()
		alert('hello');
	},
	
	bar: function(){ //< public void bar()
		alert('hello');
	},
	
	bar2: function(){ //< void bar2()
		alert('world');
	}
})
.endType();