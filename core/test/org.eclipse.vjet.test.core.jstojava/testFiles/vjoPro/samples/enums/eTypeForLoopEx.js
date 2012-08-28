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
vjo.ctype('vjoPro.samples.enums.eTypeForLoopEx')
.needs('vjoPro.samples.enums.eTypeDefStyle1')
.props({
//> public void main(String[] args)
main:function(args){
var days = this.vj$.eTypeDefStyle1.values();
document.writeln('Demonstrating for loop');
//snippet.forloop.begin
for(var i in days)
{
document.writeln('Day at ' + i + ' is ' + days[i].name()) ;
}
//snippet.forloop.end

document.writeln('Demonstrating for each loop');
//snippet.foreachloop.begin
for (var item in days) {
document.writeln('Day at ' + item.ordinal() + ' is ' + item.name()) ;
}
//snippet.foreachloop.end
}
})
.endType();
