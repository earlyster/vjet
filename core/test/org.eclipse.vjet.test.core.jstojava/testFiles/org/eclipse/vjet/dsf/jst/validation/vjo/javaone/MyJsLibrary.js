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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.javaone.MyJsLibrary') //< public
.props({
	
	//>private void(String,String)
	update:function(id, text){ 
		document.getElementById(id).innerHTML = text
	},
	
	//>public void echo(String)
	echo:function(id){
		var str = document.getElementById(id).innerHTML;
		vjo.sysout.println(str);
	}
	
})
.endType();