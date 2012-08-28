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
vjo.ctype('astjst.DiamondImpl') //< public
.needs(['astjst.DiamondShape', 'astjst.DiamondPurity'
        	,'astjst.DiamondBean'])
.mixin('astjst.MDiamond')
.props({
  totalDiamonds : undefined //<Number
})
.protos({
	//>public Number getTotalCash()
	gettotalCash : function(){
			return this.vj$.DiamondImpl.totalCash;
	},
	
	//>public boolean isDiamondBougth(DiamondShape shape, DiamondPurity purity)
	isDiamondBougth : function (shape, purity) {
			return this.buyDiamond(shape, purity);
	},
	
	//>public boolean isDiamondSold(int id, Number value)
	isDiamondSold : function (id, value) {
			return this.sellDiamond(id, value);
	}
})
.endType();