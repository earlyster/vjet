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

vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.returntype.TypecheckReturnType3') //< public
.protos({
    //> Number a()
    a:function(){
        return this.b1();
   	 },
   	 
   	     //> Number a1()
    a1:function(){
        return this.b2();
   	 },


        //> public String b1()
        b1:function(){
                return "HA";
        },

        //> public Number b2()
        b2:function(){
                return "HA";
        }

})
.endType();