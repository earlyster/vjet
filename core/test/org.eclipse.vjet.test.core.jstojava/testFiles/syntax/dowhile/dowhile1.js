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
vjo.ctype('syntax.dowhile.dowhile1')
.protos({

	//> public void setName(String name)
	setName: function(name) {
		var i = 0;  //<Number
		var sum = 0; //<Number
		do {
		sum += i ;
		i++;
	}while(name);
	}
})
.endType();