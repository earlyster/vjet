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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.boolexpr.BoolExpr') //< public
.props({
	
	//> public void main(String... arguments)
	main:function(){
	
		var i = 1;//<int
		if(i == 1){
			
		}
		else if(i < 1){
			
		}
		else if(i <= 1){
			
		}
		else if(i > 1){
			
		}
		else if(i >= 1){
			
		}
		
		for(i=0; i<10; i++){
			
		}
		
		while(i < 20){
			i++;
		}
		
		var bTrue = true, bFalse = false;
		if(bTrue & bFalse){
			
		}
		else if(bTrue && bFalse){
			
		}
		else if(bTrue | bFalse){
			
		}
		else if(bTrue || bFalse){
			
		}
		else if(bTrue ^ bFalse){
			
		}
		
		var o = {};
		if(o === o){
			
		}
		else if(o !== o){
			
		}
		else if(o == o){
			
		}
		else if(o != o){
			
		}
		
		var str = "str"; //<String
		var conditionalStr = str.length > 0 ? str : "";
	}

})
.endType();

