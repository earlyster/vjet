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
vjo.ctype("dox.ebay.vjoPro.vjoPro4jsdev.samples.foundations.HelloWorld")
.needs('vjoPro.samples.classes.HelloWorld','C')
.props({
s_init:false,			//< public boolean
helloWorld:function(){	//< public final Boolean
alert("Hello VjO");
return true;
}
})
.inits(function() {
C.s_init = true;
})
.endType();
