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
vjo.ctype('vjoPro.samples.otype.Sample1')
.protos({
point1 : {
x : 0,
y : 0
},

point2 : {
x : 0,
y : 10
},

line : {
start : this.point1, // what is the type of start?
end : this.point2 // what is the type of end?
},

// how to identify the parameter type of isOrigin?
isOrigin: function(p) {
return this.p.x === 0 && this.p.y === 0;
},

// how to identify what parameter type createLine accepts
// and what is the return type?
createLine : function(pt1, pt2) {
line1 = {start: {x:pt1.x, y:pt1.y}, end: {x:pt2.x, y:pt2.y}};
return line1;
}
})
.endType();
