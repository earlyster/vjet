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
vjo.ctype("dsf.dom.html.level2.DlistTests")
.protos({

/**
*


* @author Netscape
* @author Sivakiran Tummala
* @see http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-html#ID-21738539
*/
//> public void dlist01()
dlist01: function() {
var nodeList;
var testNode;
var vcompact;
var doc= window.document;
var assertTrue = null;
var assertEquals = null;
nodeList = doc.getElementsByTagName("dl");
assertEquals(1,nodeList.length);
testNode = nodeList.item(0);
vcompact = testNode.compact;

assertTrue(vcompact);  //passes if <DL COMPACT="COMPACT"> is changed to <DL COMPACT> like the spec.

}

})
.endType();
