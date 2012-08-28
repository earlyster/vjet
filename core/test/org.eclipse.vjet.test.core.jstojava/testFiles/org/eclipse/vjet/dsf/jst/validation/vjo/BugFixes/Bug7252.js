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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug7252')
.protos({
	foo: function(){
		this.bar();
		
		var inner = vjo.make(this, this.vj$.Bug7252)
		.protos({
		})
		.endType();
		
		this.bar();
	},
	
	bar: function(){
	}
})
.endType();