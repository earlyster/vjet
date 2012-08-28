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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug9650') //< public

.props({
	
		//>public void foo() 
	foo : function(){
		
		var result = Array(1 << 29).sort();
		
		var a = []; //< Array
		a.join();
		a.sort();

		var d = new Date(); //< Date
		d.setHours(10);
		d.setHours(10,9,8);
		
		Function.call();
		Function.apply();
		
	}
	
})
.protos({
	
})
.endType();