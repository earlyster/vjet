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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.overriden.Parent")
.protos({
	
	//> public abstract void doIt()
	doIt: vjo.NEEDS_IMPL,
	
	//> public final void sayIt()
	sayIt: function(){
	},
	
	//> public void playIt()
	playIt: function(){
		//shouldn't have narrower visibility when being overriden
	}
})
.endType();