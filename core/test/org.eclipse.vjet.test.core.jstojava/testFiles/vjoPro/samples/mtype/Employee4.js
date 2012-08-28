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
vjo.ctype('vjoPro.samples.mtype.Employee4')
.props({
//> public void doIt1()
doIt1 : function()
{
document.writeln('doIt1 called');
}
})
.protos({
//> public void doIt2()
doIt2 : function()
{
document.writeln('doIt2 called');
}
})
.endType();
