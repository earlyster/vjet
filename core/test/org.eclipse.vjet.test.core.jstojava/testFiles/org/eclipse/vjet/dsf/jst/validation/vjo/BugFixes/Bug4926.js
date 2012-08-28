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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug4926') //< public
.props({
        x: 0,
        //> public void foo()
        foo: function() {

        },

        //> public void bar()
        //> public void bar(String)
        bar: function(arg) {
        }
})
.protos({
        //>public void doIt()
        doIt:function(){

        }
})
.inits(function(){
        var x = 12;
        var y;
        var z;
        var foo;
        var fooooo;
        var ddd ={};
})
.endType();
