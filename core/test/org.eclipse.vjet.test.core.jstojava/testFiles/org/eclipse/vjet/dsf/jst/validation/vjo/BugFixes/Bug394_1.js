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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug394_1') //< public
.protos({
	var1 : undefined, //< private String

	//> public void foo(void str)
	foo: function(str)  
	{
		this.var1 = str;
	}
})
.props({
	//> public String greeting(void name)
	greeting: function(name)  
	{
		return 'Welcome ' + name;
	}
})
.endType();