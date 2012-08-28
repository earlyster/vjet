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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.jsnative.AnonymousFunction')
.props({
       //>public void foo() 
        foo : function(){
                function bar(){alert("Hello");};
                bar();
        },
        
        //>public void foo2()
        foo2 : function(){
        	function bar2(name){this.name = name;};
        	var bar2Obj = new bar2('Raja');
        }
})
.endType();
