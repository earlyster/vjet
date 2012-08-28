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
vjo.ctype('syntax.global.globalMethods.GlobalMethods') //< public
.props({
    //> public void main(String... args)
    main:function(){
        vjo.sysout.println(decodeURI("String"));
        vjo.sysout.println(decodeURIComponent("String"));
        vjo.sysout.println(encodeURI("String"));
        vjo.sysout.println(encodeURIComponent("String"));
        vjo.sysout.println(escape("String"));
        vjo.sysout.println(isFinite(30));
        vjo.sysout.println(isNaN("String"));
        vjo.sysout.println(parseFloat("22.3"));
        vjo.sysout.println(parseInt("22"));
        vjo.sysout.println(unescape("22"));
        vjo.sysout.println(typeof "GlobalMethods");
        vjo.sysout.println(eval("GlobalMethods"));
    }
})
.endType();