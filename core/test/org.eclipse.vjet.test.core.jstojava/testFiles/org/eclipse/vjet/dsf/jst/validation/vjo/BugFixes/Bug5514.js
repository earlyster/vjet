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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5514")
.props({
	map: {'one':['1', '2']},
	
	foo: function(){
		alert(this.map.one[0]);
		alert(this.map["one"][0]);
	},
	
	bar: function(){
		var map = this.map;
		alert(map.one[0]);
		alert(map['one'][0]);
	}
})
.endType();