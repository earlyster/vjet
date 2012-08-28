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
vjo.itype('comment.ITypeComment') //<public
.props({
	typeClass: 'ITypeComment'//<public final String
})
.protos({
	//>public void comment(String... args)
	comment: vjo.NEEDS_IMPL,
	desc: vjo.NEEDS_IMPL
})
.endType();