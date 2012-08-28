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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5349")
.props({
        msg : "Hello World",
        //> public void init()
        init : function(){
                String.prototype.isAny = function ()
                {
                        var a = arguments, l = a.length, rv = false, aL;
                        for (var i=0; i<l && !rv; i++)
                        {
                                if (typeof(a[i]) == "string"){
                                        rv = (this == a[i]);
                                }
                                else{
                                        //It's an array (of strings)
                                        aL = a[i].length;
                                        for (var j=0; j<aL && !rv; j++){
                                                rv = (this == a[i][j]);
                                        }
                                }
                        }
                        return rv;
                };
        }
})
.endType();
