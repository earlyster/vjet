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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug4839') //< public
.protos({
        //> public void foo(Bug4839 a)
		foo:function(a) {
			  var s = ""; //< String
			  var i = 10; //< int
			
			  s = a.get(0);
			
			  i = a.get(0);
		},
		
		//> public String get(int index)
		get : function(index){
			return "Test";
		} 

})
.endType();