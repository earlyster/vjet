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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6759")//< abstract
.props({
	//>public void adf()
	adf: vjo.NEEDS_IMPL,
	
	//>public abstract void adf2()
	adf2: vjo.NEEDS_IMPL,
	
	prp1: null//<protected abstract
})
.protos({

	//>private abstract void adf3()
	adf3: vjo.NEEDS_IMPL,
	
	adf4: function(){
		this.adf3(); alert(this.prp2);
	},
	
	prp2: null//<private abstract
})
.endType();