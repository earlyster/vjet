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
vjo.ctype('constructorAdvisor.ParentType')
.needs('ActiveXObject')
.props({
  sprop1 : 10,
  sprop2 : 12,
  sfun1 : function() {
  	
  }
})
.protos({
  prop1 : 12,
  prop2 : 12,
  fun1 : function() {
  	
  }
})
.endType();