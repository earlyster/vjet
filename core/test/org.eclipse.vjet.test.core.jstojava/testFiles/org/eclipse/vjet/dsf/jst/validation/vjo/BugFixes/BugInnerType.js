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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.BugInnerType")
.props({
	main: function(){
		var outerType = new this.vj$.BugInnerType(); //< BugInnerType
		var innerType = new outerType.InstanceInnerType(); //< BugInnerType.InstanceInnerType
		
		outerType.foo();
		innerType.bar();
	},
	
	StaticInnerType: vjo.ctype() //<public
		.protos({
			bla: function(){
				var outerType = new this.vj$.BugInnerType(); //< BugInnerType
				outerType.foo();
			}
		}).endType()
})
.protos({

	foo: function(){
		var innerType = new this.InstanceInnerType();//< BugInnerType.InstanceInnerType
		innerType.bar();
		//innerType.foo();
	},
	
	InstanceInnerType: vjo.ctype() //<public
		.protos({
			bar: function(){
			}
		}).endType()
})
.endType();