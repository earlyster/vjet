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
vjo.ctype("vjoPro.samples.js.Employee")
.protos({
name:undefined, //< public String
empId:0, //< public int

//> public void constructs(String name, int empId)
constructs:function(name, empId) {
this.name = name;
this.empId = this.empId;
}
})
.endType();
