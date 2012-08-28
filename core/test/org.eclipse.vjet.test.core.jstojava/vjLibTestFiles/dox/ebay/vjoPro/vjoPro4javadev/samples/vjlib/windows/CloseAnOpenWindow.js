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
vjo.ctype("dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.windows.CloseAnOpenWindow")
.needs("vjoPro.dsf.window.utils.VjWindow")
.protos({
m_winObj:null,
m_winName:null,

//> public void constructs(String psName)
constructs : function(psName) {
this.m_winName = psName;
},

//> public boolean openWin()
openWin:function(){
this.m_winObj = vjoPro.dsf.window.utils.VjWindow.open("http://www.ebay.com", this.m_winName, "width=600,height=800,location=yes,menubar=yes,scrollbars=yes,status=no", false, false, 600, 800);
return false;
},

//> public boolean closeWin()
closeWin:function(){
if (this.m_winObj) {
this.m_winObj.close();
}
return false;
}

})
.endType();
