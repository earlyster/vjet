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
vjo.ctype('org.eclipse.vjet.vjo.runtime.tests.section.globals.Globals')
.globals({
	G4 : 'hello',
	G5 : 10
	
})
.inits(function(){
	vjo.sysout.println(G4);
	assertEquals('hello',G4);
	vjo.sysout.println(G5);
})
.endType();
