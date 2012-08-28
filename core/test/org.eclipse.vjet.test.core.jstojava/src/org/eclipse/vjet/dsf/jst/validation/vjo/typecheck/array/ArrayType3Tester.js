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

vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.array.ArrayType3Tester') //< public
.props({
    //> public void a()
    a:function(){
    	var v1 = new Array(1,2,3,4);
    },
    
    //> public void a1()
    a1:function(){
    	var v1 = new Array("v1","v2");
    },
    
    //> public Number a2()
    a2:function(){
    	var v1 = new Array("v1",20, true);
    }
})
.endType();