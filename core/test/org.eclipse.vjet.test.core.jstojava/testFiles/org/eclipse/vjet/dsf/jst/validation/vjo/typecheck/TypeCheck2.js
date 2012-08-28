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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.TypeCheck2') //< public
.protos({

    sth:0,//<Number
    //> Number a()
    a:function(){
        var x=10;//<Number
        x="String";
        
        var c;//<String
        c=this.b();//<<String
        
        this.sth = 100;//should be acceptable
        this.sth++;
        
        var str = this.sth + "this is going to be a string";
        str += "append";
        str = "cleaned up";
        
        var localType = vjo.ctype("localType").props({}).endType();//<<
        var localTypeObj = new localType();
        
        var objLiteral = {name:'value'};
       	str = objLiteral.toString();
        
    },
    
    //> TypeCheck2 b()
	b:function(){
		return new this.vj$.TypeCheck2();
	},
	
	//> TypeCheck2 m()
	m: function(){
		return null;
	}
})
.endType();