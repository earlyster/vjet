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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6310")
.needs("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6310IType")
.needs("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6310MType")
.props({
	main: function(){
		var itype = new this.vj$.Bug6310IType();
		var mtype = new this.vj$.Bug6310MType();
	}
})
.endType();