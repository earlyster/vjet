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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.ex.ValidationEx5') //< public abstract
.protos({
    age:0, //< private int
    m_mother:undefined, //< private String
    grow:null,
    //> public constructs(String mother)
    constructs:function(mother){
		this.grow = "sth";    
        this.m_mother=mother;
        this.age = 10;
    }
})
.endType();