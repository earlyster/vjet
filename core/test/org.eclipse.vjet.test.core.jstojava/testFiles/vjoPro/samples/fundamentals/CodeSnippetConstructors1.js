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
vjo.ctype('vjoPro.samples.fundamentals.CodeSnippetConstructors1')
.protos({
x : 0, //< public int
y : undefined, //< public String

//> public void constructs(int val1, String val2)
constructs : function (val1, val2)
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
