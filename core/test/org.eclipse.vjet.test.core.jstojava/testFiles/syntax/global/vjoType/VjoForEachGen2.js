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
vjo.ctype('syntax.global.vjoType.VjoForEachGen') //< public
.props({
})
.protos({
		//>public void foreach() 
	foreach : function(){
		var col = new this.vj$.ArrayList<Number>();//<ArrayList
		var obj = null;//<String
		vjo.forEach(obj : col){
		
		}
	}
})
.endType();