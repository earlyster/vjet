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
vjo.ctype('comment.InnerTypeComment') //< public
//>needs(comment.Type1)
//>needs(comment.Type2)
.props({
	//>private final InnerTypeComment.StaticInnerType1
	StaticInnerType1:vjo.ctype()
	.props({
		staticCount: 1.1 //<final double
	})
	.protos({
		//>public final Type1 hi(final Type2 type2)
		hi : function(type2){
			var t = type2;//<<Type1
			return t;
		},
		//>Type::Object run()
		run : function(){
			return Object;
		}
	}).endType(),
	//>InnerTypeComment.StaticInnertType2
	StaticInnerType2:vjo.ctype()
	.props({
		
	})
	.protos({
		
	})
	.endType()
})
.protos({
	//>protected final InnerTypeComment.InnerType
	InnerType:vjo.ctype()
	.protos({
		count: 12, //<long
		//>protected void foo(final Type::Type1 t1)
		foo : function(t1){

		}
	}).endType()
})
.endType();