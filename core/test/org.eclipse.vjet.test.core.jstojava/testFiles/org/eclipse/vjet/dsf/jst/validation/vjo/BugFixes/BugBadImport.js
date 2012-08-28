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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.BugBadImport")
.props({

	prop: null,//<NoOneKnows
	
	//>void play(NoOneKnows)
	play: function(who){
		alert(who.abc);
		who.abc();
		new who.what();
	},
	
	foo: function(){
		alert(this.prop.what);
		this.prop.what();
		
		var local = null;//<NoOneKnows
		local.doIt();
		alert(local.sth);
	}
})
.endType();