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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5346")
.props({
	ref: null,
	ref2: null,//<HTMLAnchorElement
	
	foo: function(){
		this.ref.style.left = "100px";
		this.ref2.style.left = "100px";
	}
})
.inits(function(){
	this.ref = document.getElementById("a");
	this.ref2 = document.getElementById("a");//<<HTMLAnchorElement
})
.endType();