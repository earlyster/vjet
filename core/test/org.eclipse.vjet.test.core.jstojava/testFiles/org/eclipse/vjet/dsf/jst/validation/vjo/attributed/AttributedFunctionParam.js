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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.attributed.AttributedFunctionParam")
//> needs(org.eclipse.vjet.dsf.jst.validation.vjo.attributed.SimpleAttributor)
.props({
	
	f1 : function(fa){//<void f1(SimpleAttributor::date2numberProp)
	
	},
	
	main: function(){
		this.f1(function(d){
			return d.toYear();
		});
		
		var f2 = function(d){//<SimpleAttributor::date2numberProp
			
		};
		
		var i = f2(new Date());//<int
		
		//error case to verify the binding
		var s = f2("");//<String
	}
})
.endType();