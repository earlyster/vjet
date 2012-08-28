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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.rtnflow.NoRtn') //< public
.props({
        foo: function() {
                var a = true; //<boolean 
        },
        
        //>public void foo1()
        foo1: function() {
                var a = true; //<boolean 
        },
        
        //>public void foo2()
        foo2: function() {
                var a = true; //<boolean 
        }
})
.endType();