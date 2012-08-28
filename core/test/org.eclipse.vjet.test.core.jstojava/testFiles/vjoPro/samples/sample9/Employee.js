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
vjo.ctype('vjoPro.samples.sample9.Employee')
.protos({
m_name:undefined, //< private
m_age:0, //< private

//> public constructs()
constructs:function() {
},

//> public void setName(String name)
setName: function(name) {
this.m_name = name;
},

//> public String getName()
getName: function() {
return this.m_name;
},

//> public void setAge(int age)
setAge:function(age){
this.m_age = age;
},

//> public void getAge()
getAge:function() {
return this.m_age;
}
})
.endType();
