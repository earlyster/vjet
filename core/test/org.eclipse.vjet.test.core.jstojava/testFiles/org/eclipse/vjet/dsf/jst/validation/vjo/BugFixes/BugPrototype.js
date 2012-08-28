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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.BugPrototype')
.protos({

	toRemove: 100,
	
	foo: function(){
		Date.prototype.getTime();
		alert(this.toRemove);
		delete this.toRemove;
		alert(this.toRemove);
		delete this.vj$.BugPrototype.prototype.toRemove;
		alert(this.toRemove);
		
		
		alert(this.prototype);
		var fun = function(){};
		alert(fun.prototype);
	}
})
.endType();