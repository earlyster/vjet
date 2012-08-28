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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.overriden.Child")
.inherits("org.eclipse.vjet.dsf.jst.validation.vjo.overriden.Parent")
.protos({
	
	//> public constructs()
	constructs: function(){
		this.base();
	},

	//> public void doIt()
	doIt : function () {
		alert("doIt overriden");
	},
	
	//> public void sayIt()
	sayIt: function(){
		alert("sayIt overriden");
	},
	
	//> protected void playIt()
	playIt: function(){
		alert("playIt overriden");
	}
})
.endType();