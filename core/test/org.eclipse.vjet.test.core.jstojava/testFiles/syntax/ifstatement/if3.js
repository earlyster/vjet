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
vjo.ctype('syntax.ifstatement.if3')
.protos({

x : 0, //< public int
//> public Number
y : undefined, 

z : undefined,//<public String

//> public void getIsle(boolean val1, boolean val2)
getIsle : function (val1, val2)
{
if (this.x)
{
}
else if (this.y)
{
}
else if (val2)
{
}else if("string"){}
else if(30){}
else if(32.2323){}
else if(null){}
},
//> public int getX()
getX : function()
{
return this.x;
},
//> public Number getY()
getY : function()
{
return this.y;
},


//> public String getZ()
getZ : function()
{
return this.z;
}
})
.endType();