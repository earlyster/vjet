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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug4690') //< public
.props({
  //>public void doIt() 
  //>public void doIt(String)
  //>public void doIt(int)
  doIt : function(arg){
        var x = null; //<String
        var y = { a: "test", c:"10" };
        this.doIt2(y);
        var z = y.r; // false positive dynamic property should not be error
        var z3 = y['r']; // ok
        var z1 = y.a; // ok
        var z2 = y['a']; // ok


  },
  //>public void doIt2(Object)
  doIt2:function(o){
        o.r = "test";
  }
})
.endType();
