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
vjo.ctype('BugJsFiles.Bug6242_Super') //< public
.props({
    staticProp1: 10, //< public int
    staticProp2: 10, //< protected int
    staticProp3: 10, //< private int
    staticProp4: 10, //< int

    sampleJsMethod : function(){ //< public int sampleJsMethod()
        return this.staticProp2;
    }
})
.endType();

