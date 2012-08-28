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
/* @com.ebay.dsf.resource.utils.CodeGen("VjoGenerator") */

vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.compatibletypes.typecheckCompartibleType5') //< public
.protos({
	
    //> Number a()
    a:function(){
   	 var test1;  //<  public String
     test1 = 20 + "HA";
     return test1;
    },
    
    
	b:function(){  //< public void b()
	 var test2;  //<  public int
	 test2 = 30;
	 test2 ++;
	 test2 = test2 + 2.32;
	},
	
	 c:function(){  //< public void c()
	 var test2;  //<  public int
     test2 = 30;
	 test2 = test2 + "HA";
	 }
})
.endType();