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
vjo.ctype('BugJsFiles.Bug9096') //< public
.needs('BugJsFiles.BasejsFile')
.protos({
	E:null,  
	
	E1: BugJsFiles.BasejsFile.sampleJsMethod, //<Function

    //>public constructs()
    constructs : function(){
            this.E = null;
    },

    //>public void func() 
    func : function(){
            var s = this.E("fd");  
            var s1 = this.E1();
    }

})
.endType();
