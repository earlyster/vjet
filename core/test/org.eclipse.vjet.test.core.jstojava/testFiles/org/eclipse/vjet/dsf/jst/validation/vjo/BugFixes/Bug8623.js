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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8623")
.props({
	//>public void fd() 
	fd : function(){
		alert("D")	;
	}
})
.protos({
	//>public void foo(Object... os) 
	foo : function(os){
		if(arguments.length > 1){
			if(arguments[0] instanceof String){
			}
		}
	}
})
.endType();