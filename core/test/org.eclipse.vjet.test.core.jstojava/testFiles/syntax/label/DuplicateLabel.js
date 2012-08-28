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
vjo.ctype('syntax.label.DuplicateLabel')
.props({
	main: function(){
		var i = 0; //<Number
		var j = 0; //<Number
		var len = 10; //<Number
		
		LABEL_1:
		while(i < len){
			LABEL_1:
			while(j < len){
				vjo.sysout.println(i + ', ' + j);
			}
		}
		
		LABEL_2:
		for(i = 0; i < len; i++){
			
		}
	}
})
.endType();