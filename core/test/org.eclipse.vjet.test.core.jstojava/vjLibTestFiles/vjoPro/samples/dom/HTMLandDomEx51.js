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
vjo.ctype('vjoPro.samples.dom.HTMLandDomEx51') //< public
.needs('vjoPro.dsf.document.Element')
.props({
/**
* @return void
* @access public
* @param {String} psShowAllAnchorId
* @param {String} psHideAllAnchorId
*
*/
//> public void toggle(String psShowAllAnchorId,String psHideAllAnchorId)
toggle:function(psShowAllAnchorId, psHideAllAnchorId){
vjoPro.dsf.document.Element.toggleHideShow(psShowAllAnchorId);
vjoPro.dsf.document.Element.toggleHideShow(psHideAllAnchorId);
}

})
.endType();
