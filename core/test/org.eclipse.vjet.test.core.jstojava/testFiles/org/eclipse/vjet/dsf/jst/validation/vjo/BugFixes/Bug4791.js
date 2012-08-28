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
String.prototype.customMethod = function(){};

vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug4791') //< public
.props({
        foo :function(){
                var a = "ABC";//<String
                a.customMethod();
        },
        
        init: function(){
                var txt = "Hello World";//<String
                var h = txt.has("Hello");
                if(!h){

                }
        }
        
})
.endType();
