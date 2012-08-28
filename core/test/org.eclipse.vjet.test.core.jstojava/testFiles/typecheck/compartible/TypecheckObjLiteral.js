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
vjo.ctype('typecheck.compartible.TypecheckObjLiteral') //< public
//> needs(typecheck.compartible.TypecheckOtype)
.protos({
	
    main:function(){
		var normalObj = new Object();//<Object
		var objLiteral = {};//<ObjLiteral
		
		normalObj = objLiteral;//it's ok
		objLiteral = normalObj;//disallowed
		
		var anotherObjLiteral = {};//<ObjLiteral
		objLiteral = anotherObjLiteral;//it's ok
		anotherObjLiteral = objLiteral;//it's ok
		
		var ol = null;//<TypecheckOtype.ol
		ol = objLiteral;//assign failure
		objLiteral = ol;//it's ok
	}
})
.endType();