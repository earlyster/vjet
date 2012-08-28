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
vjo.ctype("dox.ebay.vjoPro.vjoPro4javadev.samples.Employee")
.needs("dox.ebay.vjoPro.vjoPro4javadev.samples.Person")
.inherits("dox.ebay.vjoPro.vjoPro4javadev.samples.Person")
.protos({

salary : null,//<float

//>public void constructs(String name, float salary)
constructs:function(name,salary){
this.base(name);
this.salary = salary;
},

//> public void setSalary(float salary)
setSalary:function(salary){
this.salary = salary;
},

//> public float getSalary()
getSalary:function(){
return this.salary;
}
})
.endType();
