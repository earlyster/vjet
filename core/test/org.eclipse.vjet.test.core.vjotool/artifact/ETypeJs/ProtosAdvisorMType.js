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
vjo.mtype('ETypeJs.ProtosAdvisorMType') 
.needs('ETypeJs.ETypeTest')
.protos({
  pMprop1 : 25,
  pMprop2 : "Test",
  
  pMFunction1 :  function () {
   	
  },

  pMFunction2 :  function () {
	
  }
})
.props({
  sMprop2 : "Test",

  sMFunction1 :  function () {
 	
  }
})
.endType();