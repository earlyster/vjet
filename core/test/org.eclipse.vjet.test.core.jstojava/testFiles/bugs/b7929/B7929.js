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
vjo.ctype('bugs.b7929.B7929') //< public
.protos({
    //> String foo()
    foo:function(){
        return "foo";
    },
    //> private String foo()
    foo2:function(){
        return "foo";
    },
    //> private String foo()
    foo3:function(){
        return "foo";
    }
})
.endType();
