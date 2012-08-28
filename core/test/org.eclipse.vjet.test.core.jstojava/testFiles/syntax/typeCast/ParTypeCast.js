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
vjo.ctype('syntax.typeCast.ParTypeCast') //< public
.needs('syntax.typeCast.DeclarationTypeCast')
.protos({
    
    //>public void foo(ParTypeCast) 
    foo : function(t1){
    	
    },
    
    //>public void foo2() 
    foo2 : function(){
    	this.foo(new this.vj$.DeclarationTypeCast()/*<<ParTypeCast*/);
    }


}).endType();
