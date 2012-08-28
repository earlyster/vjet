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
vjo.ctype('BugJsFiles.Bug6352') //< public
.props({
  //>public void main(String... args) 
  main : function(){
        var base = new this.vj$.Bug6352(); //< Bug6352
        base..iFunc();
  }
})
.protos({
        //>public void iFunc()
        iFunc : function(){

        }

})
.endType();