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
vjo.itype('syntax.interfaces.ITypeSubExample')
.inherits('syntax.interfaces.ITypeExample')
.props({
})
.protos ({
	//> public void foo22()
	foo22:	function() {},	

	//> public boolean bar22(int x)
	bar22: function(x) {}	
})
.endType();