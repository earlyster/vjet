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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug7928')
.props({                     
}) 
.protos({
    //> public void constructs()
    //> public void constructs(long value)
    //> public void constructs(String s)
    constructs:function(){
        if(arguments.length===1){
            if(typeof arguments[0]=="number"){
                this.constructs_1_0_Long_ovld(arguments[0]);
            }else if(arguments[0] instanceof String || typeof
arguments[0]=="string"){
                this.constructs_1_1_Long_ovld(arguments[0]);
            }
        }
    },
    //> private void constructs_1_0_Long_ovld(long value)
    constructs_1_0_Long_ovld:function(value){
    },
    //> private void constructs_1_1_Long_ovld(String s)
    constructs_1_1_Long_ovld:function(s){
    }

})
.endType();