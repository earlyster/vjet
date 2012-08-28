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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6803CType")
.satisfies("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6803IType")
.mixin("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6803MType")
.props({
	main: function(){ //<public void main()
		var sample = this.vj$.Bug6803CType();//<Bug6803CType
		sample.exists();
	}
})
.endType();