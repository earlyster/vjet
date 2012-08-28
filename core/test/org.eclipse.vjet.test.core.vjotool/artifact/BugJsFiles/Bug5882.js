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
vjo.ctype('BugJsFiles.Bug5882') //< public
.inherits('BugJsFiles.BasejsFile')
.props({
        RR : "T" //<String
})
.protos({
    prop1 : 10, //< int
    prop2 : "Test", //< String

    testFunc : function(){//<public String testFunc()
        this.base.
        return "";
    }
})
.endType();