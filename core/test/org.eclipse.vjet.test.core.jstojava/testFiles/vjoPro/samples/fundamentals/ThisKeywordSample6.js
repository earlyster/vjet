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
vjo.ctype("vjoPro.samples.fundamentals.ThisKeywordSample6")
.needs("vjoPro.samples.fundamentals.ThisKeywordSample2")
.protos({
x : 0, //< public int

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
var obj = new this.vj$.ThisKeywordSample6();
vjo.sysout.println(obj.getX());
vjo.syserr.println(this.vj$.ThisKeywordSample2.x);
}
})
.endType();
