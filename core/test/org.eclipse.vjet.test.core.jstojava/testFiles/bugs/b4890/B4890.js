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
vjo.ctype('bugs.b4890.B4890') //< public

.props({
  
})
.protos({
 //>public void foo(int para1, int para2)
foo : function(para1, para2) {       
 this.foo2();
 
 vjo.sysout.println(this.ssf);
}

})
.endType();