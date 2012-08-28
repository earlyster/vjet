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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.BugConflictOverloading')
.protos({

	//> public void foo(String... arg)
	//> public void foo(int... arg)
	foo: function(arg){
	},

	//> public void bar(String? arg)
	//> public void bar(int? arg)	
	bar: function(arg){
	},
	
	//> public void bla(String arg)
	//> public void bla(int arg)
	bla: function(arg){
	},
	
	//> public void doIt(String arg)
	//> public void doIt(int? arg)	
	doIt: function(arg){
	},
	
	//> public void say(String... arg)
	//> public void say(int arg)
	say: function(arg){
	},
	
	//> public void f1(String p1, int? p2, Object... p3)
	//> public void f1(String? p1, int? p2, Object? p3, Object? p4)
	f1: function(p1,p2,p3,p4){
	}
})
.endType();