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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.jstinitializer.Jstinitializer")
.props({
	var4 : undefined, //< public static final int 
	m: function(){
		this.var4 = 200;
	}
})
.protos({
	var0 : undefined, //<private final int
	constructs: function(){ //<public constructs()
		this.var0 = 100;
	},
	
	f: function(){ //<public void f()
		this.var0 = 200;
	}
})
.inits(
	function(){
 		this.var4 = 100;
	}
)
.endType();