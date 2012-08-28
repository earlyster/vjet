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
vjo.ctype('vjoPro.samples.server.ServerEx8') //< public
.props({
/**
* @access public
* @param {com.ebay.af.common.types.Money} psMoney
*/
//> public void doSomething(com.ebay.af.common.types.Money psMoney)
doSomething:function(psMoney){
alert("Amount:"+psMoney);
}
})
.endType();
