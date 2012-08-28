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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8717")
.props({
	sv : null//<final Number
})
.protos({
	si : null,//<final Number
	
	//>public constructs()
	constructs : function(){
		this.si = 2; 
		this.si = 3;
	}
})
.inits(function(){
	this.sv = 30;
	this.sv = 20;
})
.endType();
