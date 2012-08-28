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
vjo.ctype('vjoPro.samples.basic.vjoProtype.Employee') //< public
.inherits('vjoPro.samples.basic.vjoProtype.Person')
.protos({
/**
* @return void
* @access public
* @param {String} name
* @param {int} age
* @param {float} salary
*/
//> public constructs(String name,int age,float salary)
constructs:function(name,age,salary){
this.base(name,age);
this.salary = salary;
},

/**
* @return void
* @access public
* @param {float} salary
*/
//> public void setSalary(float salary)
setSalary:function(salary){
this.salary = salary;
},
/**
* @return float
* @access public
*/
//> public float getSalary()
getSalary:function(){
return this.salary;
}
})
.endType();
