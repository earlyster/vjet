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
vjo.ctype('bugs.b1060.Bug1060') //< public
.needs('bugs.b1060.DaysEnum')
.props({
  
})
.protos({
  //>public void foo() 
  foo : function(){
	vjo.sysout.println(this.vj$.DaysEnum.WED.name);
  	this.vj$.DaysEnum.WED = null;
  	vjo.sysout.println(this.vj$.DaysEnum.WED.name);
  }
})
.endType();