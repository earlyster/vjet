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
vjo.ctype("vjoPro.samples.fundamentals.CTypeExample1")
.needs("vjoPro.samples.fundamentals.AbstractExample1")
.inherits("vjoPro.samples.fundamentals.AbstractExample1")
.props({
s_compoundedRate: undefined //< public Number
})
.protos({
m_enrolled: false, 		//< protected boolean
showAlert:function(greeting){ //< public void showAlert(String)
alert("Greeting from instance method of subclass: "+greeting);
}
})
.inits(
function(){
/* use this section if you require static initialization */
s_compoundedRate = 0.75;
}
)
.endType();
