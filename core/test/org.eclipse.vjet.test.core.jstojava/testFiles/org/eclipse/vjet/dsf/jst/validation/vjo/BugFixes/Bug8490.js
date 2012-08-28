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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8490")
.props({
        //>public void main(String... args) 
        main : function(args){
                this.foo(); // expected error .. .runtime error will happen
                this.foo; // warning no runtime error - ok
                this().foo(); // expected error ... runtime error
                this().foo; // warning no runtime error - ok

        }
})
.protos({

})
.endType();
