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
vjo.ctype('syntax.declare.otype.OTypeTarget')
//> needs(syntax.declare.otype.Defbug1)
.props({
})
.protos({
	//>public void doIt(Defbug1.foo) 
	doIt : function(x1){  
		x1(3);
		x1("D");
		var s = null;//<Function
		s(2);       
	}
})
.endType();