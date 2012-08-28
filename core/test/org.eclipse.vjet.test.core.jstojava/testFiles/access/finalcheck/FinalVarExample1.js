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
vjo.ctype('access.finalcheck.FinalVarExample1')
.protos({

x : 0, //< final public int

//> final public void getX()
getX : function()
{
	this.x = 30;
},

//> final public void getX1(int)
getX1 : function(s)
{
	this.x = s;
	
	var finalVar = 100;//<final
	finalVar = -1;//should throw error
}
})
.endType();