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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug4280_2') //< public
.protos({
	var1 : new Date(), //< private final Date
	var2 : new Date(), //< private final Date
	//> public constructs(Date dt1, Date dt2)
	constructs: function(dt1, dt2)  
	{
		this.var1 = dt1;
		this.var2 = dt2;
	}
})
.endType();