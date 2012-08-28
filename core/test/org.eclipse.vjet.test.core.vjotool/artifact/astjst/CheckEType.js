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
vjo.etype('astjst.CheckEType') //< public
.satisfies('astjst.IDiamond')
.needs('astjst.DiamondShape','astjst.DiamondPurity')
.values('Start, Middle, End')
.protos({
	//>public boolean sellDiamond(int diamondId, Number diamondValue)
	sellDiamond : function(diamondId, diamondValue){
		return null;
	},
	
	//>public boolean buyDiamond(DiamondShape shape, DiamondPurity purity)
	buyDiamond : function(shape, purity){
		var x = this.vj$.CheckEType.Start;//<CheckEType
	    var y = this.vj$.CheckEType.Middle;//<CheckEType
		return null;
	}
})
.props({
	//>public void main(String args)
	main: function(args) {
        var out = vjo.sysout.println ; //<Function
        out();
        out(this.Middle) ;
    }
})
.endType();