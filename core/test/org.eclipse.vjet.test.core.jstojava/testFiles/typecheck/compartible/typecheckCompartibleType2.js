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
vjo.ctype('typecheck.compartible.typecheckCompartibleType2') //< public
.needs('typecheck.compartible.typecheckCompartibleType1')
.protos({

	test1 : undefined,  //<  public String
	
	 //>  public typecheckCompartibleType1
	 test2 : undefined,

    //> int a()
    a:function(){
       this.test1 = 20;
       return this.test1;
    },
        
	b:function(){  //< public void b()
	 this.test2 = 30;
	},
	
    //> public void sgetBoolean()
	sgetBoolean : function(){
		var booleantest1; //< String
		booleantest1 = 302;
	},
			
    //> public void sgetBoolean1()
	sgetBoolean1 : function(){
		//> boolean
		var booleantest1; 
		booleantest1 = 32;
	}
})
.endType();