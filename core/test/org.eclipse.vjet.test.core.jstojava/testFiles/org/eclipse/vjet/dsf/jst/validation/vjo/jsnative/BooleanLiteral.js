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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.jsnative.BooleanLiteral")
.props({
	 //>public void doIt() 
     doIt : function(){
             var v = Boolean(true);//<Boolean
             var z = v.valueOf(); //<boolean
             var z1 = v.valueOf(); //<<boolean
             var z2 = v.valueOf(); //<< ; WRONG ERROR

             var a = true; //<boolean
             var a1 = false; //<boolean

     }

})
.endType();