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
vjo.otype('astjst.OTest') //< public
.defs({
	Point: {
		x: undefined, //< int
		y: undefined //< int
	},
	
	Line: {
		start: undefined, //< Point
		end:   undefined //< Point
	},

	//> public boolean isOrigin(Point pt)
	isOrigin: vjo.NEEDS_IMPL, 
	
	//> public void createLine(Point pt1, Point pt2)
	createLine: vjo.NEEDS_IMPL

})
.endType();