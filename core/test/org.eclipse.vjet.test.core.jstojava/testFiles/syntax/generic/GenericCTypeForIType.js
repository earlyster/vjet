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
vjo.itype('syntax.generic.GenericCTypeForIType<E>') //< public
//> needs(syntax.generic.ArrayList)
.props({
  
})
.protos({
	//>public void foo(ArrayList<String> s) 
	foo : vjo.NEEDS_IMPL,
	
	//>public void refFoo(int i, E ref, boolean flag) 
	refFoo : vjo.NEEDS_IMPL
})
.endType();