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
vjo.ctype('vjoPro.samples.generics.GenericSample<T>')
.needs('vjoPro.samples.generics.TemplateSample')
.inherits('vjoPro.samples.generics.BaseGenericSample<T>')
.props({
	//> public void hello(T)
	hello: function(param){
		
	},
	
	main: function(){
		var sample = new this.vj$.GenericSample();//<GenericSample<TemplateSample>
		var param = new this.vj$.TemplateSample();//<TemplateSample
		
		var result = sample.bar(param);//<TemplateSample
		sample.foo(param);
		
		//var sample2 = this.vj$.GenericSample;//<Type::GenericSample<TemplateSample>
		//sample2.hello(param);
	}
})
.protos({
	//> public T bar(T)
	bar: function(param){
		return param;
	}
})
.endType();
