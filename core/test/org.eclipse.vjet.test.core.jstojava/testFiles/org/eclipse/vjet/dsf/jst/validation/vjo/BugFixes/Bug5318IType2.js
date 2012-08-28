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
vjo.itype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5318IType2")
.protos({
	foo: vjo.NEEDS_IMPL, //< public String foo()
    bar: vjo.NEEDS_IMPL, //< public boolean bar()
    zot: vjo.NEEDS_IMPL  //< public Number zot()
})
.endType();
