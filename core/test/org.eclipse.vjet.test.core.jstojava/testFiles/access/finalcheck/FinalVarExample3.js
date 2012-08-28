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
vjo.ctype('access.finalcheck.FinalVarExample3')
.protos({

 x : 29,//< final int
 y : 29,//< final int

//> final public void getX()
getX : function()
{
	this.x = 30;
	this.y = 39;
}
})
.endType();