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
vjo.ctype('org.eclipse.vjet.vjo.runtime.tests.section.globals.BaseTypeA') //< public
.globals({
	G1: true,  //< boolean
	G2: 0,     //< double
	G3: function(arg1) {  //< double G3(double)
		return arg1 / 3.0 ;
	}
})
.props({
  
})
.protos({

})
.inits(function() {
	// Safe way to access G1 and G3
	var x = (G1 == true) ? 100 : 300 ;
	G2 = G3(x) ;
})
.endType();
