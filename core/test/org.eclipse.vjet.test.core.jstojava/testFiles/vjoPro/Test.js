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
vjo.ctype('vjoPro.Test')
.needs('vjoPro.Test2')
.props({
	
	E : vjoPro.Test2,  //< type::Test2
	
	//> public Object doIt(String)
	doIt:function(p){
		
		var x = new this.vj$.Test();
		
		var E = {};

		// good cases
		x.oImg = E.getId() || null;
		var x = E.getId() || null;
		var y = p || null;
		
		// negative cases
//		x.oImg = E.getId() || true;
//		x.oImg = x.get(x.sImgId) || new Date();
		
		return null;
		
	}
	
	
})
.protos({
	oImg : null//<HTMLImageElement
})
.endType();