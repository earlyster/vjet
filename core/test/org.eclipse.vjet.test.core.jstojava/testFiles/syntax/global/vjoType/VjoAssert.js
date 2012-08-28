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
vjo.ctype('syntax.global.vjoType.VjoAssert') //< public
.props({
})
.protos({
		//>public void foreach() 
	foreach : function(){
		 vjo.assert(true,false);
		 vjo.assert("Dce","");
		 vjo.assert(10,20);
	}
})
.endType();