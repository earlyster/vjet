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
//snippet.itype.begin
//snippet.staticinit.begin
//snippet.props.begin
//snippet.protos.begin
vjo.itype('syntax.interfaces.ITypeExample')
//snippet.protos.end
.props({
	//> public int
	initialValue: undefined

	//functions not allowed in props cascade for VjO itype	
})
//snippet.props.end
//snippet.protos.begin
//snippet.staticinit.end
.protos ({
	//properties not allowed in protos cascade for VjO itype

	//> void foo()
	foo : vjo.NEEDS_IMPL,	
	
	//> public boolean bar1(int x)
	bar1 : vjo.NEEDS_IMPL,

	//> public boolean bar()
	bar : vjo.NEEDS_IMPL
})
//snippet.protos.end
//snippet.staticinit.begin
.inits(
	function(){
		/* use this section for static initialization */
		this.initialValue = 100;
	}
)
//snippet.protos.begin
.endType();
//snippet.staticinit.end
//snippet.protos.end
//snippet.itype.end
