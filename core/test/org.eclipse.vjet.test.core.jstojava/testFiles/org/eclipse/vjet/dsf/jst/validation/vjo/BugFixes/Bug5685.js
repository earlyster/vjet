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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5685")
.props({
	staticProp1: "test",//< public String
	staticProp2: "test",//< public final String
	boolProp: true, //<boolean
	
	staticFunc1: function(s1, s2){//< public String staticFunc1(String, String)
		vjo.sysout.println("object identity is preserved");
		
		{
			if(true){
			
			}
		}
		
		return this.vj$.Bug5685.staticProp1;
	}
})
.endType();