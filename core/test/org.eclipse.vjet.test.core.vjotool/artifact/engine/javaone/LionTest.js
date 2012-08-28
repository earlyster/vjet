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
vjo.ctype('<<28>>engine.javaone.LionTest') //< public
.inherits('<<29>>engine.javaone.Cat')
.protos({
    //> public constructs(String name, double weight, boolean male)
    constructs:function(name, weight, male){
    	<<30>>this.<<31>>base(name, weight, male);
        this.<<32>>m_gene=56;
    }
})
.endType();