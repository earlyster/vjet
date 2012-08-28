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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.rtnflow.RtnFlow') //< public
.props({
	
	//> public int main(String... arguments)
	main:function(){
	   if(true){
	   	return 1;
	   }
	   else if(true){
	   	if(false){
	   		return 2;
	   	}
	   	else{
	   		return 3;
	   	}
	   }
	   else{
	   	return 4;
	   }
	},
	
	//> public String f()
	f: function(){
		if(true){
			return "0";
		}
	},
	
	//> public String f2()
	f2: function(){
		if(true){
			return "1";
		}
		else if(true){
			return "2";
		}
	},
	
	//> public String f3()
	f3: function(){
		if(true){
			return "1";
		}
		
		if(false){
			return "2";
		}
		else{
			return "2";
		}
	}

})
.endType();

