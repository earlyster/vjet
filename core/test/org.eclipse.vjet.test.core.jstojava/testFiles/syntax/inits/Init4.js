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
vjo.ctype('syntax.inits.Init4')
.props({
	s1 : undefined, //<String
	finalVar2 : "Final2" //< final String
})
.protos({
	s2 : undefined, //<final String
	//>public constructs()
	constructs : function(){
	this.vj$.Init4.finalVar2 = "3";
		this.s2 = "v";
	}
})
.inits(function(){
	this.vj$.Init4.finalVar2 = "3";
		this.s2 = "V";
})
.endType();