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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8780A")
.inherits("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8780")
.protos({
		//>public boolean func1(String str) 
        func1 : function(str){
                return false;
        }
})
.endType();
