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
vjo.ctype('syntax.continuebreak.continuebreak1')
.props({
 
	//> public void main(String... args)
	main: function(args) {
		 vjo.sysout.println("DD"+arguments.length);
		 
		 var i1 = 30; //<Number
			
		 oo :  for(var i1 = 0;i1 < 30; i1++){
		  	 if(i1 == 20){
		  		continue oo;
		  	 }else if(i1 == 22){
		  		break oo; 	
		  	 }else{
		  		vjo.sysout.println("DD"+i1);
		  	 }
		  }
        
	 }

})
.protos({

})
.endType();