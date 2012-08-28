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
vjo.otype('access.innerClass.InnerclassInOType')
.props({
	staticCInner:vjo.ctype()
	.endType(),
	staticEInner:vjo.etype()
	.endType(),
	staticMInner:vjo.mtype()
	.endType(),
	staticAInner:vjo.ctype() //<abstract
	.endType(),
	staticOInner:vjo.otype()
	.endType(),
	staticIInner:vjo.itype()
	.endType()
	
})
.protos({
	instanceCInner:vjo.ctype()
	.endType(),
	instanceEInner:vjo.etype()
	.endType(),
	instanceMInner:vjo.mtype()
	.endType(),
	instanceAInner:vjo.ctype() //<abstract
	.endType(),
	instanceOInner:vjo.otype()
	.endType(),
	instanceIInner:vjo.itype()
	.endType()
})
.endType();