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
vjo.ctype('bugs.bug5884.BaseClient') //< public
.inherits('bugs.bug5884.Base')
.props({
        RR : "T" //<String
})
.protos({
    prop1 : 10, //< int
    prop2 : "Test", //< String

    testFunc : function(){//<public String testFunc()
        return "";
    },

    //>private String over()
    over : function(){
        var d = new Date();//<Date
        var day = d.getDay();//<Number
        return this.base.over();
    }
})
.endType();
