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
vjo.mtype('vjoPro.samples.mtype.Person6')
.props({
gender : 'Male', //< public String

//> public String getGender()
getGender: function()
{
return this.gender;
}
})
.protos({
//> public void printGender()
printGender:function(){
//snippet.mixin.begin
document.writeln('Gender > ' + this.vj$.Person6.getGender());
//snippet.mixin.end
}
})
.endType();
