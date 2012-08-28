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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug3942') //< public
.props({
 //> public void main(String[] args)
	 main: function() {
	 	var x = 10; //<Number
	 	var y = 20; //<Number
	 	var a = new Date(); //<Date
	 	var z = x + y;
 		vjo.sysout.println("hello2");
 	},
 	//> public boolean doIt(String msg)
 	doIt:function(msg){
 		alert(msg); 
 		return false;
 	},
 	 
 	doIt3:function(){
 		this.b;	
 	}
 	
.protos({
	address:"",

	//> public Date a(String,String,String)
	a:function(xx,y,z){
		this.d;
		var x = new Date(); //<Date
//		window.open(url,windowName,features,replace);
		this.b();
		this.address= "test";
		return x;
		
	},
	//>public void doIt2(String msg)
	doIt2:function(msg){
		
	},
	
	b:function(){
		
	}

})
.inits(function(){
	var x = 10;//<Number
	alert(x);
})
.endType();