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
/**/

vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.returntype.TypecheckReturnType1') //< public
.protos({
    //> Number a()
    a:function(){
        var x=10; //<Number
        x ="String";
    },
    
    //> public String a1()
    a1:function(){
        var x=10; //<Number
        return x;
    },
    
    //> public TypecheckReturnType1 b()
	b:function(){
		return new this.vj$.TypecheckReturnType1();
	}
})
.endType();