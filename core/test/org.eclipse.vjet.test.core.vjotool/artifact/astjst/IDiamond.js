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
vjo.itype('astjst.IDiamond') //< public
.needs(['astjst.DiamondShape', 'astjst.DiamondPurity'])
.props({
  vendor : "blueniles",//<String
  site : "ebay" //<String
})
.protos({
	//>public boolean buyDiamond(DiamondShape shape, DiamondPurity purity) 
	buyDiamond : vjo.NEEDS_IMPL,
	//>public boolean sellDiamond(int diamondId, Number diamondValue)
	sellDiamond : vjo.NEEDS_IMPL
})
.inits(function(){
//	this.vendor = "blueniles";
//	this.site = "ebay";
	
})
.endType();