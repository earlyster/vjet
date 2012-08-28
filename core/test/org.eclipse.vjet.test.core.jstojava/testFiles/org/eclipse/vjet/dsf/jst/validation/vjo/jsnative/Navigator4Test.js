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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.jsnative.Navigator4Test')
.props({
        //>public void foo() 
        foo : function(){
                var n = navigator; //<Navigator
                var pd, id, swf = "Shockwave Flash",v;
            if (n.plugins[swf]) 
            {
                    pd = n.plugins[swf].description;
                    id = pd.indexOf("Flash")+5;
                        v = parseInt(pd.substr(id,pd.length));
            }
        }      
})
.endType();
