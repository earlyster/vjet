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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8698")
.props({
		//>public void main(String... args) 
	main : function(args){
		var out = vjo.sysout.println;//<<
        var str = "4";
        var mint = 10;
        this.foo(str+mint);
	},
	
	//>public void foo(String) 
	foo : function(s){
		
	}
})
.protos({
})
.inits(function(){
})
.endType();
