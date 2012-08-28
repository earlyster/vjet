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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5103') //< public
.needs('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5000')
.props({
        //>public void load(String psUrl)
        load : function(psUrl) {
            var a = org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5000,
            b = false;
        },
        
        foo: function(){
        	var json = {name : 'Raja'}, t1 = this, a; 
            var t2 = this, ab;
            var t3 = this;
            var abc, t4=this;
        }
})
.endType();


