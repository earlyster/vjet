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
vjo.ctype('test1') //< public
.needs('test2')
.inherits('Inheritance.A')
.satisfies('test1')
.protos({
    //> protected String getState()
    getState:function(){
    },
    f:function(param){
        with (this){
            assertEquals("boo called",this.vj$.WithTest.boo());
            assertTrue(typeof (th)) === "undefined");
               
        }
    }
})
.endType();
