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
vjo.ctype('syntax.global.vjoType.VjoMixin') //< public
.props({
	//>public void foo2() 
	foo2 : function(){
		vjo.mixin("syntax.global.vjoType.VjoMType","syntax.global.vjoType.VjoMixin");
		this.smfoo();
	}
})
.protos({
	//>public void foo() 
	foo : function(){
		vjo.mixin("syntax.global.vjoType.VjoMType","syntax.global.vjoType.VjoMixin");
		this.mfoo();
	}
})
.endType();