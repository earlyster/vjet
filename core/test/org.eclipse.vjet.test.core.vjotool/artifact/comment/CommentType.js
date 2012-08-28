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
vjo.ctype('comment.CommentType') //< public
.needs('comment.Type1')
//<needs(comment.Type2)
.props({
	m_prop : "",//<public String 
	
	//>public void main(String... args)
	main : function(args){
		var v = new this.vj$.Type1();//<Type1;
		var v1 = null;//<type::Type2
	}
})
.protos({
	
})
.endType();