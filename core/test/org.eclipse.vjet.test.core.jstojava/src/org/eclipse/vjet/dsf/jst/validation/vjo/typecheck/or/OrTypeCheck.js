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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.or.OrTypeCheck")
.props({
	main: function(){
		var i = 1;//<int
		var s = new Date();//<Date
		
		//this assignment should force or expression type to be int
		var iAmInt = i || s;//<int
		
		//this assignment should force or expression type to be Date
		var iAmDate = i || s;//<Date
		
		//this assignment should cause an error and none candidate types satisfies
		var iAmError = i || s;//<Error
		
		var f = function(e){//<Error function(Error)
			return i || s;//this return statement should cause an error as none candidate types satisfies the signature
		};
		
		f(i || s);//this method call should cause an error as none candidates satisfied the method parameter type
	}
}).endType();