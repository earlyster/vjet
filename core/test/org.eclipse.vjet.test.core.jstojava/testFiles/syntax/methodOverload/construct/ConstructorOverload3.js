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
vjo.ctype('syntax.methodOverload.construct.ConstructorOverload2')
.needs('syntax.methodOverload.construct.ConstructorOverload1')
.props({
//> public void main(String[] args)
main : function(args)
{
var obj = new this.vj$.OverloadedConstructor();
document.writeln(obj.getX());
document.writeln(obj.getY());

obj = new this.vj$.OverloadedConstructor("String");
document.writeln(obj.getX());
document.writeln(obj.getY());

obj = new this.vj$.OverloadedConstructor('Test', 10);
document.writeln(obj.getX());
document.writeln(obj.getY());
}
})
.endType();