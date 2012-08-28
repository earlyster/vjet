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
vjo.ctype('org.eclipse.vjet.vjo.runtime.tests.section.globals.TypeB') //< public
.inherits('org.eclipse.vjet.vjo.runtime.tests.section.globals.BaseTypeA')
.globals({
	G4 : 'hello', //< String
	G5 : undefined //< Date
})
.props({
  
})
.protos({
	
})
.inits(function(){
	G1 = false ;
	if (G4 === 'hello') {
		G4 = 'goodbye' ;
		G5 = new Date('03/17/1980') ;
	}
	else {
		fail("G4 should be hello");
		G4 = 'goodbye' ;
		G5 = new Date('06/22/1981') ;		
	}
})

.endType();