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
vjo.ctype("dsf.jslang.feature.tests.Ecma3FunExprTests")
.inherits("dsf.jslang.feature.tests.BaseTest")
.protos({

reportCompare : function  (expectedValue, actualValue, statusItems) {
new this.vj$.BaseTest().TestCase( ' ',  statusItems, expectedValue,  actualValue);
},

test_fe__001__n:function(){


//  printStatus ("Function Expression test.");

var x = function f(){return "inner";};
var result = "PASS";
try {
var y = f();
} catch(e) {
result = "FAIL"
}
this.reportCompare('FAIL', result, "Previous statement should have thrown a ReferenceError");

},

test_fe__001:function(){
if (1) function f() {return 1;}
if (0) function f() {return 0;}
this.reportCompare (1, f(), "Both functions were defined.");
},

test_fe__002:function(){
function f()
{
return "outer";
}

var x = function f(){return "inner";}();

this.reportCompare ("outer", f(),
"Inner function statement should not have been called.");

}

}).endType()


