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
vjo.ctype('org.eclipse.vjet.vjo.runtime.tests.metatype.jstests.StringTests') //< public
.needs('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.StringTestsData')
.needs('org.eclipse.vjet.vjo.runtime.tests.metatype.jstests.NativeTypesTester') 
.needs('vjo.reflect.Field')
.needs('vjo.reflect.Method')
.props({
	//>public void main() 
	main : function(){
		this.vj$.NativeTypesTester.testNativeType(this.vj$.StringTestsData.clazz , "String"); 
	}
})
.endType();


