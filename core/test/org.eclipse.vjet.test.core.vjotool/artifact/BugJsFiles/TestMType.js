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
vjo.mtype('BugJsFiles.TestMType') //<public
.protos({
  pMprop1 : 25, //< int
  pMprop2 : "Test", //< String
  
  pMFunction1 :  function () { //< public void pMFunction1()
   	
  },

  pMFunction2 :  function () { //< public void pMFunction2()
	
  }
})
.props({
  sMprop2 : "Test", //< String

  sMFunction1 :  function () { //< public void sMFunction1()
 	
  }
})
.endType();