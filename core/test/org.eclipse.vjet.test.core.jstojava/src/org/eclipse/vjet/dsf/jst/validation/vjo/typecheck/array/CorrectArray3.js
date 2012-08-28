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

vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.array.CorrectArray3') //< public
.props({
    //> public void a()
    a:function(){
    	var pros = new Array(3);
    },
    
    //> public void a1()
    a1:function(){
	var pros = new Array("10","20","30");
    },
    
 	//> public void a2()
    a2:function(){
	var pros = new Array(10,20,30);
    }
    
})
.endType();