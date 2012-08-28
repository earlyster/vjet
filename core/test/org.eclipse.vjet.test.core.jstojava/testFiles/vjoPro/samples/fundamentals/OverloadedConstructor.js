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
vjo.ctype('vjoPro.samples.fundamentals.OverloadedConstructor')
.protos({
x : undefined, //< public int
y : undefined, //< public String

//> public void constructs(int val1, String val2)
constructs : function (val1, val2)
{
var args = arguments.length;
if (args == 0)
{
this.constructs0();
}
else if (args == 1)
{
this.constructs1(val1);
}
else if (args == 2)
{
this.constructs2(val1, val2);
}
},

//> public void constructs0()
constructs0 : function ()
{
this.x = 0;
this.y = 'Something';
},

//> public void constructs1(int val1)
constructs1 : function (val1)
{
this.x = val1;
this.y = 'Something';
},

//> public void constructs2(int val1, String val2)
constructs2 : function (val1, val2)
{
this.x = val1;
this.y = val2;
},

//> public int getX()
getX : function()
{
return this.x;
},

//> public int getY()
getY : function()
{
return this.y;
}
})
.endType();
