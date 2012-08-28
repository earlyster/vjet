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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6555Main")
.needs("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6555CType")
.props({

	main: function(){ //< public void main()
		var _6555 = new this.vj$.Bug6555CType();//<Bug6555CType
		_6555.foo();
		_6555.bar();
	}
})
.endType();