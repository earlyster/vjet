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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.BugGlobalVarUndefinedCheck")
.globals({
	UNKNOWN_GLOBAL:null
})
.props({

	main: function(){
		//acessing global variable with if check
		if(UNKNOWN_GLOBAL){
			alert(UNKNOWN_GLOBAL + UNKNOWN_GLOBAL());
		}
		
		//accessing global variable with conditional expr
		UNKNOWN_GLOBAL?alert(UNKNOWN_GLOBAL + UNKNOWN_GLOBAL()):alert('null');
		
		//accessing global variable with typeof check in if
		if(typeof(UNKNOWN_GLOBAL) != 'undefined'){
			alert(UNKNOWN_GLOBAL + UNKNOWN_GLOBAL());
		}
		
		//accessing global variable with typeof check in conditional expr
		UNKNOWN_GLOBAL?alert(UNKNOWN_GLOBAL + UNKNOWN_GLOBAL()):alert('null');
		typeof(UNKNOWN_GLOBAL) != 'undefined'?alert(UNKNOWN_GLOBAL + UNKNOWN_GLOBAL()):alert('null');
	}
}).endType();