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
vjo.ctype("org.eclipse.vjet.dsf.vjolang.feature.tests.bug5515")
.props({
	 	//> public HTMLFormElement foo(String); 
        //> public HTMLFormElement foo(HTMLFormElement);
        foo : function(ref){
                if (typeof(ref) == "string"){
                        return document.forms[ref];
                }else{
                        return ref;
                }       
        },
		//>public void f(String x);
		//>public void f(Number x);
		//>public void f(Date x);
		f:function(x){
			x.length
			x.charCodeAt(3);
			x.toFixed();
			x.getDate();
			
		}

           
})
.inits( function() {
       var myA = this; //< bug5172
       var myB = myA.foo(); //<String
})
.endType(); 