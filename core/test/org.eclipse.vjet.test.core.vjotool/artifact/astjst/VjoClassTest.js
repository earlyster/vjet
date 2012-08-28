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
vjo.ctype('astjst.VjoClassTest') //< public
.props({
	//>public void main(String... args) 
	main : function(args){
		var obj = new this.vj$.VjoClassTest();
		var oClass = obj.getClass(); //< vjo.Class
		
		var constructs = oClass.getConstructors(); //< vjo.reflect.Constructor[]
		var fields = oClass.getFields(); //< vjo.reflect.Field[]
		var methods = oClass.getMethods(); //< vjo.reflect.Method[]
		var declFields = oClass.getDeclaredFields(); //< vjo.reflect.Field[]
		var declMethods = oClass.getDeclaredMethods(); //< vjo.reflect.Method[]
		var annotations = oClass.getAnnotations(); //< Object[]
		var interfaces = oClass.getInterfaces(); //< Object[]
		var vjotype = oClass.getVjoType(); //< vjo.reflect.Type
		var name = oClass.getName(); //< String
		var simpleName = oClass.getSimpleName(); //< String
		var pkgName = oClass.getPackageName(); //< String
		var isInterface = oClass.isInterface(); //< boolean
		var str = oClass.toString(); //< String
		var modifiers = oClass.getModifiers(); //< int
		
		var oClass1 = vjo.Class.create("Test","ctype"); //< vjo.Class
		var isInst = oClass.isInstance(oClass1); //< boolean
	}
})
.protos({
	
})
.endType();