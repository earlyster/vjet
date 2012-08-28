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
vjo.ctype("org.eclipse.vjet.dsf.vjolang.feature.tests.bug5109")
.props({
        DO_IT: false,
        //> private zot(String f)
        zot: function(f) {
                if (!this.DO_IT) {
                        return null;
                }
                return null;
        },
        //> private foo()
        foo: function() {

        }
})
.endType();
