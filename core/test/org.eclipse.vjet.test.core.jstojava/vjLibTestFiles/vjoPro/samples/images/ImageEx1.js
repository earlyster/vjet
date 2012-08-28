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
vjo.ctype('vjoPro.samples.images.ImageEx1') //< public
.needs('vjoPro.dsf.document.Image')
.props({
/**
* @return void
* @access public
* @param {String} psId
* @param {String} psURL
*
*/
//> public void loadImg(String psId,String psURL)
loadImg:function(psId, psURL){
vjoPro.dsf.document.Image.load(psId, psURL);
}

})
.endType();
