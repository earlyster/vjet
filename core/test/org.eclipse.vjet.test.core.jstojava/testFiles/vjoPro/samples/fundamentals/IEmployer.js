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
vjo.itype('vjoPro.samples.fundamentals.IEmployer')
//snippet.inheritance.begin
.inherits('vjoPro.samples.fundamentals.IBase')
//snippet.inheritance.end
.protos({
//> public int getEmpId()
getEmpId : function(){},

//> public String getName()
getName : function(){}
})
.props({
employername : 'eBay', //< public String
employerzipcode : 95125 //< public int
})
.endType();
