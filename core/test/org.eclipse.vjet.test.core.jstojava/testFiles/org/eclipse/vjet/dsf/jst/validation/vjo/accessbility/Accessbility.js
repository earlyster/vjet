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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.accessbility.Accessbility')
.protos({
	a:function(){//<public void a()
		this.b();
	}
})
.props({
	b:function(){//<public void b()
		this.vj$.Accessbility.a();
	}
})
.inits(function(){})
.endType();