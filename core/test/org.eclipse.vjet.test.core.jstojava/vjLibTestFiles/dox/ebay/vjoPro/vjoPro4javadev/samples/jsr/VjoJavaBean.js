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
vjo.ctype("dox.ebay.vjoPro.vjoPro4javadev.samples.jsr.VjoJavaBean")
.props({
//> public void showGreeting(String psGreeting, dox.ebay.vjoPro.samples.jsr.VjOJavaBean vjoProBean)
showGreeting:function(psGreeting, vjoProBean){
alert(psGreeting + " " + vjoProBean.firstName + " " + vjoProBean.lastName);
}

})
.endType();
