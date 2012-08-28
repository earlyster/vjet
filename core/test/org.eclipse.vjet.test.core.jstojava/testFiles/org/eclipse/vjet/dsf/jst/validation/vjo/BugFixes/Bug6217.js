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
vjo.otype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6217")
.defs({
	prp: -1, //<int
	
	Point: {
		x: 0,
		y: 0
	},
	
	fun: vjo.NEEDS_IMPL,
	
	fun2: function(){
		return false;
	},
	
	DoIt: vjo.ctype()
	.protos({
		
	}).endType()
})
.endType()
.endType();