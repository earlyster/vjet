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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.objliteral.ObjLiteralWithAttributedTypes")
//>needs(org.eclipse.vjet.dsf.jst.validation.vjo.objliteral.SimpleAttributor)
.props({
  
	main: function(){
		var ol = {
			id: 1 //<SimpleAttributor:intProto
			,
			f: null //<SimpleAttributor:funProto
		};
		
		var x = ol.id;//<int
		var f = ol.f;//<void function()
		f();
		ol.f();
		ol.f.apply(null);
	}
})
.endType();