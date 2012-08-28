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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5515")
.props({
	//>public HTMLFormElement foo(String)
	//>public HTMLFormElement foo(HTMLFormElement)
	foo: function(ref){
		if(typeof(ref) == "string"){
			var rtnVal = document.forms[ref];//<HTMLFormElement
			return rtnVal;
		}
		else{
			return ref;
		}
	}
})
.endType();