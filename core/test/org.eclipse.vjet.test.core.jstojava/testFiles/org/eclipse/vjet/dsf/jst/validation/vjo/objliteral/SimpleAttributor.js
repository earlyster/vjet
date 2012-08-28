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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.objliteral.SimpleAttributor")
.protos({
	intProto: null//<int
	,
	arrProto: null//<String[]
	,
	funProto: function(){//<void function()
	
	},
	intProtoInvisible: null//<private int
})
.props({
	
	intProp: null//<int
	,
	arrProp: null//<String[]
	,
	funProp: function(){//<void function()
	
	},
	intPropInvisible: null//<private int
})
.endType();