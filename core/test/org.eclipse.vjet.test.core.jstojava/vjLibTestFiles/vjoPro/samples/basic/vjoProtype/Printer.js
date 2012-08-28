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
vjo.ctype('vjoPro.samples.basic.vjoProtype.Printer') //< public
.props({
/**
* @return boolean
* @access public
* @param {String} str
*/
//> public boolean print(String str)
print:function(str){
alert(str);
return false;
}
})
.endType();
