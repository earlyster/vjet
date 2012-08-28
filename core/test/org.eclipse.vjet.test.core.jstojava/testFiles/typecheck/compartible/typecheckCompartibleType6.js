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


vjo.ctype('typecheck.compartible.typecheckCompartibleType6') //< public
.protos({
    //> public void a()
    a : function(){
        
        this.vj$.typecheckCompartibleType6.x = "String";
        
        this.vj$.typecheckCompartibleType6.s = 'String';
        
        this.vj$.typecheckCompartibleType6.c = 20;//<<String
        
        this.vj$.typecheckCompartibleType6.d = 20;//<<String
    }
    
})
.props({
	x : 10,  //< public int

	 s : 10,  //< public int

	 c : undefined, //< public String

	//> public String
     d : undefined
})
.endType();