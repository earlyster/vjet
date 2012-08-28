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
vjo.itype("syntax.generic.SortedMap<K, V>")
.inherits("syntax.generic.Map<K, V>")
.protos({
	get: vjo.NEEDS_IMPL //<V get(K)
	,
	put: vjo.NEEDS_IMPL //<void put(K, V)
})
.endType();