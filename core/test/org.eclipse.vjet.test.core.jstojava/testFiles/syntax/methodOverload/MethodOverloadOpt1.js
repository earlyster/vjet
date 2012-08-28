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
vjo.ctype('syntax.methodOverload.MethodOverloadOpt1')
.props({

	//>public void doIt(String a, String? b, int? c) 
	doIt : function(a,b,c){
		
	},
	
	//>public void main(String... args) 
	main : function(){
		this.doIt("test", 12); // not correct no validation error
		this.doIt("test", "test"); // correct 
		this.doIt("test", "test", 10); // correct 
//		this.doIt(true, true, "test"); // 
	}
	
})
.endType();