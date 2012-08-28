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
vjo.etype('engine.overload.EChild') //< public
.needs('engine.overload.CBase')
.needs('engine.overload.EBase')
.values(
  '' 
)
.props({
	//>public void main() 
	main : function(){
		var cbase = new this.vj$.CBase(); //< CBase
		var pubVar = cbase.pubCompute();
		
		var ebase = this.vj$.EBase.MON; //< EBase
		ebase.pubCompute();
	}
})
.protos({

})
.endType();