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
vjo.ctype("vjoPro.dsf.utils.Css")
.needs("vjoPro.dsf.Element")
.props({
//> public Object apply(String, String);
apply : function(psElementId, psCssText) {
var e = vjoPro.dsf.Element.get(psElementId), c;
if(e && psCssText) {
c = this.createStyle(psCssText);
if(c){
e.appendChild(c);
}
}
return c;
},
//> public Object createStyle(String);
createStyle :function(psCssText){
var c = document.createElement('style'), t;
c.type =  "text/css";
if(psCssText) {
if (c.styleSheet) {
c.styleSheet.cssText = psCssText;
} else {
t = document.createTextNode(psCssText);
c.appendChild(t);
}
}
return c;
}
})
.endType();
