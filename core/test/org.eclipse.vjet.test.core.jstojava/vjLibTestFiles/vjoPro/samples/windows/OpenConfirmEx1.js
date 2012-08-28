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
vjo.ctype('vjoPro.samples.windows.OpenConfirmEx1') //< public
.needs('vjoPro.dsf.window.utils.VjWindow')
.props({
/**
* @return boolean
* @access public
*
*/
//> public boolean openConfirmWin()
openConfirmWin:function(){
return vjoPro.dsf.window.utils.VjWindow.confirm("Are you sure you want to go to http://www.ebay.com?");
}

})
.endType();
