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
vjo.mtype('vjoPro.samples.mtype.Person2')
//snippet.mixin.begin
.expects('vjoPro.samples.mtype.Employer')
//snippet.mixin.end
.protos({
//> public void doIt1()
doIt1:function(){
document.writeln('doIt1 called');
this.getId();
this.getDeptId();
}
})
.endType();
