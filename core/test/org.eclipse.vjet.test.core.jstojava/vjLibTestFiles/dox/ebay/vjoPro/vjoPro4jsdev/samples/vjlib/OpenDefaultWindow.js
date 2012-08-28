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
vjo.ctype("dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.OpenDefaultWindow")
.needs("vjoPro.dsf.window.utils.VjWindow")
.props({

//> public boolean openWin()
openWin:function(){
vjoPro.dsf.window.utils.VjWindow.open("http://www.ebay.com", "testWin", "width=600,height=800,location=yes,menubar=yes,scrollbars=yes,status=no", false, false, 600, 800);
return false;
}

})
.endType();
