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
vjo.ctype('syntax.mixintype.EmployeeConflictsPerson')
.mixin('syntax.mixintype.Person')
.props({
	
	age : 0, //<public int
	
	//> public void doIt1Mixin()
	doIt1:function(){
	}
})
.protos({

	name : "HA", //<public String
	
	//> public void doIt2Mixin()
	doIt2:function(){
	},

	 //> public void mainMixin(String[] args)
	mainMixin : function(args)
	{
		vjo.sysout.println(this.vj$.Person.age);
		vjo.sysout.println(this.name);
		vjo.sysout.println("AGE");
		vjo.sysout.println('AGE');
		vjo.sysout.println(45);
	}
})
.endType();
