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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.javaone.J4JType') //< public
.protos({
    m_data:null, //< private final ObjLiteral
    //> public constructs(ObjLiteral data)
    constructs:function(data){
        this.m_data=data;
        data["k2"]="VJET";
    },
    //> public Array modify(Array arr)
    modify:function(arr){
        vjo.sysout.println(arr.toString());
        arr.reverse();
        arr.pop();
        arr.push(this.m_data["k1"]);
        arr.push(this.m_data["k2"]);
        arr.concat([1,2,3]);
        vjo.sysout.println(arr.toString());
        return arr;
    }
})
.endType();