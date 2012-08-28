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
//this error test is more complicated as our references will reside in constructor calls
//or our referenced types will be meta types
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.needs.ActiveNeededInConstruction")
//>needs(org.eclipse.vjet.dsf.jst.validation.vjo.needs.ActiveNeeded)
.props({
	main: function(){
		//this line should be an error
		new org.eclipse.vjet.dsf.jst.validation.vjo.needs.ActiveNeeded();
	}
})
.endType();