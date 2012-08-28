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
vjo.ctype('vjoPro.samples.images.ImageEx6') //< public
.needs('vjoPro.samples.images.Image')
.props({
/**
* @return void
* @access public
* @param {String} psId
*/
//> public void loading(String psId)
loading:function(psId){
for(var i = 0; i < document.images.length; ++i) {
if (document.images[i].complete) {
this.loadCount++;
vjoPro.samples.images.Image.resize(psId, 100, 0);
}
}
if (this.loadCount < document.images.length) {
setTimeout(this.loading(psId), 1000);
}
alert(this.loadCount);
//		vjoPro.samples.images.Image.resize(psId, this.loadCount * 100, 0);
},
loadCount : 0
})
.endType();
