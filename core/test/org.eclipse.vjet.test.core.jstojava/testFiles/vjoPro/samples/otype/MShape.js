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
vjo.mtype('vjoPro.samples.otype.MShape')
//snippet.otype.begin
.needs('vjoPro.samples.otype.Shape')
//snippet.otype.end
.props({
//snippet.otype.begin
//>public Shape.func1 isOrigin(Shape.Point)
//snippet.otype.end
isOrigin: function(point) {
return point.x === 0 && point.y === 0;
},

//snippet.otype.begin
//> public Shape.func2 createLine(Object, Object)
//snippet.otype.end
createLine : function(pt1, pt2) {
this.line1 = {start: {x:pt1.x, y:pt1.y}, end: {x:pt2.x, y:pt2.y}};
}
})
.endType();
