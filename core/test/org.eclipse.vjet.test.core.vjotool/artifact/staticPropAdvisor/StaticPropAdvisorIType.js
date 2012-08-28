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
vjo.itype('staticPropAdvisor.StaticPropAdvisorIType')
.props({
  siprop1 : 25,
  siprop2 : "Test"
})
.protos({
  piFunction1 :  function (arg1) {},
  
  piFunction2 :  function (arg1, arg2) {}
})
.endType();