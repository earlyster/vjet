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
vjo.ctype('vjoPro.samples.foundations.Manager')
//snippet.inheritance.begin
.inherits('vjoPro.samples.foundations.Employee')
//snippet.inheritance.end
.protos({
project: undefined, //< public String

//> public void constructs(String project)
constructs : function (project)
{
this.base('Test_Name', 123);
this.project = project;
}
})
.endType();
