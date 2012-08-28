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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8028')
.props({
	
	staticOuterProp:"Test",//<String
	
	//> public String outerStaticFunc()
	outerStaticFunc:function(){
		vjo.sysout.println(this.staticOuterProp);
		return "";
	},
	
	innerStaticMixin : vjo.mtype().props({
		msStaticProp1 : 10, //<int
		msStaticProp2 : "Test" //<String
	}).endType(),
	
	InnerCType: vjo.ctype().mixin('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8028.innerStaticMixin').protos({
		innerCtypeFunc: function(){//<public void innerCtypeFunc()
		}
	}).endType()
})
.endType();