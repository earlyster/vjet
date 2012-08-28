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

vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.array.ArrayType1Tester') //< public
.props({
    //> public void a()
    a:function(){
    	var pros = ["SHSH", 2, 23.42, true]; //< Array
    },
    
    //> public void a1()
    a1:function(){
    	var pros = ["1", 2];
    },
    
 	//> public void a2()
    a2:function(){
    	var pros = ["1", '2']; //<String[]
    },
    
    //> public void a3()
    a3:function(){
    	var pros = ["1", '2', true];
    },
    
    //> public void a5()
    a5:function(){
    	var pros = ["1", 23.02 ];
    }
})
.endType();