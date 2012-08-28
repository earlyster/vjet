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
vjo.itype('engine.IShopping') //< public
.needs('engine.ShoppingItem')
.protos({
    //> public boolean sell(ShoppingItem sellItem)
    sell:function(sellItem){
    },
    //> public boolean buy(ShoppingItem buyItem)
    buy:function(buyItem){
    }
})
.endType();
