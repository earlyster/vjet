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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.javaone.MyJsType")
.protos({
 	m_index: 0, //<int
 	//>public void constructs(int)
 	constructs: function(index) {
 		this.m_index = index;
 	},
 	//>public void doit()
 	doit: function() {
 		alert(this.m_index);
 	}
})
.props({
	s_counter: 0, //<int
	//>public void update(boolean)
	update: function(increament) {
		alert(increament? this.s_counter++ : this.s_counter--);
	}
})
.endType();