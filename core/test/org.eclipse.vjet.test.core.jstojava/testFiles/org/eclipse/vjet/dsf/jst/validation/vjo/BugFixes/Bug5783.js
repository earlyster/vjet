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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5783")
.props({
    d:null, //< Object
    DoIt:
vjo.ctype() //< public
    .protos({
        D:
vjo.ctype() //< public
        .inherits('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5783')
        .protos({
            d:null, //< Object
            //> public void s()
            s:function(){
                var v2=this.s();
                var v=this.s();
            }
        })
        .endType()
    })
    .endType()
})
.protos({
    //> public void testFunc(String arg,String arg1)
    //> protected void testFunc(String arg)
    //> public void testFunc()
    testFunc:function(arg,arg1){
    }
})
.inits(function(){
    var myA=this;
})
.endType();
