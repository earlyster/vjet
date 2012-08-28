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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.vjNS.CTypeCorrectExtn")
.needs(["org.eclipse.vjet.dsf.jst.validation.vjo.vjNS.ITypeCorrect"])
.needs('org.eclipse.vjet.dsf.jst.validation.vjo.vjNS.ITypeCorrect')
.protos({
	
    property : 10, //<int

	//> public constructs()
	constructs: function(){
		this.property = 20;
	},

	//> public void doIt()
	doIt : function () {
	   alert(this.property);
	   
	   var clz = this.vj$.ITypeCorrect;
	}
})
.endType();