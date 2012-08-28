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
vjo.ctype('syntax.global.globalType.GlobalType') //< public
.props({
  
})
.protos({
//>public void foo() 
foo : function(){
	alert(arguments);
	var s=new Date();
	new Arguments();
	 new Array();
     new Boolean();
     new Date();
     new Enumerator();
     Function.apply(null);
     Math.abs();
     Number.MAX_VALUE;
     new Object();
     new RegExp();
     new String();

}
})
.endType();