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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.BugNestedWith')
.props({
	main: function(){
		var t = new this.vj$.BugNestedWith();//<BugNestedWith
		var conflict = 'bad';
		with(t){
			with(t){
				alert(conflict);
				alert(peace);
			}
		}
	}
})
.protos({
	conflict: 100, //<public int
	peace: 'peace'
})
.endType();