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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5296")
.props({
		oCache: {},
        add: function(pJson) {
	        try {
	            var t = this, kw = pJson[0], kwList = pJson[1], laList = pJson[2], cacheItem = t.oCache[kw];
	            // process lookahead data
	            if (laList !== null) {
	                for (var i=0;i < laList.length; i++) {
	                    
	                }
	            }
	        } 
	        catch(e) {
	        }
	    }
})
.endType();
