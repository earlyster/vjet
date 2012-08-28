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
vjo.ctype('Integration.StringTest') //< public
.props({
  //>public void testFunc() 
  testFunc : function(){
  	var s = new String("This is String"); //< String 
  	s.big();
  }
})
.protos({

})
.endType();