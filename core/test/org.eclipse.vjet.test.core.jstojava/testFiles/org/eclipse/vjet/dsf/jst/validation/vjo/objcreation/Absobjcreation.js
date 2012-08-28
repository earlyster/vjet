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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.objcreation.Absobjcreation") //<public abstract
.props({
  m: function(){
    var test = new this.vj$.Absobjcreation("100");//<Absobjcreation
  }
})
.protos({
  i_name:null, //< private String
  
  //> public void constructs(String p_name)
  constructs:function(p_name) {
	this.i_name = p_name;
  },
  
  //> public String getName()
  getName: function() {
    return this.i_name;
  }
 })
.endType();