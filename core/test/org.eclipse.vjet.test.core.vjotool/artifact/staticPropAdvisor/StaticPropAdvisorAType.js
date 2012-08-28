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
vjo.ctype('staticPropAdvisor.StaticPropAdvisorAType') //<public abstract
.props({
  saprop1 : 25,
  saprop2 : "Test",

  saFunction1 :  function () {
 	
  },

  saFunction2 :  function () {
	
  }
})
.protos({
  paprop2 : "Test",

  paFunction1 :  function () {
	
  }
})
.endType();