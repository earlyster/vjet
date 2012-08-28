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
vjo.itype('syntax.interfaces.ITypeMethodsExamples4')
.inherits('syntax.interfaces.ITypeStaticMembers1')
.props({
})
.protos ({
	//> private void foo()
	foo: vjo.NEEDS_IMPL,	//should use key word public

	//> public boolean bar(int x)
	bar: vjo.NEEDS_IMPL	
})
.endType();