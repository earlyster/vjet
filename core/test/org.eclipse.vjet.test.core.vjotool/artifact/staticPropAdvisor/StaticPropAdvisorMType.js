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
vjo.mtype('staticPropAdvisor.StaticPropAdvisorMType') 
.props({
  smprop1 : 25,
  smprop2 : "Test",
  
  smFunction1 :  function () {
   	
  },

  smFunction2 :  function () {
	
  }
})
.protos({
  pmprop2 : "Test",

  pmFunction1 :  function () {
 	
  }
})
.endType();