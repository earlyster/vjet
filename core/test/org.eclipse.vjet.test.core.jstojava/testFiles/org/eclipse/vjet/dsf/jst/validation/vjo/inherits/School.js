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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.inherits.School")
.needs(["org.eclipse.vjet.dsf.jst.validation.vjo.inherits.Child","org.eclipse.vjet.dsf.jst.validation.vjo.inherits.parent"])
.props({
	//> public void main(String... args)
	main: function(){
		var child = new this.vj$.Child(); //<Child
		child.sayIt2();
	}
	
})
.endType();