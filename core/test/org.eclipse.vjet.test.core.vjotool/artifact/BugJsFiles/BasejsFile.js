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
vjo.ctype('BugJsFiles.BasejsFile') //< public
.props({
        staticProp1: 10,//<int
        staticProp2 : "test",//<String

    sampleJsMethod : function(){ //< public String sampleJsMethod()
        return this.staticProp2;
    }
})
.protos({
        instanceProp1 : 10,//<int
        instanceProp2 : "Test",//<String

        over : function(){ //< public String over()
                return "";
        }

})
.endType();