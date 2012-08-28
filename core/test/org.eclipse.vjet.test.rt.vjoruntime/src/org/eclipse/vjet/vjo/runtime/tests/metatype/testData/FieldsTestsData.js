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
vjo.ctype('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.FieldsTestsData') //< public
.needs('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA')
.needs('vjo.reflect.Modifier')
.needs('vjo.TypeMetadata')
.props({

    staticFoo : null,//< public XTypeA
    
    staticBar : null, //< public vjo.Object
    
    staticBooyah : null// //< public int
})
.protos({
    //> public void instanceFoo()
    instanceFoo : null, //< vjo.Class

    //>public constructs()
    constructs : function(){
    	
    }
})
.endType();

vjo.meta.load('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.FieldsTestsData', 
function () {
	var data = 
	{
		type : ['org.eclipse.vjet.vjo.runtime.tests.metatype.testData.FieldsTestsData', vjo.reflect.Modifier.PUBLIC],
		
		fields : [
			['staticFoo', "org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA" , vjo.reflect.Modifier.PUBLIC | vjo.reflect.Modifier.STATIC ],
			['staticBar',  'vjo.Object', vjo.reflect.Modifier.PRIVATE | vjo.reflect.Modifier.STATIC ],
			['staticBooyah', 'int', vjo.reflect.Modifier.PROTECTED | vjo.reflect.Modifier.STATIC ],
			['instanceFoo', 'vjo.Class', vjo.reflect.Modifier.PUBLIC]
		],
		
		methods : [],
		
		constructors : [
			[[], vjo.reflect.Modifier.PUBLIC]
		]
		};
		return data;
	}
);