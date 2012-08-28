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
vjo.ctype('access.finalcheck.FinalClassExample') //<public final
.protos({

	//>public void constructs()
	constructs:function(){
	},

x : 0, //< final public int

//> final public int getX()
getX : function()
{
return this.x;
}
})
.endType();