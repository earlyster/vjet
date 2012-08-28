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
vjo.itype('engine.overload.IBase') //< public
.props({
	
})
.protos({
	//>public String func(int i, String s, Date d)
	//>public String func(int i, String s)
	//>public String func(int i)
	//>public String func() 
	func : vjo.NEEDS_IMPL
})
.endType();