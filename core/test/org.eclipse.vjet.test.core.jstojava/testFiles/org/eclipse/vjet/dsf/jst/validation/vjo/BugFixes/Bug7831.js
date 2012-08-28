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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug7831')
.props({
        prop1:10,
        //>public void foo(String s, String s2) 
        foo : function(s,s2){
        	if (typeof s != 'undefined' 
        && typeof s2 != 'undefined' 
        && !vjo.dsf.assembly.VjClientAssembler.bBodyLoaded) {
        	}
   }
})
.endType();

