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


vjo.ctype('typecheck.compartible.typecheckCompartibleType4') //< public
.protos({

	test1 : undefined,  //<  public String
	
	 //>  public int
	 test2 : null,

		
    //> Number a()
    a:function(){
      this.test1 = 20 + "HA";
       return this.test1;
    },
    
    
    //> Number a1()
    a1:function(){
       this.test1 = 20 + "HA";
       return this.test1;
    },
    
        
	b:function(){  //< public void b()
	 this.test2 = 30;
	 this.test2++;
	 this.test2 = this.test2 + 2.32;
	},
	
	//> public void b1()
	b1:function(){  
     this.test2 = 30;
	 this.test2++;
	 this.test2 = this.test2 + 2.32;
	},
	
	 b2:function(){  //< public void b2()
     this.test2 = 30;
	 this.test2++;
	 this.test2 = this.test2 + 2.32;
	},
	
	 c:function(){  //< public void c()
     this.test2 = 30;
	 this.test2 = this.test2 + "HA";
	 },
	
	 c1:function(){  //< public void c1()
     this.test2 = 30;
	 this.test2 = this.test2 + "HA";
	},
	
 	 c2:function(){  //< public void c2()
     this.test2 = 30;
	 this.test2 = this.test2 + "HA";
	}
})
.endType();