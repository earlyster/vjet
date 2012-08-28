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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.jsnative.Dom')
.props({

	main: function(){
		var psId = "a"; //<String
		var d = document; //<HTMLDocument
		var e = d.getElementById(psId); 
        if (!e && d.all){
                e = d.all[psId];//<<HTMLElement
        }
        
        var s = e;//<<HTMLSelectElement;
        var b = s.options;
        var c = b.length;
	}
	
}).endType();