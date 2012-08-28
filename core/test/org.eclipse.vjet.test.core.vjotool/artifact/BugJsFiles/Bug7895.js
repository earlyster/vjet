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
vjo.ctype('BugJsFiles.Bug7895') //< public
.protos({
	//>private boolean method1()
	method1 : function() { 
	        var x = document.createElement("form"); //<HTMLFormElement
	        var y = x.;
	        return false;
	}

})
.endType();