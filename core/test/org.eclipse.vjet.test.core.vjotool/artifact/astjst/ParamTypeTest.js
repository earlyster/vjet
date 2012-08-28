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
vjo.ctype('astjst.ParamTypeTest<T,S>') //< public
.props({
    testStrInt:null, //< ParamTypeTest<String,Number> testStrInt
    testStrStr:null, //< ParamTypeTest<String,String> testStrStr
	//> public void main(String[] args)
	main:function(args){
	    this.testStrInt=new this("Abc",10);
	    this.testStrStr=new this("PQR","LMN");
	}
})
.protos({
	first:null, //< private T
	second:null, //< private S
	//> public constructs(T f,S s)
	constructs:function(f,s){
	    this.first=f;
	    this.second=s;
	}
})
.endType();