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
vjo.ctype('syntax.dowhile.dowhileCorrect1')
.protos({

	//> public void setName(String name)
	setName: function(name) {
		var i = 0;
		var sum = 0;
		do {
		sum += i ;
		i++;
	}while(i<=100)
	}
	
	//> public void setName1(String name)
	setName1: function(name) {
		var i = 0;
		var sum = 0;
		do {
		sum += i ;
		i++;
	}while(name == "ddw")
	
		//> public void setName2(String name)
	setName2: function(name) {
		var i = 20;
		var sum = 0;
		do {
		sum += i ;
		i++;
	}while(i < sum )
	},
	
	
		
		//> public void setName3(String name)
	setName3: function(name) {
		var i = 20;
		var sum = 0;
		do {
		sum += i ;
		i++;
	}while(sum > i )
	},
	
	
			//> public void setName4(String name)
	setName4: function(name) {
		var i = 20;
		var sum = 0;
		do {
		sum += i ;
		i++;
	}while(sum >= i )
	}
})
.endType();