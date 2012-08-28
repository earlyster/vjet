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
vjo.itype('vjoPro.samples.fundamentals.InterfaceWithSubType')
.needs('vjoPro.samples.fundamentals.SubordinateTypeUsages1')
.protos({
//> public void print(int copies, boolean color)
print: vjo.NEEDS_IMPL,

//> public vjoPro.samples.fundamentals.SubordinateTypeUsages1 getPrint()
getPrint: vjo.NEEDS_IMPL,

//> void doPrint(vjoPro.samples.fundamentals.SubordinateTypeUsages1 p)
doPrint: vjo.NEEDS_IMPL
})
.props({
//> void showMessage(String msg)
showMessage: function(msg) { }
})
.endType();
