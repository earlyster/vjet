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
vjo.etype('a.E') //< public
.values('Foo, Bar, Zot' 
)
.props({
	main: function(args) { //< public void main(String[])
		var o = vjo.sysout.println ;
		o(this.F) ;
		o(this.B) ;
		o(this.
    },
	F: undefined, //< E
	B: undefined, //< E
	Z: undefined  //< E
})
.inits(function() {
	this.F = this.Foo ;
	this.B = this.Bar ;
	this.Z = this.Zot ;
})
.endType();
