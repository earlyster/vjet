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
vjo.ctype('engine.GenericShopping') //< public abstract
.needs(['vjo.java.util.List','vjo.java.util.ArrayList',
    'engine.ShoppingItem','engine.ShoppingCategory'])
.protos({
    electronicsList:null, //< private List<ShoppingItem> electronicsList
    motorList:null, //< private List<ShoppingItem> motorList
    //> private constructs()
    constructs:function(){
        this.electronicsList=new this.vj$.ArrayList();
        this.motorList=new this.vj$.ArrayList();
    },
    //> public boolean sellOnEbay(ShoppingItem sellItem)
    sellOnEbay:function(sellItem){
        var category=sellItem.getItemCategory();
        if(category===this.vj$.ShoppingCategory.ELECTRONICS){
            this.electronicsList.remove(sellItem);
        }
        if(category===this.vj$.ShoppingCategory.MOTORS){
            this.motorList.remove(sellItem);
        }
        return true;
    },
    //> public boolean buyOnEbay(ShoppingItem buyItem)
    buyOnEbay:function(buyItem){
        var category=buyItem.getItemCategory();
        if(category===this.vj$.ShoppingCategory.ELECTRONICS){
            this.electronicsList.add(buyItem);
        }
        if(category===this.vj$.ShoppingCategory.MOTORS){
            this.motorList.add(buyItem);
        }
        return true;
    },
    //> public List<ShoppingItem> getElectronicsList()
    getElectronicsList:function(){
        return this.electronicsList;
    },
    //> public void addElectronicsList(ShoppingItem item)
    addElectronicsList:function(item){
        this.electronicsList.add(item);
    },
    //> public List<ShoppingItem> getMotorList()
    getMotorList:function(){
        return this.motorList;
    },
    //> public void addMotorList(ShoppingItem item)
    addMotorList:function(item){
        this.motorList.add(item);
    }
})
.endType();
