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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.syntax.Syntax') //< public
.needs("org.eclipse.vjet.dsf.jst.validation.vjo.syntax.INoExist")
.needs("org.eclipse.vjet.dsf.jst.validation.vjo.syntax.CNoExist")
.needs("org.eclipse.vjet.dsf.jst.validation.vjo.syntax.MNoExist")
.satisfies("org.eclipse.vjet.dsf.jst.validation.vjo.syntax.INoExist")
.inherits("org.eclipse.vjet.dsf.jst.validation.vjo.syntax.CNoExist")
.mixin("org.eclipse.vjet.dsf.jst.validation.vjo.syntax.MNoExist")
.protos({
    //> Number a()
    a:function(){
        return 10;
    },
    
    //>C b()
	b:function(){
		return null;
	}
})
.props({
	p : "constant"
})
.endType();