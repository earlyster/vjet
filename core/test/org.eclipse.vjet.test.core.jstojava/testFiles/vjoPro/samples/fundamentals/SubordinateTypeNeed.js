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
vjo.ctype("vjoPro.samples.fundamentals.SubordinateTypeNeed")
.protos({
//> public void print(int copies, boolean color)
print: function(copies, color) {
alert("print called with " + copies + " copies and color="+color);
},

//> public void getPrint()
getPrint: function() {
this.print(2, true);
},

//> void doPrint(boolean color)
doPrint: function(color) {
alert("doPrint called with color=" + color);
//invoke the method being received as parameter
this.print(4, color);
}
})
.props({
//> void showMessage(String msg)
showMessage: function(msg) {
alert(msg);
}

})
.endType();
