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
vjo.ctype("dox.ebay.vjoPro.vjoPro4javadev.samples.jsr.PassingProxiedJSMethod")
.props({
m_DefaultID:100, //< public int

//> public String getDefaultID()
getDefaultID: function() {
return this.m_DefaultID;
}
})
.protos({
m_ID:0, //< public int

//> public void setID(String id)
setID: function(id) {
alert(id);
this.m_ID = id;
}
})
.endType();
