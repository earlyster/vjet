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
vjo.ctype("vjoPro.dsf.docx.Textx")
.needs("vjoPro.dsf.docx.Elementx")
.props({
/**
* Clears the content in specified textarea.
*
* @param {String} id
*        the id of the textarea to be cleared
*/
//> public void autoClear(String);
autoClear : function(psId) {
var o = vjoPro.dsf.document.Element.get(psId);
if(o)
{
if(o.defaultValue == o.value)
{
o.value = "";
}
}
}
})
.endType();


