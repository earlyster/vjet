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
vjo.ctype('vjoPro.samples.mtype.Employee')
.satisfies('vjoPro.samples.mtype.Employer')
.props({

//> public void main(String[] args)
main : function(args)
{
var emp = new this.vj$.Employee(100, 111);//<Employee
emp.getDeptId();
emp.getId();
}
})
.protos({

empid : 0, //< public int
deptid : 0, //< public int

//public void contructs(int id)
constructs : function(id, dptid)
{
this.empid = id;
this.deptid = dptid;
},

//> public int getId()
getId : function()
{
document.writeln('EmpId > ' + this.empid);
this.empid;
},

//> public int getDeptId()
getDeptId : function()
{
document.writeln('DeptId > ' + this.deptid);
this.deptid;
}

})
.endType();
