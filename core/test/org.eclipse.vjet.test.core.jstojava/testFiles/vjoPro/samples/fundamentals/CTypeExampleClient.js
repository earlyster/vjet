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
vjo.ctype('vjoPro.samples.fundamentals.CTypeExampleClient')
.needs('vjoPro.samples.fundamentals.CTypeExample')
.props({
//> public void main(String[] args)
main: function(args){
//Call Static Method
vjoPro.samples.fundamentals.CTypeExample.getInitialValue();
//Call Instance Method
var ctypeobj = new vjoPro.samples.fundamentals.CTypeExample('Hello !'); //<CTypeExample
ctypeobj.showMessage();
}
})
.endType();
