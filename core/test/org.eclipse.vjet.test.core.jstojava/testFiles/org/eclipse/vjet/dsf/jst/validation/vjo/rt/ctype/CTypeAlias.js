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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.rt.ctype.CTypeAlias")
.needs("org.eclipse.vjet.dsf.jst.validation.vjo.rt.ctype.UtilCType","UC")
.props({
	main:function(){
		var ucObj = new this.vj$.UC();//<UC
		ucObj.callUtil();
		
		this.vj$.UC.callUtilStatic();
		return -1;
	}
})
.endType();