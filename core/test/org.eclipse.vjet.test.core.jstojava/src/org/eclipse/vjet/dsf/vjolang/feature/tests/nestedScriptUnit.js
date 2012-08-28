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
vjo.ctype("org.eclipse.vjet.dsf.vjolang.feature.tests.nestedScriptUnit")
.props({
StaticInnerType : vjo.ctype()
.protos({
	innerFunc: function() {
	vjo.sysout.println('StaticInnerType function called');
		this.vj$.OuterType.outerFunc(); // Fully qualified reference to the outer type class function
	}
	})
	.endType(),
	outerFunc : function() {
		vjo.sysout.println('OuterType function called');
	},
	 makeAnonType : function () {
		var anon = vjo.make(this, this.vj$.SourceType, 'Anonymous Type Property') // vjo.make()
		.protos({
		getAnonTypeProp : function () {
		vjo.sysout.println(this.getProp()); // get the Anonymous Type property
		},
		getSourceTypeProp : function () {
		vjo.sysout.println(this.vj$.parent.getProp()); // get the Outer Type property
		}
		})
		.endType();
		anon.getAnonTypeProp();
		anon.getSourceTypeProp();
}
})
.endType();