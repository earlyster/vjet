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
vjo.ctype('vjoPro.samples.forms.FormEx5') //< public
.needs('vjoPro.dsf.document.Select')
.props({
/**
* @return boolean
* @access public
* @param {String} psId
* @param {String} psValId
*
*/
//> public boolean addToSelect(String psId,String psValId)
addToSelect:function(psId, psValId){
var e = vjoPro.dsf.document.Element.get(psId);
var sVal = vjoPro.dsf.document.Element.get(psValId).value;
vjoPro.dsf.document.Select.addOption(e, sVal, sVal);
return true;
}

})
.endType();
