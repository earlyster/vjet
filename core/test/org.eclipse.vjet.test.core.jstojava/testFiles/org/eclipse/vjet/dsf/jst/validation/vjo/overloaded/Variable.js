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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.overloaded.Variable') //< public
.props({
	
	//> public void main(String... arguments)
	main:function(){
	    var x=new this.vj$.Variable(); //<Variable
	    var y=new this.vj$.Variable("one"); //<Variable 
	    var z=new this.vj$.Variable("one", "two"); //<Variable
	    
	    x.doIt();
	    y.doIt(1);
	    z.doIt(1, 2);
	}

})
.protos({
	name: "", //<private String
		
	//> public constructs(String... name)
	constructs:function(name){
	    this.name=name;
	},
	
	
	//> public String doIt(int... command)
	doIt: function(command){
		return "command";
	}
})
.endType();

