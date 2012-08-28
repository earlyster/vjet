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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.BugStringConcat')
.protos({

	foo: function(){
		var p = 2;
		var piVal = 10;
		var b = "doIt";//<String
		return parseInt(b.substring(0, p) + piVal + b.substring(p + 1), 2);
	}
})
.endType();