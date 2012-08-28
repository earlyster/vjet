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
vjo.mtype("com.ebay.dsf.tests.jsast.parser.devtests.MType")
.props({
	//>public String s_mixinPropOne
	s_mixinPropOne : "mixinPropOne",
	
	//>public void mixinStaticMethod()
	mixinStaticMethod : function () {
		alert("mixinStaticMethod");
	}
})
.protos({
	//>public String s_mixinPropOne
	mixinPropOne : "mixin instance property",

	//>public void mixinInstanceMethod()
	mixinInstanceMethod : function () {
		alert("mixinInstanceMethod");
	}
	
}).endType();