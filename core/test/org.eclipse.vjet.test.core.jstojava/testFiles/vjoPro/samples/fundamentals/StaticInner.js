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
vjo.ctype('vjoPro.samples.fundamentals.StaticInner')
.props({
//> public InnerClass
InnerClass : vjo.ctype()
.protos({
doIt1 : function()
{
document.writeln('Static InnerClass doIt Called');
this.vj$.StaticInner.doIt2();
//You can also use the next statement to call doIt2()
//vjo.samples.fundamentals.StaticInner.doIt2()
}
})
.endType(),

doIt2 : function()
{
document.writeln('OuterClass doIt Called');
},

//> public void main(String[] args)
main:function(args){
var innerType = new this.InnerClass();//<InnerClass
/*You can also use any of the next two statement to instantiate InnerClass
var innerType = new this.vj$.StaticInner.InnerClass();
var innerType = new vjo.samples.fundamentals.StaticInner.InnerClass();*/
innerType.doIt1();
}

})
.endType();
