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
vjo.ctype('syntax.mixintype.Employee5')
.mixin('syntax.mixintype.Person')
.props({
    //> public void main(String[] args)
    main : function(args)
    {
    	this.vj$.Employee5.doIt1();
    	var emp = new this.vj$.Employee5();//<Employee5
		//snippet.mixin.begin
		//snippet.mixin.end
    	emp.doIt2();//doIt is defined in Person
    }
})
.endType();
