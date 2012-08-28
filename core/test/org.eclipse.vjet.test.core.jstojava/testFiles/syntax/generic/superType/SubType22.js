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
vjo.ctype('syntax.generic.superType.SubType22<K, V>') //< public
//>needs(syntax.generic.Set)
//>needs(syntax.generic.SortedMap)
.props({
})
.protos({
	//> public <K,V> UnmodifiableSortedMap unmodifiableSortedMap(SortedMap<K,? extends V> m)
  unmodifiableSortedMap:function(m){
      return new this.UnmodifiableSortedMap(m); //<UnmodifiableSortedMap<K,V>
  },   
	
	UnmodifiableSortedMap:vjo.ctype() //< public UnmodifiableSortedMap<K,V>
  .props({  
  })
  .protos({   
      sm:null, //< private SortedMap<K,? extends V> sm
      //> constructs(SortedMap<K,? extends V> m)
      constructs:function(m){
          this.sm=m;
      } 
  })
  .endType()
}) 
.endType(); 