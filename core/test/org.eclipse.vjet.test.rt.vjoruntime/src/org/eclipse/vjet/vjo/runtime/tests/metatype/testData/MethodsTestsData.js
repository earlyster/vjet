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
vjo.ctype('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.MethodsTestsData') //< public
.needs('vjo.reflect.Modifier')
.needs('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA')
.needs('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeB')
.needs('vjo.TypeMetadata')
.props({
    //> public XTypeA staticFoo(String string,int integer,XTypeB typeB)
    staticFoo:function(string,integer,typeB){
    },
    //> private void staticBar()
    staticBar:function(){
    },
    //> protected void staticBooyah()
    staticBooyah:function(){
        this.staticBar();
    }
})
.protos({
    //> public void instanceFoo()
    instanceFoo:function(){
    },
    //> private void instanceBar()
    instanceBar:function(){
    },
    //> protected void instanceBooyah()
    instanceBooyah:function(){
        this.instanceBar();
    },
    
    //>public constructs()
    constructs : function(){
    	
    }
})
.endType();

vjo.meta.load('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.MethodsTestsData', 
function () {
	var data = 
	{
		type : ['org.eclipse.vjet.vjo.runtime.tests.metatype.testData.MethodsTestsData', vjo.reflect.Modifier.PUBLIC],
		
		fields : [],
		
		methods : [
			['staticFoo', ["String","int","org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeB"], 'org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA', vjo.reflect.Modifier.PUBLIC | vjo.reflect.Modifier.STATIC ],
			['staticBar', [], 'void', vjo.reflect.Modifier.PRIVATE | vjo.reflect.Modifier.STATIC ],
			['staticBooyah', [], 'void', vjo.reflect.Modifier.PROTECTED | vjo.reflect.Modifier.STATIC ],
			
			['instanceFoo', [], 'void', vjo.reflect.Modifier.PUBLIC],
			['instanceBar', [], 'void', vjo.reflect.Modifier.PRIVATE],
			['instanceBooyah', [], 'void', vjo.reflect.Modifier.PROTECTED]
		],
		
		constructors : [
			[[], vjo.reflect.Modifier.PUBLIC]
		]
		};
		return data;
	}
);