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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.jsnative.NativeTypes')
.props({
       //>public void foo(HTMLElement) 
        foo1 : function(e){

        },
        //>public void foo2(Array) 
        foo2 : function(e){

        },
        //>public void foo3(String) 
        foo3 : function(e){

        },
        //>public void foo4(HTMLDivElement) 
        foo4 : function(e){

        },
        //>public void foo5(Event) 
        foo5 : function(e){

        },
        //>public void foo6(Number) 
        foo6 : function(piVal){
                var v = piVal.toString(2);
        }
})
.endType();
