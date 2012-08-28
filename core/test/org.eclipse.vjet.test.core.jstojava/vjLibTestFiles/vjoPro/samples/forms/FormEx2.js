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
vjo.ctype('vjoPro.samples.forms.FormEx2') //< public
.needs('vjoPro.dsf.document.Text')
.props({
/**
* @return boolean
* @access public
* @param {String} psId
*
*/
//> public boolean clearTextbox(String psId)
clearTextbox:function(psId){
vjoPro.dsf.document.Text.autoClear(psId);
return true;
}

})
.endType();
