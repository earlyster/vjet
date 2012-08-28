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
vjo.ctype('syntax.typeCast.DeclarationTypeCast') //< public
.props({
  
})
.protos({
//>public void foo() 
foo : function(){
	var inte = this;//<DeclarationTypeCast
	var stre = true;//<<boolean 
	inte = stre;
	var intvv = stre;//<<DeclarationTypeCast
	var s = this;//<Boolean
}
})
.endType();