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
vjo.itype('vjoPro.samples.fundamentals.ITypeStaticMembers1')
.props({
s_start:		12,			//< public final int ; must be final
s_end:		undefined,	//< int ; this has default access
s_closed:	undefined,	//< public boolean
s_rate:		undefined,	//< final double
s_expires:	new Date()	//< private final Date;  must be final
})
.endType();
