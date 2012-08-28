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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug7715')
.props({
        prop1:10,
        //>public void foo(String s, String s1) 
        foo : function(a,si){
                var x = [this.prop1];
                var x2 = [this.prop2]; // (error case) expected error got
                var x3 = {a:this.prop1};
                var x4 = {a:this.prop2}; // (error case) expected error got
   }
})
.endType();
