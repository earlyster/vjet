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
vjo.ctype('astjst.DiamondBean') //< public
.needs(['astjst.DiamondShape', 'astjst.DiamondPurity'])
.protos({
	id : undefined, //< int
	name : undefined, //< String
	shape : undefined, //< DiamondShape
	purity : undefined, //< DiamondPurity
	price : undefined, //< Number
	
	//> public constructs(int id, String name, DiamondShape shape, DiamondPurity purity, Number price)
	constructs : function(id,name,shape,purity,price){
		this.id = id;
		this.name = name;
		this.shape = shape;
		this.purity = purity;
		this.price = price;
	},
	//>public int getId()
	getId : function() {
			return this.id;
	},
	//>public String getName()
	getName : function() {
			return this.name;
	},
	//>public DiamondShape getShape()
	getShape : function() {
			return this.shape;
	},
	//>public DiamondPurity getPurity()
	getPurity : function() {
			return this.purity;
	},
	//>public Number getPrice()
	getPrice : function() {
			return this.price;
	}
})
.endType();