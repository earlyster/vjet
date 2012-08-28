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
vjo.itype("syntax.generic.Collection<E>")
//>needs(syntax.generic.Iterator)
.protos({
	
	//> public boolean containsAll(Collection<?> c)
	containsAll: vjo.NEEDS_IMPL,
	
	//> public boolean removeAll(Collection<?> c)
    removeAll: vjo.NEEDS_IMPL,
    
    //> public Iterator<E> iterator()
    iterator: vjo.NEEDS_IMPL
})
.endType();