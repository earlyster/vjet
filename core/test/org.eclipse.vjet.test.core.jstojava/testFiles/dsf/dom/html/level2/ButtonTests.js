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
vjo.ctype("dsf.dom.html.level2.ButtonTests")
.protos({

/**
* Returns the FORM element containing this control. Returns null if this control is not within the context of a form.
*
* @author Netscape
* @author Sivakiran Tummala
* @see http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-html#ID-71254493
*/
//>public void button01()
button01 : function() {
var nodeList;
var testNode;
var vform;
var doc = window.document;
var assertEquals = null;
nodeList = doc.getElementsByTagName("button");
assertEquals(2,nodeList.length);
testNode = nodeList.item(1);
vform = testNode.form;

assertEquals(null, vform);

}

})
.endType();
