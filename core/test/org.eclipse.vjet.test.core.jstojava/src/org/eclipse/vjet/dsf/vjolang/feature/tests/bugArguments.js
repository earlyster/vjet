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
vjo.ctype('com.ebay.test.validation.TestTest') //< public
.props({
        //>public void main(String... args) 
        main : function(){
                vjo.sysout.print(this.testFunc1("Hello!!"));
        },
        //>protected String testFunc1(String str)
        testFunc1 : function(str){
                vjo.sysout.println(arguments);
                vjo.sysout.println(arguments.length);
                vjo.sysout.println(arguments.callee);
                vjo.sysout.println(arguments.caller);
                return str;
        }
})
.endType();
