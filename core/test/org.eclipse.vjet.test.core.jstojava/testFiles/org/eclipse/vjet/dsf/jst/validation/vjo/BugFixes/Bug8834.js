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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8834') //< public

.props({
	
})
.protos({
	
	 	//>public void func3() 
        func3 : function(){
                var params = new Array(); //<Array 
                var x = 1; //< int
                var x = 2; //< int
                var x = ""; //< String
                params[0] = "a";
                params[1] = "b";
                for(var i in params){   } 
                for(var i in params){   }     
        }

	
})
.endType();