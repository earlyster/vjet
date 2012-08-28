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
<<0>>vjo<<1>>.<<2>>itype('<<3>>engine<<4>>.<<5>>IShoppingTest') //< public
.<<6>>needs('<<7>>engine<<8>>.<<9>>ShoppingItem')
.<<10>>protos({
    //> public boolean sell(ShoppingItem sellItem)
    <<11>>sell<<12>>:<<13>>function(sellItem){<<14>>
    },
    //> public boolean buy(ShoppingItem buyItem)
    buy:function(buyItem){
    }
})
<<15>>.<<16>>endType();