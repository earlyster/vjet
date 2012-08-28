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
vjo.ctype("dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.FormSuppressSubmission")
.needs("vjoPro.dsf.document.Element")
.props({

//>public boolean validateAndSubmitForm(String psChkBoxId)
validateAndSubmitForm:function(psChkBoxId){
var chk = this.vj$.Element.get(psChkBoxId).checked;//<boolean
return !chk;
}

})
.endType();
