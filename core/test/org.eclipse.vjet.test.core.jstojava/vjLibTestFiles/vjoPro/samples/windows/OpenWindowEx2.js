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
vjo.ctype('vjoPro.samples.windows.OpenWindowEx2') //< public
.needs('vjoPro.dsf.window.utils.VjWindow')
.props({
/**
* @return boolean
* @access public
*
*/
//> public boolean openWin()
openWin:function(){
vjoPro.dsf.window.utils.VjWindow.open("http://www.ebay.com", "testWin", "width=400,height=600,location=yes,menubar=yes,scrollbars=yes,status=no", false, false, 400, 600);
return false;
}

})
.endType();
