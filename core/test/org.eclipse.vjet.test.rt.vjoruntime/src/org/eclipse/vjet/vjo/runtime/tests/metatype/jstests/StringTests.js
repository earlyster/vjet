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


