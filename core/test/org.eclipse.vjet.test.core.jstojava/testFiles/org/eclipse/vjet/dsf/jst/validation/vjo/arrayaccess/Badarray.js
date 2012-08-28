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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.arrayaccess.BadArray").props({
  	
  	//> public void a()
  	a:function(){
        var pros = new String["1", 2, 23.42, true];
    },

    //> public void a1()
    a1:function(){
        var pros = new int[2]{1,2};
    },

        //> public void a2()
    a2:function(){
        var pros = new String[1]{"1", '2'};
    },

    //> public void a3()
    a3:function(){
        var pros = new double[1]{10,20.0};
    }
})
.inits(function(){})
.endType();