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
vjo.ctype('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA') //< public
.props({

  //>public void staticFoo() 
  staticFoo : function(){
  	
  },
  //>protected void staticBar() 
  staticBar : function(){
  	
  }
})
.protos({
	//>public void instanceFoo() 
	instanceFoo : function(){
		
	},
	//>protected void instanceBar() 
	instanceBar : function(){
		
	},
	
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

vjo.meta.load('org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA', 
function () {
	var data = 
	{
		type : ['org.eclipse.vjet.vjo.runtime.tests.metatype.testData.XTypeA', vjo.reflect.Modifier.PUBLIC],
		
		fields : [],
		
		methods : [
			['staticFoo', [], 'void', vjo.reflect.Modifier.PUBLIC | vjo.reflect.Modifier.STATIC ],
			['staticBar', [], 'void', vjo.reflect.Modifier.PROTECTED | vjo.reflect.Modifier.STATIC ],
			['instanceFoo', [], 'void', vjo.reflect.Modifier.PROTECTED],
			['instanceBar', [], 'void', vjo.reflect.Modifier.PROTECTED]
		],
		
		constructors : [
			[[], vjo.reflect.Modifier.PUBLIC],
			[['String', 'int'], vjo.reflect.Modifier.PUBLIC ]
		]
		};
		return data;
	}
);