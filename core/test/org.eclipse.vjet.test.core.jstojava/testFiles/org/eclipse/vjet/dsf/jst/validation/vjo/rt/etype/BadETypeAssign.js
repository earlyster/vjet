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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.rt.etype.ETypeAssign")
.needs('org.eclipse.vjet.dsf.jst.validation.vjo.rt.etype.BaseEType')
.props({
	
	f: function(){
		var one = this.vj$.BaseEType.ONE;//<org.eclipse.vjet.dsf.jst.validation.vjo.rt.etype.BaseEType
		this.vj$.BaseEType.ONE = null;
		this.vj$.BaseEType.TWO.prop = 100;
	}
	
})
.endType();