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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8455")
//>needs org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8450
.props({
      //> public void test(Object)
      test: function (pReq){
		alert(org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8450.clazz);
		
		var o1 = new this.vj$.Bug8450();//<Bug8450
		
		var o2 = new org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8450();//<Bug8450
      }
})
.endType();