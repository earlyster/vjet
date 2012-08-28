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
vjo.ctype('vjoPro.samples.fundamentals.ThisKeywordSample1')
.protos({
x : 0, //< public int

//> public void constructs(int val)
constructs : function (val)
{
this.x = val;
},

//> public int getX()
getX : function()
{
return this.x;
}
})
.props({
//> public void main(String[] args)
main : function(args)
{
var obj = new this.vj$.ThisKeywordSample1(10);
vjo.sysout.println(obj.getX());
}
})
.endType();
