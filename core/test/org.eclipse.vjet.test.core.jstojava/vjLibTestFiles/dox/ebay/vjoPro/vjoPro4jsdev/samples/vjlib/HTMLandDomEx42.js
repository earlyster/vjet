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
vjo.ctype("dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.HTMLandDomEx42")
.needs('vjoPro.dsf.Element')
.needs('vjoPro.dsf.document.Shim')
.protos({

sId: null,//<String
//> public void constructs(String psId)
constructs:function(psId) {
this.sId = psId;
},

//> public boolean showLayer()
showLayer:function(){
var E = vjoPro.dsf.Element;
E.toggleVisibility(this.sId);
var oDiv = E.get(this.sId);
if (oDiv.bIsVisible) {
this.iframeShim = vjoPro.dsf.document.Shim.add(oDiv);
} else {
if (this.iframeShim) {
vjoPro.dsf.document.Shim.remove(oDiv, this.iframeShim);
}
}
}

}).endType();
