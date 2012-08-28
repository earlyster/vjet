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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.objliteral.ObjLiteral")
.props({
  
	main: function(){
		var id = 1; //<int
		var ol = {
			id: "object literal" //<String
			,
			age: 10 //<int
			,
			hello: function(str){ //<int hello(String)
				alert(this.id);
				return this.age;
			}
		};
		//should be a valid assignment
		var x = ol.id;//<String
		
		//should be an invalid assignment
		var a = ol.age;//<String
		
		ol.hello(1);
	}
})
.endType();