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
vjo.ctype('syntax.generic.superType.SubType21<T>') //< public
//>needs(syntax.generic.Set)
.props({
})
.protos({
	//>public void test(Set<? extends T>) 
	test : function(v){
		var s = null;//<Set<? extends T>
		new this.UnmodifiableCollection(v);
	},
	
	UnmodifiableCollection:vjo.ctype() //< public UnmodifiableCollection<E>
    .props({
    })
    .protos({
        c:null, //< Set<? extends E> 
        //> constructs(Set<? extends E> )
        constructs:function(c){
            if(c===null){
            }
            this.c=c;
        }
    })
    .endType()
}) 
.endType();