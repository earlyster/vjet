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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.ex.ValidationEx3') //< public
.needs('org.eclipse.vjet.dsf.jst.validation.vjo.ex.VallidationEx4')
.props({
 
	//> public void main(String... arguments)
	main: function() {
 		var z = new this.vj$.VallidationEx4("Hello"); //<VallidationEx4

		var x = new this.vj$.VallidationEx4();//<VallidationEx4

		var y = new this.vj$.VallidationEx4();//<VallidationEx4

	} 
})
.protos({
	name:"",//<String

	//>public constructs(String name)
	constructs:function(name){
		this.name = name;
	}
})
.endType();