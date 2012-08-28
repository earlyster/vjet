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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug4280_1') //< public
.protos({
	var1 : null, //< private final int
	var2 : undefined, //< public final String
	//> public constructs(int i, String str)
	constructs: function(i, str)  
	{
		this.var1 = i;
		this.var2 = str;
	}
})
.endType();