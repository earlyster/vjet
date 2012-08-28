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
vjo.ctype('engine.override.ABase') //< public abstract
.props({

	//> public void pubStatAbstFunc()
	pubStatAbstFunc : vjo.NEEDS_IMPL,
	
	//> public void pubStatFunc() 
	pubStatFunc : function(){
	
	}
  
})
.protos({
	
	//> public void pubAbstFunc()
	pubAbstFunc : vjo.NEEDS_IMPL,
	
	//> public void pubFunc() 
	pubFunc : function(){
		
	},
	
	//> public final void pubFinalFunc() 
	pubFinalFunc : function(){
		
	},
	
	//>private void pvtFunc() 
	pvtFunc : function(){
		
	}
})
.endType();