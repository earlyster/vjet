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
vjo.ctype('syntax.interfaces.SatisfiesExample3')
.satisfies('syntax.interfaces.ITypeStaticMembers1')
.props({

	//> void cool()
	cool: function() {
		this.vj$.ITypeStaticMembers1.s_start = 23;  //Can't change final one
		alert('cool');
	},

	//> public void hot(boolean v)	
	hot:	function(v) {
		alert('hot');
	}	

})
.protos({
	//> public void foo()
	foo : function() {
		alert('foo');
	},

	//> public boolean bar(int x)
	bar : function(x) {
		alert('bar');
		return true;
	}

})
.endType();