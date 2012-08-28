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
vjo.ctype('org.eclipse.vjet.vjo.runtime.tests.section.globals.PromoteExistingType') //< public
.needs('org.eclipse.vjet.vjo.runtime.tests.section.globals.Foo')
.globals({
	MYPROMOTE:vjo.NODEF, //< Foo::bar
	MYPROMOTE2:vjo.NODEF, //< Foo:bar2
})
.inits(function(){

	// WIRING GLOBAL TO INSTANCE
//	MYPROMOTE = this.vj$.Foo.bar;
	
	MYPROMOTE = vjo.hitch(this.vj$.Foo, this.vj$.Foo.bar); //<Foo::bar
	
	if(MYPROMOTE()!="testing"){
		throw "MYPROMOTE WAS NOT PROMOTED AND NOT AVAILABLE";
	}
	
	var o = new this.vj$.Foo();
	MYPROMOTE2 = vjo.hitch(o, o.bar2); //<Foo:bar2
	
	if(MYPROMOTE2()!="testing2"){
		throw "MYPROMOTE WAS NOT PROMOTED AND NOT AVAILABLE";
	}
	
	
	
	
})
.endType();


