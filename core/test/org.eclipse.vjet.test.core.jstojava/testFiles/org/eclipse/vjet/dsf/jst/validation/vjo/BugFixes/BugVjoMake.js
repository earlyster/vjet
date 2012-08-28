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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.BugVjoMake')
.protos({
	constructs:function(name, value){//<public constructs(String, int)
	},
	
	doIt: function(){//<public void doIt()
	}
})
.props({
    main: function(){
		var t = new this('default', 0);//<BugVjoMake
		
		var obj1 = vjo.make(t, t, 'name', 1)
					.protos({
						foo: function(){
							this.vj$.parent.doIt();
						}
					})
					.endType();
		var obj2 = vjo.make(t, t, 1, 'name')
					.protos({
					})
					.endType();
	}
})
.endType();