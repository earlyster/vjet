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
vjo.ctype('syntax.generic.constructor.GenericConstructor<E>') //< public
.props({  
	main: function(){
		//valid case
		var validGc = new this.vj$.GenericConstructor(new Date());//<GenericConstructor<Date>
		
		//invalid case
		var invalidGc = new this.vj$.GenericConstructor(new Date());//<GenericConstructor<String>
		
	}      
})
.protos({
	constructs: function(e){//<public constructs(E)
	
	}
})
.endType();