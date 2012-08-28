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
vjo.ctype('syntax.generic.superType.SubType25<T>') //< public
//>needs(syntax.generic.Set)
//>needs(syntax.generic.Collection)
.needs('syntax.generic.HashSet')
.props({  
})
.protos({
	
	//>public void test(Collection<String>) 
	test : function(c){
		var set = new this.vj$.HashSet()//<Set<String>
		var s1 = null;//<Collection<String>
		s1.removeAll(set);
	}
}) 
.endType();