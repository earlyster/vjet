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
vjo.ctype('vjoPro.samples.fundamentals.AbstractCTypeExample')
.props({
initialValue: undefined, //< public int

getInitialValue: function(){	//< public void getInitialValue()
window.document.writeln('Initial Value : '+initialValue);
}
})
.protos({
message: undefined, 		//< protected String

//> public void setMessage(String msg)
setMessage:function(msg){ },

//> public void showMessage()
showMessage:function(){
window.document.writeln('Message ' + this.message);
}
})
.inits(
function(){
/* use this section for static initialization */
this.initialValue = 100;
}
)
.endType();
