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
vjo.ctype('vjoPro.samples.images.Image') //< public
.needs('vjoPro.dsf.document.Element')
.props({
/**
* @return void
* @access public
* @param {String} psImageUrl
*/
//> public void preload(String psImageUrl)
preload:function(psImageUrl){
if (document.images){// object detection
var img = new Image();
img.src = psImageUrl;
}
},
/**
* @return void
* @access public
* @param {String} psId
* @param {int} piWidth
* @param {int} piHeight
*/
//> public void resize(String psId,int piWidth,int piHeight)
resize:function(psId, piWidth, piHeight){
if (document.images){// object detection
var e = vjoPro.dsf.document.Element.get(psId);
if (e){
// set size, client bug workaround
e.width = e.width;
e.height = e.height;
// adjust size
e.width += piWidth;
e.height += piHeight;
}
}
}
})
.endType();
