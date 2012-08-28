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
vjo.ctype('syntax.generic.superType.SubType29') //< public
//>needs(syntax.generic.Collection)
//>needs(syntax.generic.ArrayList)
//>needs(syntax.generic.AbstractList)
.props({  
})
.protos({
	
	//>public void test(Collection<? super ArrayList>) 
	test : function(c){
		var s1 = null;//<vjo.Object         
		this.sort(c);         
	},              
	
	//>public void sort(Collection<? super AbstractList>) 
	sort : function(c){
		  
	}  
}) 
.endType();