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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.rt.ctype.BadCTypeB")
.protos({

	//>private void privateInstanceNotInvoked()
	privateInstanceNotInvoked: function(){
		this.privateInstanceButInvoked();
	},
	
	//>protected void protectedInstanceNotInvoked()
	protectedInstanceNotInvoked: function(){
	},
	
	//>public void protectedInstanceNotInvoked()
	publicInstanceNotInvoked: function(){
	},
	
	defaultInstanceNotInvoked: function(){
	},
	
	//>private void privateInstanceButInvoked()
	privateInstanceButInvoked: function(){
	}
})
.props({
	//>private void privateStaticNotInvoked()
	privateStaticNotInvoked: function(){
		this.privateStaticButInvoked();
	},
	
	//>protected void protectedStaticNotInvoked()
	protectedStaticNotInvoked: function(){
	},
	
	//>public void protectedStaticNotInvoked()
	publicStaticNotInvoked: function(){
	},
	
	defaultStaticNotInvoked: function(){
	},
	
	//>private void privateStaticButInvoked()
	privateStaticButInvoked: function(){
	}
})
.endType();