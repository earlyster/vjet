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
vjo.ctype('aa.sytyperefs.AEx') //< public
.needs('aa.sytyperefs.A')
.props({
	main: function(args) { //< public void main(String[]) {
		var A = this.vj$.A ; //< Type::A
		if (A.foo){
		}
	}
})
.endType();
