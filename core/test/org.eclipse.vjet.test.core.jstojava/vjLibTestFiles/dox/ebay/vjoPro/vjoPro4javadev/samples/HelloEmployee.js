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
vjo.ctype("dox.ebay.vjoPro.vjoPro4javadev.samples.HelloEmployee")
//snippet.vjoProtype.end
.needs("vjoPro.samples.classes.Employee")
.props({

//> public boolean helloEmployee()
helloEmployee:function(){
var emp = new vjoPro.samples.classes.Employee("John", "100.11");
alert("Hello " + emp.getName() + ", Salary=" + emp.getSalary());
return false;
}
})
.endType();
