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
vjo.ctype('access.finalcheck.FinalVarExample')
.protos({
	
x : 100, //<public final int
   
//>public void constructs(String x1)
constructs :function(x1){  
},

//> final public int getX()
getX : function()
{   
	//> final String   
	var x = "String";       
	return this.x;          
}
})
.endType();