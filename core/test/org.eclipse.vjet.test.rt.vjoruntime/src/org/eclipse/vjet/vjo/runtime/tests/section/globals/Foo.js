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
vjo.ctype('org.eclipse.vjet.vjo.runtime.tests.section.globals.Foo')
.props({
		//>public String bar(String)
		bar:function(){
			return this.doIt();
		},

		doIt:function(){
			return "testing";
		}
})
.protos({
	//>public String bar(String)
	bar2:function(){
		return this.doIt2();
	},
	
	doIt2:function(){
		return "testing2";
	}

	
})