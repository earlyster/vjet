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
vjo.ctype('vjoPro.samples.mtype.Employee6')
.mixin('vjoPro.samples.mtype.Person6')
.props({
//> public void main(String[] args)
main : function(args)
{
var emp = new this.vj$.Employee6();//<Employee6
emp.printGender();//printGender is defined in mixin Person6
}
})
.endType();
