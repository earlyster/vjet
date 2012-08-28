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
vjo.ctype("dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.HTMLandDomEx51")
.needs('vjoPro.dsf.Element')
.props({

//> public void toggle(String psShowAllAnchorId, String psHideAllAnchorId)
toggle:function(psShowAllAnchorId, psHideAllAnchorId){
vjoPro.dsf.Element.toggleHideShow(psShowAllAnchorId);
vjoPro.dsf.Element.toggleHideShow(psHideAllAnchorId);
}

}).endType();
