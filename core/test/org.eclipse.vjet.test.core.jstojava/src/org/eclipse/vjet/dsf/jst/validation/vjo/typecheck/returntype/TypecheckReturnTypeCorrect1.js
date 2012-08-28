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

vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.returntype.TypecheckReturnTypeCorrect1') //< public
.protos({
	
	x : undefined, //< public int
	
	s_name : undefined, //< public String
	
	s_sex : undefined, //< public String

    //> int a()
    a:function(){
        return 10;
    },
    
    //> public String a1()
    a1:function(){
        return "HA"
    }
    
})
.endType();