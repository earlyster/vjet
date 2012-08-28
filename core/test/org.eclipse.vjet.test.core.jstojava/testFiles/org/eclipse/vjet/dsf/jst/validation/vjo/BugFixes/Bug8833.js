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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8833")
.protos({

	//> public void overload(String, int)
	//> public void overload(String)
	overload: function(a,b){
	}
})
.props({

	main: function(){
		var obj = new this();//<Bug8833
		obj.overload('correct');//no error
		obj.overload('correct', 1);//no error
		obj.overload(-1);//wrong num of args
		obj.overload(-1, 'wrong');//type error
		obj.overload(-1, 'wrong', -1);//wrong num of args
	}
})
.endType();