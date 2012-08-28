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
vjo.ctype('vjoPro.samples.fundamentals.ThisKeywordSample3')
.needs('vjoPro.samples.fundamentals.ThisKeywordSample2')
.props({
x : 10, //< public int

//> public int getX()
getX : function()
{
return this.vj$.ThisKeywordSample3.x;
},

//> public void main(String[] args)
main : function(args)
{
vjo.sysout.println(this.vj$.ThisKeywordSample2.getX());
vjo.sysout.println(this.getX());
}
})
.endType();
