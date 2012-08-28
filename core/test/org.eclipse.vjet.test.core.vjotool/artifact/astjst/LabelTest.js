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
vjo.ctype('astjst.LabelTest') //< public
.protos({
	//>public void func1() 
	func1 : function(){
		yoohoo:{
	        alert("before");
	        for (var i = 0; i < 2; i++) {
	            for (var j = 0; j < 2; j ++) {
	                alert(i);
	                break yoohoo;
	            }
	        }
        	alert(2);
		}
	}
})
.endType();