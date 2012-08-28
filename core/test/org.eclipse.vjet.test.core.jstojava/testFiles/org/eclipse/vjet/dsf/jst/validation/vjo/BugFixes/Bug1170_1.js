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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug1170_1') //< public
.needs('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug1170_Enum')
.props({
	E1 : vjo.etype().values("HA, BA").endType(),
	E2 : vjo.etype().values("JA, BLAH").endType(),
	getDay : function(){
	        return this.vj$.Bug1170_Enum.SUNDAY;
	}
})
.endType();
