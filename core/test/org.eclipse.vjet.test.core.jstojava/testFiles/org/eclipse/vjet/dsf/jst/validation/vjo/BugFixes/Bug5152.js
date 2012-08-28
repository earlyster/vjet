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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5152') //< public
.needs(['org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5152CType'])
//>needs org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5152IType
.props({
        //> public void main()
        main: function() {
        	var test = new this.vj$.Bug5152CType(); //< Bug5152IType
        	test.foo();
        }
})
.endType();
