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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.inherits.parent")
.protos({
	
	numberProperty: 10, //<Number
	
	privateProperty: "", //<private String
	
	//> public constructs()
	constructs: function(){
		this.numberProperty++;
	},
	
	//>private void sayIt()
	sayIt: function(){
		
	},
	
	//>protected void doIt()
	doIt: function(){
		alert(this.privateProperty);
	},
	
	//>public void sayIt2()
	sayIt2: function(){
	}
})
.endType();