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