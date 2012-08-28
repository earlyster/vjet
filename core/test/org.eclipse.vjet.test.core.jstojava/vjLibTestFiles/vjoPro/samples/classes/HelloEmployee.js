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
vjo.ctype('vjoPro.samples.classes.HelloEmployee') //< public
.needs('vjoPro.samples.classes.Employee')
.props({
/**
* @return boolean
* @access public
*/
//> public boolean helloEmployee()
helloEmployee:function(){
var emp = new vjoPro.samples.classes.Employee("John", "100.11");
alert("Hello " + emp.getName() + ", Salary=" + emp.getSalary());
return false;
}
})
.endType();
