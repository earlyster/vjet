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
vjo.ctype('syntax.generic.satisfies.Implement3') //< public Implement1<K>
.satisfies('syntax.generic.satisfies.Interface2')
//>needs(syntax.generic.Collection)
//>needs(syntax.generic.Comparator)
.props({  
	
})
.protos({
	
	//>public Comparator comparator(Collection<? super K>)
	comparator : function(s){
		return null;
	}

})
.endType();