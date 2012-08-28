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
vjo.ctype("dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.ImageStretchImage")
.needs('vjoPro.dsf.Element')
.props({

//> public void resize(String psId, int piWidth, int piHeight)
resize:function(psId, piWidth, piHeight){
if (document.images){// object detection
var e = vjoPro.dsf.Element.get(psId);
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
}).endType();
