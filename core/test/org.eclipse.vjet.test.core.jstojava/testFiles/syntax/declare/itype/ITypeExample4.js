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
vjo.itype('syntax.declare.itype.ITypeExample4')
.sdfs()
.props({
	//> public int
	initialValue: undefined

})
.protos ({

})
.inits(
	function(){
		/* use this section for static initialization */
		this.initialValue = 100;
	}
)
.endType();
