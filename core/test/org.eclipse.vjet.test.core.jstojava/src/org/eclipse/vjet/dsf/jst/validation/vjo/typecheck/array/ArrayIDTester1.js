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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.array.ArrayIDTester1")
.protos({

    //> public int someMethod()
    someMethod:function(){
    	var myCars = new Array(3); //< int[]
        myCars[0] = 1;
        myCars[1] = 2;
        myCars[2] = 3;
        return myCars[0];
    },
    
     //> public String accessArrayElement2()
    accessArrayElement2:function(){
        var monthArray = new Array(4); //< String[]
        monthArray[0] = "Jan";
        monthArray[1] = "Twelth";
        monthArray[3] = "April";
        return monthArray[1];
    }
})
.endType();