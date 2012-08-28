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
vjo.ctype('ownertype.COuter') //< public
.protos({
    CInner1:vjo.ctype() //< public
    .protos({
        //> public void foo1()
        foo1:function(){
        }
    })
    .endType(),
    CInner2:vjo.ctype() //< public
    .protos({
    	//> public void foo2()
        foo2:function(){
        	
        },
        CInnerInner2:vjo.ctype() //< public
        .protos({
            //> public void foo2()
            foo2:function(){
            }
        })
        .endType()
    })
    .endType(),
    //> public void foo()
    foo:function(){
    }
})
.endType();