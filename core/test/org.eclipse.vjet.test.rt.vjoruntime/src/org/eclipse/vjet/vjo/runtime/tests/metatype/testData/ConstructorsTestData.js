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
vjo.ctype('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.ConstructorsTestData') //< public
.needs('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA')//< needs org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA
.needs('vjo.TypeMetadata')//< needs vjo.TypeMetadata
//< needs vjo.Class
.props({
    //> void foo()
    foo:function(){
    },
    //> vjo.Class bar()
    bar:function(){
        return this.clazz;
    }
})
.protos({
    str:null, //< private String
    self:null, //< private ConstructorsTestData
    //> public constructs()
    //> public constructs(String str,int integer)
    constructs:function(){
        if(arguments.length===0){
            this.constructs_0_0_ConstructorsTestData_ovld();
        }else if(arguments.length===2){
            this.constructs_2_0_ConstructorsTestData_ovld(arguments[0],arguments[1]);
        }
    },
    //> private constructs_0_0_ConstructorsTestData_ovld()
    constructs_0_0_ConstructorsTestData_ovld:function(){
    },
    //> private constructs_2_0_ConstructorsTestData_ovld(String str,int integer)
    constructs_2_0_ConstructorsTestData_ovld:function(str,integer){
    }
})
.endType();


vjo.meta.load('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.ConstructorsTestData', 
	function () {
		var d = 
		{
			type : ['org.eclipse.vjet.vjo.runtime.tests.metatype.testData.ConstructorsTestData', vjo.reflect.Modifier.PUBLIC],
			
			fields : [
				['str', 'String', vjo.reflect.Modifier.PRIVATE],
				['self', 'org.eclipse.vjet.vjo.runtime.tests.metatype.testData.ConstructorsTestData', vjo.reflect.Modifier.PRIVATE]
			],
			
			methods : [
				['foo', [], 'void', vjo.reflect.Modifier.PUBLIC],
				['bar', [], 'Class', vjo.reflect.Modifier.PUBLIC]
			],
			
			constructors : [
				[['org.eclipse.vjet.vjo.runtime.tests.metatype.testData.ConstructorsTestData','org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA'], vjo.reflect.Modifier.PUBLIC],
				[['String', 'org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA'], vjo.reflect.Modifier.PUBLIC]
			]
		};
		return d;
	}
);
