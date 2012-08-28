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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5464")
.protos({
        ar : [], //< public Array
        da : new Date(),//<Date

        //>Array a1(String s1) 
        a1 : function(s1){
           var arr = new Array();//<Array
           var dat = new Date();//<Date
           return dat;
        }

})
.endType();
