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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.clz.InnerClass") //< public
.props({
        MyCache: vjo.ctype() //< private
        .props({
                cache: null //< final Array
        })
        .protos({
                //> private constructs()
                constructs: function() {
                        // empty
                        
                }
        })
        .inits(function(){
                this.cache = vjo.createArray(null, -(-128)+127+1);
                //{bugfix by roy, block stmt isn't supported by parser
                        for (var i=0; i < this.cache.length; i++) {
                                this.cache[i] = i-128;
                        }
                //}
        })
        .endType(),
        
        main: function(){
             for (var i=0; i < this.MyCache.cache.length; i++) {
                     alert(this.MyCache.cache[i]);
             }
        }
})
.endType();
