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
vjo.ctype('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.BootstrappingTestsData') //< public
.needs('vjo.reflect.Modifier')
.needs('vjo.TypeMetadata')
.props({

    staticFoo : null //< public XTypeA

})
.protos({
    //>public constructs()
    constructs : function(someParam){}
})
.endType();

vjo.meta.load('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.BootstrappingTestsData', 
function () {
	var data = 
	{
		type : ['org.eclipse.vjet.vjo.runtime.tests.metatype.testData.BootstrappingTestsData', vjo.reflect.Modifier.PUBLIC],
		
		fields : [
			['staticFoo', "org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA" , vjo.reflect.Modifier.PUBLIC | vjo.reflect.Modifier.STATIC ]
		],
		
		methods : [],
		
		constructors : [
			[["org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA"], vjo.reflect.Modifier.PUBLIC]
		]
		};
		return data;
	}
);