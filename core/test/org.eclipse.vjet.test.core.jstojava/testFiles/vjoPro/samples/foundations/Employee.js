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
vjo.ctype('vjoPro.samples.foundations.Employee')
//snippet.withoutsatisfy.end
.satisfies('vjoPro.samples.fundamentals.IEmployer')
//snippet.withoutsatisfy.begin
.protos({
name:undefined, //< public String
empId:0, //< public int

//> public void constructs(String name, int empId)
constructs:function(name, empId) {
this.name = name;
this.empId = empId;
},

//> public int getEmpId()
getEmpId : function() {
return this.empId;
},

//> public String getName()
getName : function() {
return this.name;
}
})
.endType();
//snippet.withoutsatisfy.end
//snippet.withsatisfy.end
