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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.jsnative.Jsnative')
.protos({
	a:function(){//<public void a()
		alert("sth");
		
		window.alert("sth2");
		
		Math.abs(-1);
		
		document.getElementById("someid");
		
		var dat = new Date();
		
		var len = dat.toString();
		
        //eval("alert('a')");
        
        var img = new Image();
        
        new Image();
        
        /*
        var opt = new Option("One","1",true,true);
        var anchor = document.getElementById("a");
        var b = anchor.options;
        var c = b.length;
        */
	},
	
	formRelated: function(){
		var form = document.forms["myform"]; 
		form.submit();
	},
	
	//>public void b(String, String)
	b: function(name, value){
		alert("hello:" + name + " value:" + value);
	},
	
	//>public void foo(String[]) 
    foo : function(urls){
        alert(urls.length);
    }
})
.inits(function(){
        var dec = parseInt("100",10); //<Number
        dec.toString(2);
})
.endType();