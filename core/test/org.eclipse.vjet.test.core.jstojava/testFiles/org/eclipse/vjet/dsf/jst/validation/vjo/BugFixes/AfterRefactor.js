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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.AfterRefactor')
.props({
	p1: 100,//<int
	p2: [],//<String[]
	
	//>public void foo(int)
	foo: function(p){
		org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.AfterRefactor.p1 = 1000;
		var b = true;//<boolean
		b.toString();
		true.toString();
		var i = p;
		alert(i);

	}
})
.inits(function(){
	org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.AfterRefactor.p1 = 500;
})
.endType();