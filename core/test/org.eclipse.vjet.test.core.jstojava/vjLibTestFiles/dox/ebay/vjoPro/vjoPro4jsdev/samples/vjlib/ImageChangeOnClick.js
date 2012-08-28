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
vjo.ctype("dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.ImageChangeOnClick")
.needs('vjoPro.dsf.document.Image')
.props({
//> public void loadImg(String psId, String psURL)
loadImg:function(psId, psURL){
vjoPro.dsf.document.Image.load(psId, psURL);
}

}).endType();
