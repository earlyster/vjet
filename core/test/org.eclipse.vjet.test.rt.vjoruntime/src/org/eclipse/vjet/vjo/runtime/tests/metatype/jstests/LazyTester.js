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
vjo.ctype('org.eclipse.vjet.vjo.runtime.tests.metatype.jstests.LazyTester') //< public
.needs('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA')
.props({

	compareWithXTypeA : function(classObject ){
		if(!((classObject === this.vj$.XTypeA.clazz) && (classObject === org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA.clazz ) )){
        	throw "Class Instance is not singleton , [param1:"+classObject+"]&[param2:"+this.vj$.XTypeA.clazz+"]&[param2:"+org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA.clazz+"]";
        }
	}
})
.endType();


