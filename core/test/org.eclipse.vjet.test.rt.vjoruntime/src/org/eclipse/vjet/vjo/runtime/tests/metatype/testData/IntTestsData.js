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
vjo.ctype('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.IntTestsData') //< public
.needs('vjo.reflect.Modifier')
.needs('vjo.TypeMetadata')
.props({

    staticFieldInt01 : null,//< public int
    staticFieldInt02 : null, //< public int
    
    //>public constructs()
    staticMethodInt01 : function(){},
    staticMethodInt02 : function(){}
    
})
.protos({

    instanceFieldInt01 : null ,
    instanceFieldInt02 : null ,
    
    instanceMethodInt01 : function(){},
    instanceMethodInt02 : function(){},
    
    //>public constructs()
    constructs : function(){
    	
    }  
    
})
.endType();

vjo.meta.load('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.IntTestsData', 
function () {
	var data = 
	{
		type : ['org.eclipse.vjet.vjo.runtime.tests.metatype.testData.IntTestsData', vjo.reflect.Modifier.PUBLIC],
		
		fields : [
			['staticFieldInt01', "int" , vjo.reflect.Modifier.PUBLIC | vjo.reflect.Modifier.STATIC ],
			['staticFieldInt02',  'int', vjo.reflect.Modifier.PRIVATE | vjo.reflect.Modifier.STATIC ],
			['instanceFieldInt01', "int" , vjo.reflect.Modifier.PUBLIC | vjo.reflect.Modifier.STATIC ],
			['instanceFieldInt02', "int" , vjo.reflect.Modifier.PUBLIC | vjo.reflect.Modifier.STATIC ]
		],
		
		methods : [
			['staticMethodInt01',['int'], "int" , vjo.reflect.Modifier.PUBLIC | vjo.reflect.Modifier.STATIC ],
			['staticMethodInt02',['int'] , 'int', vjo.reflect.Modifier.PRIVATE | vjo.reflect.Modifier.STATIC ],
			['instanceMethodInt01',['int'], "int" , vjo.reflect.Modifier.PUBLIC | vjo.reflect.Modifier.STATIC ],
			['instanceMethodInt02',['int'] ,"int" , vjo.reflect.Modifier.PUBLIC | vjo.reflect.Modifier.STATIC ]
		],
		
		constructors : [
			[[], vjo.reflect.Modifier.PUBLIC]
		]
		};
		return data;
	}
);