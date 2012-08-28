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
/**
* Type: vjo.samples.fundamentals.CTypeExample1
* Description:
*/
vjo.ctype("syntax.abstraceClass.CTypeExample2")
.inherits("syntax.abstraceClass.AbstractExample1")
.props({
	s_compoundedRate: undefined //< public double
})
.protos({
	m_enrolled: false, 		//< protected boolean
	
	showAlert1 : function(msg){ //< public void showAlert1(String msg)
		alert("Greeting from instance method of subclass: "+msg);
	},
	
	showAlert : function(greeting){ //< public void showAlert(String greeting)
		alert("Greeting from instance method of subclass: "+greeting);
	}
})
.inits(
	function(){
		/* use this section if you require static initialization */
		this.s_compoundedRate = 0.75;
	}
)
.endType();
