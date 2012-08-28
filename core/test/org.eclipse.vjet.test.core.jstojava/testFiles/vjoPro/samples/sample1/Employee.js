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
vjo.ctype('vjoPro.samples.sample1.Employee')
.inherits('vjoPro.samples.sample1.base.Person')
.satisfies('vjoPro.samples.sample1.Employer')
.props({
DEFAULTGROUP:100, //< public int

//> public int getDefaultGroup()
getDefaultGroup:function() {
//get the static property using this keyword
alert(this.DEFAULTGROUP);
//get the static property using fully qualified VjO class name
alert(vjo.samples.sample1.Employee.DEFAULTGROUP);
return this.DEFAULTGROUP;
},

//> public void setDefaultGroup(int defaultgroup)
setDefaultGroup:function(defaultgroup) {
alert("Default Group >>" + defaultgroup);
}

})
.protos({
m_name:undefined, //< public String
m_age:0, //< private int

//> public constructs()
constructs:function() {
},

//> public void setName(String name)
setName: function(name) {
alert(name);
this.m_name = name;
},

//> public String getName()
getName: function() {
alert(this.m_name);
return this.m_name;
},

//> public void setAge(int age)
setAge:function(age){
this.m_age = age;
},

//> public int getAge()
getAge:function() {
return this.m_age;
}
})
.endType();
