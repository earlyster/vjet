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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.TypeCheck5') //< public
.needs("org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.TypeCheck3")
.props({
        //>public void bar() 
        bar : function(){
             var sample1;//< TypeCheck5
             var sample2;//< TypeCheck3
             sample1 = sample2;
        }
})

.endType();