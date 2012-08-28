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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6465")
.mixin("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6465MType1")
.mixin("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6465MType2")
.props({
	main: function(){
		this.vj$.Bug6465.foo();
		var bug6465 = new this.vj$.Bug6465();//<Bug6465
		bug6465.bar();
		
		this.vj$.Bug6465.doIt();
		bug6465.sayIt();
	}
})
.endType();