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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5061') //< public
.props({
        //> public void foo()
        foo: function() {
			var n1 = 1e23;
			var n2 = 2e22;
			var n3 = 1.6e24;
			
			alert(n1.toString());
			alert(n2.toString());
			alert(n3.toString());
        }
})
.endType();
