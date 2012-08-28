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
vjo.ctype('access.scope.defaultModifier.StaticDefaultUser7')
.needs('access.scope.protectedModifier.ProtectedPerson1')
.props({
	//> public void main(String[] args)
	main : function(args)
	{
		vjo.sysout.println(this.vj$.ProtectedPerson1.getX());
		vjo.sysout.println(this.vj$.ProtectedPerson1.x);
	}
})
.endType();