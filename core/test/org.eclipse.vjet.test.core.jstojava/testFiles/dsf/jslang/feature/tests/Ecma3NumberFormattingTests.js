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
vjo.ctype("dsf.jslang.feature.tests.Ecma3NumberFormattingTests")
.inherits("dsf.jslang.feature.tests.BaseTestEcma3")
.protos({

constructs: function() {
this.base();
},

test_tostring__001: function() {

//test();

//function test()
//{
var n0 = 1e23;
var n1 = 5e22;
var n2 = 1.6e24;

//printStatus ("Number formatting test.");
//printBugNumber ("11178");

this.reportCompare ("1e+23", n0.toString(), "1e23 toString()");
this.reportCompare ("5e+22", n1.toString(), "5e22 toString()");
this.reportCompare ("1.6e+24", n2.toString(), "1.6e24 toString()");

//}

}

})
.endType();




